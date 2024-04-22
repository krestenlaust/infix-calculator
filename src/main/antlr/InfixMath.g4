grammar InfixMath;

mainExpr : expr EOF;

expr
    : NUMBER
    | expr OP_FIRST expr
    | expr OP_SECOND expr
    ;

// First precedence operators
OP_FIRST
    : MULTIPLY
    | DIVIDE
    ;

// Second precedence operators
OP_SECOND
    : PLUS
    | MINUS
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
