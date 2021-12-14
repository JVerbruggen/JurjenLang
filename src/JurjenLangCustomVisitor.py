from antlr4 import *
from antlr_python.JurjenLangParser import JurjenLangParser
from antlr_python.JurjenLangVisitor import JurjenLangVisitor
from src.values.JLInteger import *
from src.values.JLFloat import *
from src.values.JLString import *
from src.values.IValue import *
from src.scope.ScopeStack import *
from src.scope.Scope import *
from src.antlr_parsing.ChildParser import *

class JurjenLangCustomVisitor(JurjenLangVisitor):
    def __init__(self):
        self.scope_stack = ScopeStack()

    # Types
    def visitInteger(self, ctx:JurjenLangParser.IntegerContext):
        nr_pos = ctx.getChildCount()-1
        val = IntParser.parse(ctx.getChild(0))
        
        if nr_pos == 1:
            val = -val
        return JLInteger(val)
    
    def visitString(self, ctx:JurjenLangParser.StringContext):
        val = StringParser.parse(ctx.getChild(1))
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

        return left // right

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

    def visitBool_e_expressions(self, ctx:JurjenLangParser.Bool_e_expressionsContext):
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)

        return left == right

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
        return variable.value

    # Scope
    def visitScope(self, ctx:JurjenLangParser.ScopeContext):
        self.scope_stack.push()
        self.visitChildren(ctx) 
        self.scope_stack.pop()

    # If chains
    def visitIfchain(self, ctx:JurjenLangParser.IfchainContext):
        executed = self.visit(ctx.ifchain_if)
        if executed: return self

        executed = self.visit(ctx.ifchain_elifs)
        if executed: return self
        
        self.visit(ctx.ifchain_else)
        return self
    
    def visitElifstat_chain(self, ctx:JurjenLangParser.Elifstat_chainContext):
        children = ctx.getChildren()
        executed = False
        for child in children:
            executed = self.visit(child)
            if executed: break
        return executed

    def visitIfstat(self, ctx:JurjenLangParser.IfstatContext):
        bool_expr = self.visit(ctx.expr)

        if bool(bool_expr):
            self.visit(ctx.scope())
        
        return bool(bool_expr)

    def visitElifstat(self, ctx:JurjenLangParser.ElifstatContext):
        bool_expr = self.visit(ctx.expr)

        if bool_expr:
            self.visit(ctx.scope())
        
        return bool(bool_expr)

        
