%%

%unicode

%state ENTIER_LU
%state FOIS_LU
%state PAS_LU

%state ORIGINE_LU
%state PARENTHESE_FIN
%state VIRGULE_LU

DIRECTIONS = "nord" | "sud" | "est" | "ouest" 
RETOUR_LIGNE = \r | \b | \n
NOMBRE_ENTIER = [0-9]+
ESPACES = " "+



%%

<YYINITIAL> {DIRECTIONS} {return new ULMotClef(Token.valueOf(yytext()));}

<YYINITIAL> {NOMBRE_ENTIER} {
yybegin(ENTIER_LU);
return new ULEntier(Integer.parseInt(yytext()));
}

<ENTIER_LU> {ESPACES}"fois"{ESPACES} {
yybegin(FOIS_LU);
return new ULMotClef(Token.fois);
}

<FOIS_LU> {DIRECTIONS} {
yybegin(YYINITIAL);
return new ULMotClef(Token.valueOf(yytext()));
}

<YYINITIAL> "pas"{ESPACES} { 
yybegin(PAS_LU);
return new ULMotClef(Token.pas);
}

<PAS_LU>  {NOMBRE_ENTIER} {
yybegin(YYINITIAL);
return new ULEntier(Integer.parseInt(yytext()));
}

<YYINITIAL> "origine("" "* {
yybegin(ORIGINE_LU);
return new ULMotClef(Token.origine);
}

<ORIGINE_LU> {NOMBRE_ENTIER} {
yybegin(ENTIER_LU);
return new ULEntier(Integer.parseInt(yytext()));
}

<ENTIER_LU> " "*","" "* {
yybegin(VIRGULE_LU);
}

<VIRGULE_LU> {NOMBRE_ENTIER} {
yybegin(PARENTHESE_FIN);
return new ULEntier(Integer.parseInt(yytext()));
}

<PARENTHESE_FIN> " "*")" {
yybegin(YYINITIAL);
}

<YYINITIAL> {RETOUR_LIGNE} {}

<YYINITIAL> "quitter" {return new ULMotClef(Token.eof);}

<YYINITIAL> "lever"   {return new ULMotClef(Token.lever);}

<YYINITIAL> "baisser" {return new ULMotClef(Token.baisser);}



