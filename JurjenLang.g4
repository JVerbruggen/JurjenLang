grammar JurjenLang ;
startRule: func EOF ;

func        : func_def scope        ;
func_def    : FUNC_KW IDENTIFIER    ;
func_return : FUNC_RET retstat      ;

scope   : BRACK_OPEN stats func_return? BRACK_CLOSE ;

stats   : stat*     ;
stat    : assignment
        | printstat
        | ifchain
        ;

printstat   : PRINT_KW expr=assignable  ;
retstat     : expr = assignable         ;

ifchain     : ifchain_if=ifstat ifchain_elifs=elifstat_chain ifchain_else=maybe_elsestat  ;
ifstat      : IF_KW expr=bool_e scope        ;
elifstat_chain  : (elifstat)*                ;
elifstat    : ELIF_KW expr=bool_e scope      ;
maybe_elsestat  : (elsestat)?                ;
elsestat    : ELSE_KW scope                  ;

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

bool_e  : left=bool_e AND_KW right=bool_e   # bool_e_and
        | left=bool_e OR_KW right=bool_e    # bool_e_or
        | NOT_KW bool_expr=bool_e           # bool_e_not
        | left=e EQUALS right=e             # bool_e_expressions
        | value=boolean                     # bool_e_boolean
        | name=variable                     # bool_e_variable
        ;

boolean     : TRUE_KW   # boolean_true
            | FALSE_KW  # boolean_false
            ;

variable    : IDENTIFIER                ;
integer     : (SYMB_MINUS)? NUMBERS     ;
string      : SYMB_DQUOTE IDENTIFIER SYMB_DQUOTE ;

any_value   : integer
            | string
            ;

FUNC_KW     : 'func'    ;
FUNC_RET    : 'return'  ;
PRINT_KW    : 'print'   ;

IF_KW       : 'if'      ;
ELIF_KW     : 'elif'    ;
ELSE_KW     : 'else'    ;

TRUE_KW     : 'true'    ;
FALSE_KW    : 'false'   ;

AND_KW      : 'and'     ;
OR_KW       : 'or'      ;
NOT_KW      : 'not'     ;

NUMBERS         : DIGIT+    ;
IDENTIFIER      : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*   ;
SYMB_EXCLM      : '!'   ;
SYMB_HAT        : '^'   ;
SYMB_STAR       : '*'   ;
SYMB_SLASH      : '/'   ;
SYMB_PLUS       : '+'   ;
SYMB_MINUS      : '-'   ;
SYMB_QUOTE      : '\''  ;
SYMB_DQUOTE     : '"'   ;
ASSIGN          : '='   ;
EQUALS          : '=='  ;
PAR_OPEN        : '('   ;
PAR_CLOSE       : ')'   ;
BRACK_OPEN      : '{'   ;
BRACK_CLOSE     : '}'   ;
WS              : [ \t\r\n]+ -> skip    ;

fragment DIGIT  : '0' .. '9'    ;
fragment BIT    : '0' .. '1'    ;