grammar Lua;

@members {
   public static String grupo="619680 619884 726549";
}

// Regra programa para funcionar no Corrigir.java
programa
    : eval
    ;
 
// Regra eval para funcionar no TestaAnalisadorSintatico.java
eval
    : codigo EOF
    ;

// Regra que define um código LUA. Uma sequência de declarações com uma possível declaração de retorno no final.
codigo
    : stat* retorno?
    ;

// Regra principal com todos os tipos de declarações em LUA.
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
    | 'for' NAME { TabelaDeSimbolos.adicionarSimbolo(($NAME.text),Tipo.VARIAVEL); } '=' exp ',' exp (',' exp)? 'do' codigo 'end'
    | 'for' namelist 'in' listaExpr 'do' codigo 'end'
    | functiondef
    | 'local' 'function' NAME funcbody
    | 'local' namelist ('=' listaExpr)?
    ;

// define o return, lembrando que return pode receber varias expressoes (ou nenhuma)
retorno
    : 'return' listaExpr? ';'?
    ;

// sintaxe definida aqui https://www.lua.org/manual/5.3/manual.html#3.3.4
// labels sao marcacoes no codigo usados pelo goto
label
    : '::' NAME '::'
    ;

// sintaxe definida aqui https://www.lua.org/manual/5.3/manual.html#3.3.11
funcname
    : NAME ('.' NAME)* (':' NAME)?
    ;

// Regra usada para definir listas de variaveis. É usada uma regra separada por
// que essa lista de varíaveis pode ser usada em vários casos, como por exemplo
// na atribuição multipla
varlist
    : var { TabelaDeSimbolos.adicionarSimbolo(($var.text),Tipo.VARIAVEL); } (',' var { TabelaDeSimbolos.adicionarSimbolo(($var.text),Tipo.VARIAVEL); })*
    ;

namelist
    : NAME { TabelaDeSimbolos.adicionarSimbolo(($NAME.text),Tipo.VARIAVEL); } (',' NAME { TabelaDeSimbolos.adicionarSimbolo(($NAME.text),Tipo.VARIAVEL); })*
    ;

listaExpr
    : exp (',' exp)*
    ;

// sintaxe definida aqui https://www.lua.org/manual/5.3/manual.html#3.4
// regra geral para expressoes do lua
exp
    : 'nil' | 'false' | 'true'
    | NUMERAL
    | LITERAL_STRING
    | functiondef
    | '...'
    | prefixexp
    | functioncall
    | exp opLogica exp
    | exp opComparacao exp
    | exp opBin exp
    | <assoc=right> exp opConcat exp
    | exp opSomaSub exp
    | exp opDivMult exp
    | <assoc=right> opUnario exp
    | <assoc=right> exp opPower exp
    ;

// Regras para definição de diferentes tipos de operadores
// Necessário para tratamento de precedência entre operadores 
opLogica : 'or'|'and';
opComparacao: '<' | '>' | '<=' | '>=' | '~=' | '==' ;
opBin: '|'|'~'|'&'|'<<'| '>>';
opSomaSub : '+'|'-';
opDivMult:  '*' | '/' | '//' | '%';
opConcat : '..';
opUnario : 'not' | '#' | '-' | '~';
opPower : '^';

prefixexp
    : varOrExpVARIAVEL (tableconstructor | LITERAL_STRING)* 
    ;

functioncall
    : varOrExpFUNCAO nameAndArguments+
    ;

//Separação entre varOrExpFUNCAO e varOrExpVARIAVEL foi necessária para
//preenchimento da tabela de símbolos. Apesar de terem a mesma regra, elas
//adicionam respectivamente um novo símbolo do tipo FUNCAO ou um novo símbolo
//do tipo VARIAVEL

varOrExpFUNCAO
    : var { TabelaDeSimbolos.adicionarSimbolo(($var.text),Tipo.FUNCAO); } | '(' exp ')'
    ;

varOrExpVARIAVEL
    : var { TabelaDeSimbolos.adicionarSimbolo(($var.text),Tipo.VARIAVEL); } | '(' exp ')'
    ;


// Define formato de variaveis
var
    : (NAME | expAndVarSuffix) varSuffix*
    ;

varSuffix
    : nameAndArguments* ('[' exp ']' | '.' NAME)
    ;

expAndVarSuffix
    : '(' exp ')' varSuffix
    ;

nameAndArguments
    : (':' NAME)? ('(' listaExpr? ')' | tableconstructor | LITERAL_STRING)
    ;


//https://www.lua.org/manual/5.3/manual.html#3.4.
functiondef: 'function' funcname { TabelaDeSimbolos.adicionarSimbolo(($funcname.text),Tipo.FUNCAO); } funcbody;
funcbody: '(' parlist? ')' codigo 'end' ;
parlist: namelist (',' '...')? | '...';

// https://www.lua.org/manual/5.3/manual.html#3.4.9
tableconstructor : '{' fieldlist? '}';
fieldlist: field (fieldsep field)* fieldsep?;
field: '[' exp ']' '=' exp | NAME '=' exp | exp;
fieldsep : ',' | ';';


// Como pedido pelo professor, temos apenas int e float
NUMERAL
    : INT | FLOAT
    ;

// Valor string
LITERAL_STRING
    : EscapedLITERAL_STRING;


// REGRAS LÉXICAS ------------------------------------------------------------

// Letra maiuscula
fragment
LetterUppercase
    : [A-Z]
    ;

// Letra minuscula
fragment
LetterLowercase
    : [a-z]
    ;

// Letras
fragment
Letter
    : (LetterLowercase | LetterUppercase)
    ;

// Um digito decimal
fragment
Digit
    : [0-9]
    ;
    
// Numeros de um digito ou mais
INT
    : Digit+
    ;

// Float com expoente opcional
FLOAT
     :   Digit+ '.' Digit* EXPOENTE?
     ;

fragment
EXPOENTE
     : ('e'|'E') Digit+
     ;

fragment
Escape
    : '\u0060\''    // backtick single-quote
    | '\u0060"'     // backtick double-quote
    ;

//EscapedLITERAL_STRING usado para ignorar qualquer caracter dentro de um comentário
//(inclusive caracteres delimitadores de comentário)
EscapedLITERAL_STRING
    : '"'      (Escape | '""'   | ~["])* '"'
    | '\''     (Escape | '\'\'' | ~['])* '\''
    | '\u201C' (Escape | .)*? ('\u201D' | '\u2033')   // smart quotes
    ;

// Regra para ignorar espaços tabulações e linebreaks
WHITESPACE
    : [ \t\u000C\r\n]+ -> skip
    ;

// NAME: Iniciam-se por uma letra ou '_' e é seguido de zero ou mais letras, digitos ou '_'
NAME: (Letter | '_') (Letter | Digit | '_')*;

// COMMENT: Cadeia de caracteres delimitada por '--[' e ']' 
COMMENT
    : '--[' LITERAL_STRING ']' -> channel(HIDDEN)
    ;
    
// LINE_COMMENT: Cadeia de caracteres que inicia-se com '--' e termina ao final da linha
// (mas pode não começar no início da linha)
LINE_COMMENT
    : '--'
    (                                               // --
    | '[' '='*                                      // --[==
    | '[' '='* ~('='|'['|'\r'|'\n') ~('\r'|'\n')*   // --[==AA
    | ~('['|'\r'|'\n') ~('\r'|'\n')*                // --AAA
    ) ('\r\n'|'\r'|'\n'|EOF)
    -> channel(HIDDEN)
    ;
