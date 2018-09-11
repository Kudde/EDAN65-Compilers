package lang;
import lang.ast.LangParser;
import lang.ast.LangScanner;
import static lang.ast.LangParser.Terminals.*;
/**
 * Abstract base class for recursive decent parsers.
 * You should implement the parseProgram() method to parse a MiniS program.
 */
public class RecursiveDescentCompiler {
private LangScanner scanner;
private beaver.Symbol currentToken;


/** Initialize the parser and start parsing via the parseProgram() method. */
public void parse(LangScanner scanner) {
        this.scanner = scanner;
        parseProgram();
        accept(EOF); // Ensure all input is processed.
}

protected void parseProgram() {
        stmt();

}

private void stmt() {
        switch(peek()) {
                case ID:
                break;

                case FOR:
                break;

                case IF:
                break;

                default:
                        error("Åh nej " + peek());


        }
}

private void assignStatement() {
        accept(ID);
        accept(ASSIGN);
        expr();
}

private void expr() {
        switch(peek()) {
                case ID: // assignment
                        accept(ID);
                break;
                case NUMERAL:
                        accept(NUMERAL);
                break;
                case NOT:
                        accept(NOT);
                        expr();
                break;
        }
}

private void forStatement() {
        accept(FOR);
        accept(ID);
        accept(ASSIGN);
        expr();
        accept(UNTIL);
        expr();
        accept(DO);
        stmt();
        accept(OD);
}

private void ifStatement() {
        accept(IF);
        accept(ID);
        accept(THEN);
        stmt();
        accept(FI);
}

/** Returns the current token without proceeding to the next. */
protected int peek() {
        if (currentToken == null) accept();
        return currentToken.getId();
}

/** Read the next token from the scanner. */
protected void accept() {
        try {
                currentToken = scanner.nextToken();
        } catch (Exception e) {
                throw new RuntimeException(e);
        }
}

/** Ensure the current token is of a certain type; then read the next. */
protected void accept(int expectedToken) {
        if (peek() != expectedToken) {
                error("expected token " +
                      LangParser.Terminals.NAMES[expectedToken] +
                      " got token " +
                      LangParser.Terminals.NAMES[currentToken.getId()]);
        }
        accept();
}

protected static void error(String message) {
        throw new RuntimeException(message);
}
}
