grammar Lua;

@members {
   public static String grupo="<RAs dos membros do grupo>";
}


eval
    : codigo EOF
    ;

codigo
    : stat* retorno?
    ;

stat
    : ';'
    | varlist '=' listaExpr
    | functioncall
    | label
    | 'break'
    | 'goto' NAME
    | 'do' codigo 'end'
    | 'while' exp 'do' codigo 'end'
    | 'repeat' codigo 'until' exp
    | 'if' exp 'then' codigo ('elseif' exp 'then' codigo)* ('else' codigo)? 'end'
    | 'for' NAME '=' exp ',' exp (',' exp)? 'do' codigo 'end'
    | 'for' namelist 'in' listaExpr 'do' codigo 'end'
    | 'function' funcname funcbody
    | 'local' 'function' NAME funcbody
    | 'local' namelist ('=' listaExpr)?
    ;

retorno
    : 'return' listaExpr? ';'?
    ;

label
    : '::' NAME '::'
    ;

funcname
    : NAME ('.' NAME)* (':' NAME)?
    ;

varlist
    : var (',' var)*
    ;

namelist
    : NAME (',' NAME)*
    ;

listaExpr
    : exp (',' exp)*
    ;

exp
    : 'nil' | 'false' | 'true'
    | NUMERAL
    | LITERAL_STRING
    | functiondef
    | '...'
    | prefixexp
    | exp opLogica exp
    | exp opComparacao exp
    | exp opBin exp
    | <assoc=right> exp opConcat exp
    | exp opSomaSub exp
    | exp opDivMult exp
    | <assoc=right> opUnario exp
    | <assoc=right> exp opPower exp
    ;

opLogica : 'or'|'and';
opComparacao: '<' | '>' | '<=' | '>=' | '~=' | '==' ;
opBin: '|'|'~'|'&'|'<<'| '>>';
opSomaSub : '+'|'-';
opDivMult:  '*' | '/' | '//' | '%';
opConcat : '..';
opUnario : 'not' | '#' | '-' | '~';
opPower : '^';

//
prefixexp
    : varOrExp nameAndArgs*
    ;

functioncall
    : prefixexp nameAndArgs+
    ;

varOrExp
    : var | '(' exp ')'
    ;

var
    : (NAME | '(' exp ')' varSuffix) varSuffix*
    ;

varSuffix
    : nameAndArgs* ('[' exp ']' | '.' NAME)
    ;

nameAndArgs
    : (':' NAME)? args
    ;

args: '(' listaExpr? ')' | tableconstructor | LITERAL_STRING;


//https://www.lua.org/manual/5.3/manual.html#3.4.
functiondef: 'function' funcbody;
funcbody: '(' parlist? ')' codigo 'end' ;
parlist: namelist (',' '...')? | '...';

// https://www.lua.org/manual/5.3/manual.html#3.4.9
tableconstructor : '{' fieldlist? '}';
fieldlist: field (fieldsep field)* fieldsep?;
field: '[' exp ']' '=' exp | NAME '=' exp | exp;
fieldsep : ',' | ';';



NUMERAL
    : INT | HEX | FLOAT
    ;


LITERAL_STRING
    : EscapedLITERAL_STRING;

// LEXER

NAME: [a-zA-Z_][a-zA-Z_0-9]*;

// NEM DEUS SABE COMO ISSO FUNCIONA https://stackoverflow.com/questions/29800106/how-do-i-escape-an-escape-character-with-antlr-4
EscapedLITERAL_STRING
    : '"'      (Escape | '""'   | ~["])* '"'
    | '\''     (Escape | '\'\'' | ~['])* '\''
    | '\u201C' (Escape | .)*? ('\u201D' | '\u2033')   // smart quotes
    ;

fragment Escape
    : '\u0060\''    // backtick single-quote
    | '\u0060"'     // backtick double-quote
    ;


INT
    : Digit+
    ;

HEX
    : '0' ('x'|'X') DigitoHex+
    ;

fragment
Digit
    : [0-9]
    ;

fragment
DigitoHex
    : Digit | ('A'..'F') | ('a'..'f')
    ;

FLOAT
     :   Digit+ '.' Digit* EXPOENTE?
     ;
fragment
EXPOENTE
     : ('e'|'E') ('+'|'-')? Digit+
     ;
COMMENT
    : '--[' LITERAL_STRING ']' -> channel(HIDDEN)
    ;
    
LINE_COMMENT
    : '--'
    (                                               // --
    | '[' '='*                                      // --[==
    | '[' '='* ~('='|'['|'\r'|'\n') ~('\r'|'\n')*   // --[==AA
    | ~('['|'\r'|'\n') ~('\r'|'\n')*                // --AAA
    ) ('\r\n'|'\r'|'\n'|EOF)
    -> channel(HIDDEN)
    ;
    
WHITESPACE  
    : [ \t\u000C\r\n]+ -> skip
    ;
