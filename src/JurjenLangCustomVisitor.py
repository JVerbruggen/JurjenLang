from antlr4 import *
from antlr_python.JurjenLangParser import JurjenLangParser
from antlr_python.JurjenLangVisitor import JurjenLangVisitor
from src.values.JLInteger import *
from src.values.JLFloat import *
from src.values.JLString import *
from src.values.IValue import *
from src.scope.ScopeStack import *
from src.scope.Scope import *
from src.scope.Returner import *
from src.variable.Function import *
from src.variable.FunctionReference import *
from src.scope.Debugger import *
from src.expression.NumericalExpression import *
from src.expression.BooleanExpression import *
from src.antlr_parsing.ChildParser import *

class JurjenLangCustomVisitor(JurjenLangVisitor):
    def __init__(self):
        self.scope_stack = ScopeStack()
        self.debug = Debugger(r_enabled=False, p_enabled=False)

    # Types
    def visitInteger(self, ctx:JurjenLangParser.IntegerContext):
        nr_pos = ctx.getChildCount()-1
        val = IntParser.parse(ctx.getChild(0))
        
        if nr_pos == 1:
            val = -val
        return JLInteger(val)
    
    def visitString(self, ctx:JurjenLangParser.StringContext):
        val = StringParser.parse(ctx.getChild(0))
        val = val[1:-1]
        val = val.replace("\\n", "\n")
        val = val.replace("\\\"", "\"")
        return JLString(val)
    
    def _float_logic(self, ctx, child_count_check, do_pre=True, do_post=True, pre_nrs_loc=0, post_nrs_loc=2):
        children_count = ctx.getChildCount()
        mult = 1
        if children_count == child_count_check:
            pre_nrs_loc += 1
            post_nrs_loc += 1
            mult = -1
        
        pre = None
        post = None
        if do_pre:
            pre = ctx.getChild(pre_nrs_loc)
        if do_post:
            post = ctx.getChild(post_nrs_loc)
        
        val = FloatParser.parse(pre, post) * mult
        return JLFloat(val)

    def visitFloat_by_dot_and_ident(self, ctx:JurjenLangParser.Float_by_dot_and_identContext):
        return self._float_logic(ctx, 5)

    def visitFloat_by_dot(self, ctx:JurjenLangParser.Float_by_dotContext):
        return self._float_logic(ctx, 4)

    def visitFloat_by_ident(self, ctx:JurjenLangParser.Float_by_identContext):
        return self._float_logic(ctx, 4, do_post=False)
    
    def visitFloat_no_prior_by_dot(self, ctx:JurjenLangParser.Float_no_prior_by_dotContext):
        return self._float_logic(ctx, 3, do_pre=False, post_nrs_loc=1)

    def visitFloat_no_prior_by_dot_and_ident(self, ctx:JurjenLangParser.Float_no_prior_by_dot_and_identContext):
        return self._float_logic(ctx, 4, do_pre=False, post_nrs_loc=1)


    # Printing
    def visitPrintstat(self, ctx:JurjenLangParser.PrintstatContext):
        e = self.visit(ctx.expr)
        print(str(e))

    # Expressions
    def visitE_addition(self, ctx:JurjenLangParser.E_additionContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)

        return left + right

    def visitE_subtraction(self, ctx:JurjenLangParser.E_subtractionContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)

        return left - right

    def visitE_division(self, ctx:JurjenLangParser.E_divisionContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)

        return left / right

    def visitE_multiply(self, ctx:JurjenLangParser.E_multiplyContext):
        left = self.visit(ctx.left)     
        right = self.visit(ctx.right)    

        return left * right

    def visitE_exponent(self, ctx:JurjenLangParser.E_exponentContext):
        left = self.visit(ctx.left)     
        right = self.visit(ctx.right) 

        return left ** right
    
    def visitE_factorial(self, ctx:JurjenLangParser.E_factorialContext):
        expr = self.visit(ctx.expr)

        return expr.factorial()

    def visitE_parentheses(self, ctx:JurjenLangParser.E_parenthesesContext):
        expr = self.visit(ctx.expr)

        return expr
    
    def visitE_negation(self, ctx:JurjenLangParser.E_negationContext):
        expr = self.visit(ctx.expr)
        return expr.negate()

    # Boolean expressions
    def visitBoolean_true(self, ctx:JurjenLangParser.Boolean_trueContext):
        return JLBoolean(True)

    def visitBoolean_false(self, ctx:JurjenLangParser.Boolean_falseContext):
        return JLBoolean(False)

    def visitBool_e_and(self, ctx:JurjenLangParser.Bool_e_andContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)

        return left and right

    def visitBool_e_or(self, ctx:JurjenLangParser.Bool_e_orContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)

        return left or right

    def visitBool_e_not(self, ctx:JurjenLangParser.Bool_e_notContext):
        bool_expr = self.visit(ctx.bool_expr)

        return not bool_expr
    
    def visitBool_e_variable(self, ctx:JurjenLangParser.Bool_e_variableContext):
        name = self.visit(ctx.name)
        variable = self.scope_stack.latest().get_variable(name)
        return variable.value
    
    def visitBool_e_expressions(self, ctx:JurjenLangParser.Bool_e_expressionsContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        oper = self.visit(ctx.oper)

        return oper.result(left, right)
    
    def visitComparison(self, ctx:JurjenLangParser.ComparisonContext):
        op = str(ctx.getChild(0))

        if op == "==":      return EqualsExpressionNumerical()
        elif op == "!=":    return NotEqualsExpressionNumerical()
        elif op == "<":     return LessThanExpressionNumerical()
        elif op == "<=":    return LessEqualsExpressionNumerical()
        elif op == ">":     return MoreThanExpressionNumerical()
        elif op == ">=":    return MoreEqualsExpressionNumerical()
        
        raise NotImplementedError("Unknown numerical comparison")

    def visitBool_e_expressions_bools(self, ctx:JurjenLangParser.Bool_e_expressions_boolsContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        oper = self.visit(ctx.oper)

        return oper.result(left, right)

    def visitBool_comparison(self, ctx:JurjenLangParser.Bool_comparisonContext):
        op = str(ctx.getChild(0))

        if op == "==":
            return EqualsExpressionBoolean()
        elif op == "!=":
            return NotEqualsExpressionBoolean()

        raise NotImplementedError("Unknown boolean comparison")

    def visitBool_parentheses(self, ctx:JurjenLangParser.Bool_parenthesesContext):
        return self.visit(ctx.bool_expr)

    # Assignment
    def visitAssignment(self, ctx:JurjenLangParser.AssignmentContext):
        name = self.visit(ctx.name)
        assignable = self.visit(ctx.ass)

        variable = self.scope_stack.latest().get_variable(name)
        if variable is not None:
            variable.value = assignable
        else:
            self.scope_stack.latest().add_local_variable(Variable(name, assignable))

        return assignable
    
    def visitVariable(self, ctx:JurjenLangParser.VariableContext):
        return str(ctx.getChild(0))

    def visitE_variable(self, ctx:JurjenLangParser.E_variableContext):
        name = self.visit(ctx.name)
        variable = self.scope_stack.latest().get_variable(name)
        return variable.get_value()

    # Scope
    def _visit_scope_children(self, scopectx):
        returner = EmptyReturner()

        child_count = scopectx.getChildCount()
        for i in range(child_count):
            child = scopectx.getChild(i)
            # return detection
            res = self.visit(child)
            self.debug.r(f"SCOPECHILD: checking res={str(res)}({type(child)}) in context {str(scopectx)}")

            if Returner.is_returner(res):
                self.debug.r(f"SCOPECHILD: found returner {str(res)} in context {str(scopectx)}")
                returner = res
                break

        return returner
    
    def visitFunc_return(self, ctx:JurjenLangParser.Func_returnContext):
        retstat = self.visit(ctx.getChild(1))
        self.debug.r(f"FUNCRETURN: packing {repr(retstat)} into returner in context {ctx.getText()}")
        return Returner(retstat)

    def visitGlobalscope(self, ctx:JurjenLangParser.GlobalscopeContext):
        self.scope_stack.push()
        self._visit_scope_children(ctx) # Nothing is done with returned value in global scope
        self.scope_stack.pop()

    floating_scope_variables: list[IVariable] = None 
    scope_accepts_returner = False
    def visitScope(self, ctx:JurjenLangParser.ScopeContext):
        self.scope_stack.push()
        
        # Obtaining parameters to put in scope
        if self.floating_scope_variables is not None:
            scope = self.scope_stack.latest()
            for var in self.floating_scope_variables:
                adding_var = var
                if type(var) is FunctionReference:
                    func_name = var.get_value()
                    adding_var = scope.get_variable(func_name).renamed_clone(var.get_name())
                    self.debug.p(f"PARAM: REFERE {func_name}, change to func {adding_var}")
                scope.add_local_variable(adding_var)

            self.floating_scope_variables = None
        
        # Set unpacking returner mode
        this_scope_accepts_returner = False
        if self.scope_accepts_returner:
            self.debug.r(f"SCOPE: Will unpack returner in context: '{str(ctx)}'")
            this_scope_accepts_returner = True
            self.scope_accepts_returner = False

        # Call contents of scope
        returner = self._visit_scope_children(ctx)
        self.scope_stack.pop()

        # Unpack if return if in unpacking mode
        if this_scope_accepts_returner:
            self.debug.r(f"SCOPE: Unpacking {str(returner)} into {repr(returner.get_value())}")
            return returner.get_value()

        self.debug.r(f"SCOPE: Passing {str(returner)}")
        return returner
    
    def visitPrintscopestat(self, ctx:JurjenLangParser.PrintscopestatContext):
        scope = self.scope_stack.latest()
        print(str(scope))

    # If chains
    def visitIfchain(self, ctx:JurjenLangParser.IfchainContext):
        returned = self.visit(ctx.ifchain_if)
        if returned is not None: 
            self.debug.r(f"IFCHAIN: Returning {returned}")
            return returned

        returned = self.visit(ctx.ifchain_elifs)
        if returned is not None: return returned
        
        returned = self.visit(ctx.ifchain_else)
        return returned
    
    def visitElifstat_chain(self, ctx:JurjenLangParser.Elifstat_chainContext):
        children = ctx.getChildren()
        executed = False
        returned = None
        for child in children:
            ret = self.visit(child)
            if ret is not None:
                returned = ret
                break
        return returned

    def visitIfstat(self, ctx:JurjenLangParser.IfstatContext):
        bool_expr = self.visit(ctx.expr)

        if bool(bool_expr):
            res = self.visit(ctx.scope())
            # self.debug.r(f"IFSTAT: Returning {res}")
            return res
        
        return None

    def visitElifstat(self, ctx:JurjenLangParser.ElifstatContext):
        bool_expr = self.visit(ctx.expr)

        if bool_expr:
            self.visit(ctx.scope())
            return self.visit(ctx.scope())
        
        return None

    def visitStats(self, ctx:JurjenLangParser.StatsContext):
        for i in range(ctx.getChildCount()):
            res = self.visit(ctx.getChild(i))
            if Returner.is_returner(res):
                self.debug.r(f"STAT: found returner {res}")
                return res
        return None

    # While
    def visitWhileloop(self, ctx:JurjenLangParser.WhileloopContext):
        while self.visit(ctx.expr):
            self.visit(ctx.scope())

    # Assertions
    def visitAssertion(self, ctx:JurjenLangParser.AssertionContext):
        bool_expr = self.visit(ctx.expr)

        if not bool_expr:
            raise ValueError("Assertion Error!")
        
        return True

    # Functions
    floating_function_context = None

    def visitFunc(self, ctx:JurjenLangParser.FuncContext):
        self.floating_function_context = ctx.getChild(1)    # Scope, dont immediately execute, Floating_function_context is immediately used by the scope
        self.visit(ctx.getChild(0))                         # Function definition

    def visitFunc_def(self, ctx:JurjenLangParser.Func_defContext):
        func_name = str(ctx.getChild(1))
        func_params = [str(p) for p in ctx.getChild(2).getChildren()]

        function = Function(func_name, func_params, self.floating_function_context)
        self.floating_function_context = None

        self.scope_stack.latest().add_local_variable(function)

    def visitFunc_call(self, ctx:JurjenLangParser.Func_callContext):
        func_name = str(ctx.getChild(0))
        params = self.visit(ctx.getChild(2))

        latest_scope = self.scope_stack.latest()
        function = latest_scope.get_variable(func_name)
        if function is None or type(function) is not Function:
            raise ValueError(f"The function '{func_name}' does not exist")

        required_params = function.get_parameter_names()
        required_params_length = len(required_params)
        given_params_length = len(params) if params is not None else 0
        if required_params_length != given_params_length:
            raise ValueError(f"The function requires exactly {required_params_length} parameter" + ("s" if required_params_length != 1 else "") + f", while {given_params_length} " + ("were" if given_params_length != 1 else "was") +  " given")
        
        variables = list()
        for i in range(given_params_length):
            v_name = required_params[i]
            v_value = params[i]
            self.debug.p(f"PARAM: adding {v_name} val:({type(v_value)})")

            adding_var = Variable(v_name, v_value)
            if type(v_value) is FunctionReference:
                v_value.inscope_name = v_name
                adding_var = v_value
                
            self.debug.p(f"PARAM: adding={adding_var}")
            variables += [adding_var]

        self.floating_scope_variables = variables  # Communicating parameters to function scope
        self.scope_accepts_returner = True
        func_ref = function.get_value()
        returned = self.visit(func_ref)
        self.debug.r(f"FUNCCALL: Received {repr(returned)} from function {str(func_ref)}")
        return returned

    def _handle_param_child_and_visit(self, child):
        func_name = child.getText()
        self.debug.p(f"PARAM: potentialfunc={func_name}")

        visited_child = self.visit(child)
        returning_child = visited_child
        if not issubclass(type(visited_child), IValue):
            self.debug.p(f"PARAM: Detected Function!, with name {func_name}, inscope: {type(child)}")
            returning_child = FunctionReference(func_name)

        self.debug.p(f"PARAM: child={type(returning_child)}")
        return returning_child

    def visitFunc_call_params_single(self, ctx:JurjenLangParser.Func_call_params_singleContext):
        if ctx.getChildCount() == 0:
            return None
        return [self._handle_param_child_and_visit(ctx.getChild(0))]

    def visitFunc_call_params_multiple(self, ctx:JurjenLangParser.Func_call_params_multipleContext):
        params = list()
        childcount = ctx.getChildCount()
        
        i = 0
        while i < childcount:
            p = self._handle_param_child_and_visit(ctx.getChild(i))
            params += [p]
            i+=2

        return params