grammar JurjenLang ;
startRule: globalscope EOF ;

globalscope     : (func | stat)*
                ;

func        : func_def scope        ;
func_def    : FUNC_KW IDENTIFIER    ;
func_return : FUNC_RET retstat      ;
func_call   : IDENTIFIER PAR_OPEN PAR_CLOSE     ;

scope   : BRACK_OPEN stats func_return? BRACK_CLOSE ;

stats   : stat*     ;
stat    : assignment
        | debugtools
        | ifchain
        | assertion
        | whileloop
        | func_call
        ;

debugtools      : printstat
                | printscopestat
                ;

printscopestat  : PRINTSCOPE_KW         ;
printstat   : PRINT_KW expr=assignable  ;
retstat     : expr = assignable         ;

whileloop   : WHILE_KW expr=bool_e scope     ;

ifchain     : ifchain_if=ifstat ifchain_elifs=elifstat_chain ifchain_else=maybe_elsestat  ;
ifstat      : IF_KW expr=bool_e scope        ;
elifstat_chain  : (elifstat)*                ;
elifstat    : ELIF_KW expr=bool_e scope      ;
maybe_elsestat  : (elsestat)?                ;
elsestat    : ELSE_KW scope                  ;

assertion   : ASSERT_KW expr=bool_e          ;

assignment  : name=variable ASSIGN ass=assignable    ;

assignable  : expr=e                        # assignable_expression
            | expr=bool_e                   # assignable_bool_expression
            ;

e   : PAR_OPEN expr=e PAR_CLOSE             # e_parentheses
    | expr=e operator=SYMB_EXCLM            # e_factorial
    | left=e operator=SYMB_HAT right=e      # e_exponent
    | left=e operator=SYMB_STAR right=e     # e_multiply
    | left=e operator=SYMB_SLASH right=e    # e_division
    | left=e operator=SYMB_PLUS right=e     # e_addition
    | left=e operator=SYMB_MINUS right=e    # e_subtraction
    | SYMB_MINUS expr=e                     # e_negation
    | name=variable                         # e_variable
    | value=any_value                       # e_any_value
    ;

bool_e  : PAR_OPEN bool_expr=bool_e PAR_CLOSE                   # bool_parentheses
        | left=bool_e AND_KW right=bool_e                       # bool_e_and
        | left=bool_e OR_KW right=bool_e                        # bool_e_or
        | NOT_KW bool_expr=bool_e                               # bool_e_not
        | left=e oper=comparison right=e                        # bool_e_expressions
        | left=bool_e oper=bool_comparison right=bool_e         # bool_e_expressions_bools
        | value=boolean                                         # bool_e_boolean
        | name=variable                                         # bool_e_variable
        ;

boolean     : TRUE_KW   # boolean_true
            | FALSE_KW  # boolean_false
            ;

comparison      : EQUALS
                | ISNOT
                | LESSTHAN
                | LESSEQUALS
                | MORETHAN
                | MOREEQUALS
                ;

bool_comparison : EQUALS
                | ISNOT
                ;

variable    : IDENTIFIER ;
float_type  : SYMB_MINUS? pre_nrs=NUMBERS SYMB_DOT post_nrs=NUMBERS FLOAT_IDENT         # float_by_dot_and_ident
            | SYMB_MINUS? pre_nrs=NUMBERS SYMB_DOT post_nrs=NUMBERS                     # float_by_dot
            | SYMB_MINUS? pre_nrs=NUMBERS FLOAT_IDENT                                   # float_by_ident
            | SYMB_MINUS? SYMB_DOT post_nrs=NUMBERS                                     # float_no_prior_by_dot
            | SYMB_MINUS? SYMB_DOT post_nrs=NUMBERS FLOAT_IDENT                         # float_no_prior_by_dot_and_ident
            ;

integer     : (SYMB_MINUS)? NUMBERS                     ;
string      : SYMB_DQUOTE IDENTIFIER SYMB_DQUOTE        ;

any_value   : float_type
            | integer
            | string
            ;

NUMBERS : DIGIT+ ;

FUNC_KW         : 'func'            ;
FUNC_RET        : 'return'          ;
PRINTSCOPE_KW   : 'printscope'      ;
PRINT_KW        : 'print'           ;
ASSERT_KW       : 'assert'          ;

IF_KW       : 'if'      ;
ELIF_KW     : 'elif'    ;
ELSE_KW     : 'else'    ;
WHILE_KW    : 'while'   ;

TRUE_KW     : 'true'    ;
FALSE_KW    : 'false'   ;

AND_KW      : 'and'     ;
OR_KW       : 'or'      ;
NOT_KW      : 'not'     ;

EQUALS          : '=='  ;
ISNOT           : '!='  ;
LESSEQUALS      : '<='  ;
MOREEQUALS      : '>='  ;
LESSTHAN        : '<'   ;
MORETHAN        : '>'   ;
SYMB_EXCLM      : '!'   ;
SYMB_HAT        : '^'   ;
SYMB_STAR       : '*'   ;
SYMB_SLASH      : '/'   ;
SYMB_PLUS       : '+'   ;
SYMB_MINUS      : '-'   ;
SYMB_QUOTE      : '\''  ;
SYMB_DQUOTE     : '"'   ;
SYMB_DOT        : '.'   ;
FLOAT_IDENT     : 'f'   ;
ASSIGN          : '='   ;
PAR_OPEN        : '('   ;
PAR_CLOSE       : ')'   ;
BRACK_OPEN      : '{'   ;
BRACK_CLOSE     : '}'   ;
IDENTIFIER      : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*   ;
WS              : [ \t\r\n]+ -> skip    ;

fragment DIGIT  : '0' .. '9'    ;
fragment BIT    : '0' .. '1'    ;