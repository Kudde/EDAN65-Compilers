package lang.ast;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class LangParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short INT = 1;
		static public final short ID = 2;
		static public final short RCARET = 3;
		static public final short SEMMIC = 4;
		static public final short LPARENT = 5;
		static public final short ASSIGN = 6;
		static public final short RPARENT = 7;
		static public final short LCARET = 8;
		static public final short NUMERAL = 9;

		static public final String[] NAMES = {
			"EOF",
			"INT",
			"ID",
			"RCARET",
			"SEMMIC",
			"LPARENT",
			"ASSIGN",
			"RPARENT",
			"LCARET",
			"NUMERAL"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9oDqVjBmb0Onl5dqvbvINCsBIyL147W3n4LNOde3a5$KdzmsjtAqhVl3XD42Dh3Ppldl9j" +
		"xtP5qfxAgPcgfhJcLufdoQgZePcdIqh9IYbJNedncJUKKseCR5UpJvSEbx$BkykRovJ8aF#" +
		"IR36oWmBhMLTDwobhFHZPIHakQrOn2pMj15TNirLxioPxjaRVb9Nb9T$4in7YMer8aLPwBU" +
		"DAZnnHgoUW$v$ZN9nNurm6LDDrat4f0Trdwywbbt5SPnwU#SYztb13FDr774OvnY2r4s4O3" +
		"ksXZ5MiumpdMiODJxEC26xZ45QvnWptSeeEJvFrf1Ccu4rydnsRMJwx3SMtYdeFfDUwpwRM" +
		"$94Veldh5yTcJWE$d8qN5Wy#kUKw9jJBzLXd78YmWtisysm5FzLyn5d9E");

	static public class SyntaxError extends RuntimeException { public SyntaxError(String msg) {super(msg);}}
	// Disable syntax error recovery
	protected void recoverFromError(Symbol token, TokenStream in) {
		throw new SyntaxError("Cannot recover from the syntax error");
	}

	public LangParser() {
		super(PARSING_TABLES);
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		switch(rule_num) {
			case 0: // program = fun_list.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					 return new Program(a);
			}
			case 1: // fun_list = fun.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Fun a = (Fun) _symbol_a.value;
					 return new List().add(a);
			}
			case 2: // fun_list = fun_list.a fun.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Fun b = (Fun) _symbol_b.value;
					 return a.add(b);
			}
			case 3: // fun = type_decl.a id_decl.b LPARENT RPARENT block.c
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final TypeDecl a = (TypeDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final IdDecl b = (IdDecl) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 5];
					final Block c = (Block) _symbol_c.value;
					 return new Fun(a, b, c);
			}
			case 4: // block = LCARET RCARET
			{
					 return new Block(new Opt());
			}
			case 5: // block = LCARET stmt_list.a RCARET
			{
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					 return new Block(new Opt(a));
			}
			case 6: // stmt_list = stmt.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stmt a = (Stmt) _symbol_a.value;
					 return new List().add(a);
			}
			case 7: // stmt_list = stmt_list.a stmt.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Stmt b = (Stmt) _symbol_b.value;
					 return a.add(b);
			}
			case 10: // decl = type_decl.a id_decl.b SEMMIC
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final TypeDecl a = (TypeDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final IdDecl b = (IdDecl) _symbol_b.value;
					 return new DeclStmt(a, b);
			}
			case 11: // assign = id_use.a ASSIGN expr.b SEMMIC
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdUse a = (IdUse) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new AssignStmt(a, b);
			}
			case 14: // id_expr = id_use.id
			{
					final Symbol _symbol_id = _symbols[offset + 1];
					final IdUse id = (IdUse) _symbol_id.value;
					 return new IdExpr(id);
			}
			case 15: // literal = NUMERAL.i
			{
					final Symbol i = _symbols[offset + 1];
					 return new Literal(i);
			}
			case 16: // type_decl = INT.i
			{
					final Symbol i = _symbols[offset + 1];
					 return new TypeDecl(i);
			}
			case 17: // id_use = ID.id
			{
					final Symbol id = _symbols[offset + 1];
					 return new IdUse(id);
			}
			case 18: // id_decl = ID.id
			{
					final Symbol id = _symbols[offset + 1];
					 return new IdDecl(id);
			}
			case 8: // stmt = decl
			case 9: // stmt = assign
			case 12: // expr = literal
			case 13: // expr = id_expr
			{
				return _symbols[offset + 1];
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}
