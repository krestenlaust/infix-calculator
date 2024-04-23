grammar InfixMath;

mainExpr : expr EOF;

expr
    : OBRACE expr CBRACE
    | expr OP_FIRST expr
    | expr OP_SECOND expr
    | NUMBER
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

OBRACE : '(';
CBRACE : ')';

NUMBER
    : INTEGER
    ;

INTEGER : [0-9]+;

SPACE : [ ] -> skip;
