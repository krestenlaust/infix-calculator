grammar InfixMath;

expr
    : NUMBER
    | expr OP expr
    ;

OP
    : PLUS
    | MINUS
    | MULTIPLY
    | DIVIDE
    ;

PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';

OPAREN : '(';
CPAREN : ')';

NUMBER
    : INTEGER
    ;

INTEGER : [0-9]+;

SPACE : [ ] -> skip;