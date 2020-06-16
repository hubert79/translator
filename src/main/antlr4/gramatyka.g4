// Java -jar /usr/local/lib/antlr-4.8-complete.jar gramatyka.g4

grammar gramatyka;

kompilacja
    :   deklaracjiaPaczki? deklaracjaImportu* typDeklaracji*
        EOF
    ;

deklaracjiaPaczki
    :   'package' nazwa ';'
    ;

deklaracjaImportu
    :   'import' 'static'? nazwa ('.' '*')? ';'
    ;

typDeklaracji
    :   ModyfikatorKlasy* ( deklaracjaKlasy )
    |   ';'
    ;

ModyfikatorKlasy
    :   'public'
    ;

deklaracjaKlasy
    : 'class' nazwaKlasy
       '{' cialoKlasy '}'
    ;

cialoKlasy
    :   wnetrze*
    ;

wnetrze
    : deklaracjaMetody
    | deklaracjaSkladowych
    ;

deklaracjaMetody
    :   modyfikator? typ nazwaMetody parametrMetody ('[' ']')* cialoMetody
    ;

deklaracjaSkladowych
    :   modyfikator? stala? deklaracjaZmiennej ';'
    ;

modyfikator
    : 'public'
    | 'private'
    ;

stala
    : 'static final'
    | 'final static'
    ;

parametrMetody
    :   '(' deklaracjaParametrowMetod? ')'
    ;

deklaracjaParametrowMetod
    :   typ nazwaZmiennej (',' deklaracjaParametrowMetod)?
    ;

cialoMetody
    : '{' instrukcja+ '}' ;

deklaracjaZmiennej
    :   typ nazwaZmiennej ('=' inicjalizaacjaZmiennej)?
    ;

instrukcja
    :   deklaracjaZmiennej ';'
    |   komunikat
    ;

inicjalizaacjaZmiennej
    :   wyrazenie
    |   '\'' wyrazenie '\''
    ;

typ
    :   typPrymitywny ('[' ']')*
    |   'void'
    ;

komunikat
    :   'return' wyrazenie? ';'                                            
    |   'if' dubwyrazenie '{' komunikat '}' ('else {' komunikat '}')?      
    |   wyrazenie ';'                                                      
    ;

wyrazenie
    :   literal                                                     
    |   wyrazenie op=('+'|'-'|'*'|'/') wyrazenie                          
    |   wyrazenie op=('=='|'!=') wyrazenie                                
    ;

dubwyrazenie
    :   '(' wyrazenie ')'
    ;

literal
    :   INT
    |   nazwaZmiennej
    |   'null'
    ;

typPrymitywny
    :   'char'
    |   'int'
    |   'float'
    ;

nazwaKlasy : ID ;
nazwaMetody : ID ;
nazwa : ID ;
nazwaZmiennej : ID ('[' ']')* ;

INT : [0-9]+ ;
ID : [a-zA-Z0-9]+ ;
WS: [ \t\n\r]+ -> skip ;