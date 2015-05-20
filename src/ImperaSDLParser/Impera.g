grammar Impera;

options {
  language = Java;
  output = AST;
  backtrack = true;
  memoize = true;
}

tokens {
  PROGRAM;
  DECL;
  BLOCK;
  FUNCTION;
  PARAMS;
  POS;
  NEG;
  CALL;
  ARGS;
  CAST;
  ARRAY;
  INDEX;
}

@header {
package ImperaSDLParser;
}

@lexer::header {
package ImperaSDLParser;
}

program
  : globals -> ^(PROGRAM globals)
  ;
  
globals
  : declaration* function*
  //: (declaration|function)*
  ;
  
declaration
  : type ID (EQUAL expr)? SC -> ^(DECL type ID (EQUAL expr)?)
  ;
  
statement
  : assignment
  | declaration
  | printstatement
  | returnstatement
  | statcall
  | ifstatement
  | whilestatement
  | BREAK SC!
  | CONTINUE SC!
  ;
  
whilestatement
  : WHILE LP expr RP block -> ^(WHILE expr block)
  ;
  
ifstatement
  : IF LP expr RP block (ELSE block)? -> ^(IF expr block (ELSE block)?)
  ;
 
returnstatement
  : RETURN expr? SC -> ^(RETURN expr?)
  ;
  
printstatement
  : PRINT LP expr RP SC -> ^(PRINT expr)
  | PRINTLN LP expr RP SC -> ^(PRINTLN expr)
  ;
  
block
  : LBRACE statement* RBRACE -> ^(BLOCK statement*)
  ;
  
assignment
  : ID EQUAL expr SC -> ^(EQUAL ID expr)
  | ID SET expr SC -> ^(SET ID expr)
  ;
  
function
  : type ID LP params? RP block -> ^(FUNCTION ^(ID type) params? block)
  ;
params
  : parameter (COMMA parameter)* -> ^(PARAMS parameter*)
  ;
parameter
  : type ID -> ^(ID type)
  ;
  
statcall
  : ID LP args? RP SC -> ^(CALL ID args?)
  ;
exprcall
  : ID LP args? RP -> ^(CALL ID args?)
  ;
args
  : expr (COMMA expr)* -> ^(ARGS expr*)
  ;
  
expr
  : orexpr
  ;
orexpr
  : andexpr ((XOR|OR)^ andexpr)*
  ;
andexpr
  : eqexpr (AND^ eqexpr)*
  ;
eqexpr
  : relexpr ((EQUIV|NOTEQ)^ relexpr)*
  ;
relexpr
  : plusexpr ((LTHAN|GTHAN|LTHANE|GTHANE)^ plusexpr)*
  ;
plusexpr
  : multexpr ((PLUS|MINUS|CONCAT)^ multexpr)*
  ;
multexpr
  : powexpr ((MULT|DIV)^ powexpr)*
  ;
powexpr
  : unaryexpr (POW^ unaryexpr)*
  ;

unaryexpr
  : PLUS unaryexpr -> ^(POS unaryexpr)
  | MINUS unaryexpr -> ^(NEG unaryexpr)
  | NOT^ unaryexpr
  | GET^ catom
  | catom
  ;
  
catom
  : atom (KVPAIR^ atom)?
  ;

atom
  : LP! expr RP!
  | LP type RP e=expr -> ^(CAST type $e)
  | LB expr (COMMA expr)* RB -> ^(ARRAY expr*)
  | ID LB expr RB -> ^(INDEX ID expr)
  | exprcall
  | NUMBER
  | FPNUMBER
  | TRUE
  | FALSE
  | STRING
  | ID
  ;
string
  : QUOTE! .* QUOTE!
  ;

type
  : VAR
  | KEY
  | OBJECT
  | ARRAY
  | VOID
  ;

MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
LBRACE: '{';
RBRACE: '}';
LP: '(';
RP: ')';
LB: '[';
RB: ']';
DOT: '.';
COMMA: ',';
QUOTE: '"';
SC: ';';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
US: '_';
BSLASH: '\\';
PRINTLN: 'println';
PRINT: 'print';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
AS: 'as';

VAR: 'var';
KEY: 'key';
OBJECT: 'object';
ARRAY: 'array';
VOID: 'void';

SET: ':=';
GET: '%';
CONCAT: '<-';
EQUIV: '==';
EQUAL: '=';
LTHAN: '<';
GTHAN: '>';
LTHANE: '<=';
GTHANE: '>=';
NOT: '!';
NOTEQ: '!=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
PRED: '|';
OR: 'or';
XOR: 'xor';
AND: 'and';
POW: '^';
KVPAIR: ':';

WS
  : (' ' 
  | '\t' 
  | '\n'
  | '\r') {$channel = HIDDEN;}
  ;

fragment DIGIT: '0'..'9';
ID
  : ('A'..'Z' | 'a'..'z' | '_') ('A'..'Z'| 'a'..'z'| '_' | DIGIT)*
  ;
NUMBER: DIGIT+;
FPNUMBER: DIGIT+ DOT DIGIT+;
STRING: QUOTE .* QUOTE;