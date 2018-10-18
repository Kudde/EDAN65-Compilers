package lang.ast; // The generated scanner will belong to the package lang.ast

import lang.ast.LangParser.Terminals; // The terminals are implicitly defined in the parser
import lang.ast.LangParser.SyntaxError;

%%

// define the signature for the generated scanner
%public
%final
%class LangScanner
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol
%function nextToken

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r
ID = [a-zA-Z0-9]+
NUMERAL = [0-9]+
BOOLEAN = "ture" | "false"
COMMENT = "//" .*
%%

// discard whitespace information
{WhiteSpace}  { }
{COMMENT}     { }

// token definitions
"=="          { return sym(Terminals.EQUAL);}
"!="          { return sym(Terminals.NEQUAL);}
"<"           { return sym(Terminals.LESS);}
"<="          { return sym(Terminals.LEQUAL);}
">"           { return sym(Terminals.GREATER);}
">="          { return sym(Terminals.GEQUAL);}
"("           { return sym(Terminals.LP);}
")"           { return sym(Terminals.RP);}
";"           { return sym(Terminals.SEMMIC);}
"{"           { return sym(Terminals.LCARET);}
"}"           { return sym(Terminals.RCARET);}
"+"           { return sym(Terminals.PLUS);}
"-"           { return sym(Terminals.SUB);}
"%"           { return sym(Terminals.MOD);}
"*"           { return sym(Terminals.MUL);}
"/"           { return sym(Terminals.DIV);}
"="           { return sym(Terminals.ASSIGN);}
"if"          { return sym(Terminals.IF);}
"else"        { return sym(Terminals.ELSE);}
"while"       { return sym(Terminals.WHILE);}
"return"      { return sym(Terminals.RETURN);}
"int"         { return sym(Terminals.INT);}
","           { return sym(Terminals.COMMA);}
{NUMERAL}     { return sym(Terminals.NUMERAL);}
{BOOLEAN}     { return sym(Terminals.BOOLEAN);}
{ID}          { return sym(Terminals.ID);}
<<EOF>>       { return sym(Terminals.EOF);}

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
