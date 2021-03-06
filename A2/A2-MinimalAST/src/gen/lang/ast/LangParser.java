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
		static public final short NEQUAL = 1;
		static public final short EQUAL = 2;
		static public final short SEMMIC = 3;
		static public final short LESS = 4;
		static public final short GREATER = 5;
		static public final short LEQUAL = 6;
		static public final short GEQUAL = 7;
		static public final short PLUS = 8;
		static public final short SUB = 9;
		static public final short RP = 10;
		static public final short LP = 11;
		static public final short COMMA = 12;
		static public final short ID = 13;
		static public final short NUMERAL = 14;
		static public final short INT = 15;
		static public final short IF = 16;
		static public final short WHILE = 17;
		static public final short RCARET = 18;
		static public final short RETURN = 19;
		static public final short MUL = 20;
		static public final short DIV = 21;
		static public final short MOD = 22;
		static public final short LCARET = 23;
		static public final short ASSIGN = 24;
		static public final short ELSE = 25;

		static public final String[] NAMES = {
			"EOF",
			"NEQUAL",
			"EQUAL",
			"SEMMIC",
			"LESS",
			"GREATER",
			"LEQUAL",
			"GEQUAL",
			"PLUS",
			"SUB",
			"RP",
			"LP",
			"COMMA",
			"ID",
			"NUMERAL",
			"INT",
			"IF",
			"WHILE",
			"RCARET",
			"RETURN",
			"MUL",
			"DIV",
			"MOD",
			"LCARET",
			"ASSIGN",
			"ELSE"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pDbqbm5KKOnx#PUO4O4Xz4881XoHu28I28kACeRg2okA2YuiNI0sNfGJseuU15o$90QLc" +
		"UBBrWMMMLUh3KAhrObajaXx2PW20eg0W2KRRsr$qwBpFTyv8O8kNxrt##$hxltylqTC$h4S" +
		"aiLATyo59uXnEhaPbIAtKo6k#a3oc2TpknxZgJyFvq8KDWiHEhaJ6cnb2vGVtWGcwJiNAbr" +
		"CibibIkbIla0fcVeYf6jI2c6eRgBnTo3PphHBjSCBukcUT4JxX0TK9kTAB7NJ2Zn#LM9thC" +
		"mrhucnCxwk5NTPIdb8mTSK6FH#H19$g72v4S4pZi0eLX0h#xG66OmDykK1WcyBqFQO3TQwX" +
		"5PakvZGjNxxdpvCT2ddklkLq#Q6zNefzAgP0gcQws#q2xFQOTgNs3WOvdfm$Qt1dhOuA87S" +
		"ys7sYtnRJJj6#msGUvpJ7jfTetsEI3t2QqrKOxGYwMuJQpqGVQZMXdvBKtsym67vA1OoKo#" +
		"rDhRxUPtkPeXm$wt44xaczdYPsZTXzes$FQovII9fjPvuDTjGxjFKOhweps3RQcu8pQcczt" +
		"6VO#6#$jNjRxaELS3zBRGRcVwsbvm6QsfE0q$4NzR7X8dOKcBdV6rkzKoSejj7IMCTq5o#H" +
		"2F3sAaiIO6kChDAT86N7AEl9xivbIMQHxIsylDrFdadCoSiwv7#EGKJAHgr3U4uU9xo6#H#" +
		"sEmyHt4z#jEkCmyKxYdQeZ3XFl8DwXVjAGYsIyDCiinY9uKEtJICJt6TOavdkEsgkHqEtDK" +
		"IOxsd6EFyNnhtBywnp$9iTVwFYBLPjaz0ZaORqFLPi6NcX6jLzzf$QR$RaShyte7g9qW3L#" +
		"mCJlDLTD$RlSNA#6ryE0LY9QBv8Xd0YA#R$FyczUPjPpLePJgvmv64VTIcPYWdcgVfrQwWp" +
		"hfOvVOmhwYW8rQb9hH2bz#AeAD6FwLDNqkwsQGLALeQhjbygTbVGUiuFJ8s$gOV1$fv8IHb" +
		"yQMqCJPH8dWL6SZHNFjv1Uj$elSxINsaz$jFW5jOCrdjxwE2$QN7vGj9nrIhdtkjYz3sZ#J" +
		"9$TgwW$u#lMbl3sAksbpwmPNudvVrLeitrfkzirlGniBUWvoTLlC7qszT5d2IWrjkTUakkt" +
		"IgffAGlhOQDCvgfRQouyAXJz735AhpSxYdfs9hsbjzVpj0QQA$WU6RISVGxdDQxuzH5tvxk" +
		"03hPusl$QZ$HQe#SwCogpRl2cvaObq#rTwVKuniGQJBp9ngUPgtdkkRkmzwBNzefMVRfHwX" +
		"G7dMVXgoOhvXJJYFyDTe58ztc7aOay2L#4Rv0VWNsFmmhd$UXJx6FOvuctK7uQkmJx2h4ca" +
		"GodeU0TobzXFy2#H1vzy0Ns1UmMU8Xo02iepyCUWyrm9NfEOfawBDzC8RdeTUmY#1fy53u7" +
		"LyDtoRqDtwVyCNLcOFdMviGdqHpykPGNmy$XKyJc4zEdj6VWJFWot41yAVKQA7DobJMGUv4" +
		"kueyGr$V2$6Nufes6moU8hI0s7irdsEdugoX$X7qJ#oLSIvav2jTJvXGUqaV8DqZOsMgcLn" +
		"y#mz6jal#LwsUGyyDlSpOAj4qZVSwsjjK#qvEshMPRTvtDFsxjXpO$qlh7qjkDFecLssFzV" +
		"TrJ3akSiNGK7cTaxrUMnM87R6objQji$72FHbR7z5qfxIe$bYbF#k5RiVRQaZdpcyLk2lWQ" +
		"q0pPRnbEdI6CUAy7CEJz6rZgSf7bK1YnOpIBU3jdE7k7C3AxRngs0Tj4h0NRWb#LPy0UZnm" +
		"6x7o1aMN0ko2ACM27HZ38inA$adxr#Q0QZeErSCO$SlgQsG==");

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
			case 3: // fun = type_decl.a id_decl.b param.c block.d
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final TypeDecl a = (TypeDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final IdDecl b = (IdDecl) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 3];
					final Param c = (Param) _symbol_c.value;
					final Symbol _symbol_d = _symbols[offset + 4];
					final Block d = (Block) _symbol_d.value;
					 return new Fun(a, b, c, d);
			}
			case 4: // block = LCARET RCARET
			{
					 return new Block();
			}
			case 5: // block = LCARET stmt_list.a RCARET
			{
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					 return new Block(a);
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
			case 10: // stmt = expr.a SEMMIC
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return new ExprStmt(a);
			}
			case 11: // stmt = WHILE LP expr.a RP block.b
			{
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Block b = (Block) _symbol_b.value;
					 return new WhileStmt(a, b);
			}
			case 12: // stmt = IF LP expr.a RP block.b
			{
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Block b = (Block) _symbol_b.value;
					 return new IfStmt(a, b, new Opt());
			}
			case 13: // stmt = IF LP expr.a RP block.b ELSE block.c
			{
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 5];
					final Block b = (Block) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 7];
					final Block c = (Block) _symbol_c.value;
					 return new IfStmt(a, b, new Opt(c));
			}
			case 14: // stmt = RETURN expr.a SEMMIC
			{
					final Symbol _symbol_a = _symbols[offset + 2];
					final Expr a = (Expr) _symbol_a.value;
					 return new ReturnStmt(a);
			}
			case 15: // decl = type_decl.a id_decl.b SEMMIC
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final TypeDecl a = (TypeDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final IdDecl b = (IdDecl) _symbol_b.value;
					 return new DeclStmt(a, b, new Opt());
			}
			case 16: // decl = type_decl.a id_decl.b ASSIGN expr.c SEMMIC
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final TypeDecl a = (TypeDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final IdDecl b = (IdDecl) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 4];
					final Expr c = (Expr) _symbol_c.value;
					 return new DeclStmt(a, b, new Opt(c));
			}
			case 17: // assign = id.a ASSIGN expr.b SEMMIC
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final ID a = (ID) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new AssignStmt(a, b);
			}
			case 18: // param = LP RP
			{
					 return new Param();
			}
			case 19: // param = LP param_list.a RP
			{
					final Symbol _symbol_a = _symbols[offset + 2];
					final List a = (List) _symbol_a.value;
					 return new Param(a);
			}
			case 20: // param_list = param_stmt.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final ParamStmt a = (ParamStmt) _symbol_a.value;
					 return new List().add(a);
			}
			case 21: // param_list = param_list.a COMMA param_stmt.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final ParamStmt b = (ParamStmt) _symbol_b.value;
					 return a.add(b);
			}
			case 23: // param_decl = type_decl.a id_decl.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final TypeDecl a = (TypeDecl) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final IdDecl b = (IdDecl) _symbol_b.value;
					 return new ParamDecl(a, b);
			}
			case 24: // expr_list = expr.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return new List().add(a);
			}
			case 25: // expr_list = expr_list.a COMMA expr.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return a.add(b);
			}
			case 26: // expr = expr.a NEQUAL comp_expr.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new NotEqual(a, b);
			}
			case 27: // expr = expr.a EQUAL comp_expr.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Equal(a, b);
			}
			case 28: // expr = comp_expr.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return a;
			}
			case 29: // comp_expr = comp_expr.a LESS bin_expr.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Less(a, b);
			}
			case 30: // comp_expr = comp_expr.a GREATER bin_expr.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Greater(a, b);
			}
			case 31: // comp_expr = comp_expr.a LEQUAL bin_expr.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new LessEqual(a, b);
			}
			case 32: // comp_expr = comp_expr.a GEQUAL bin_expr.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new GreaterEqual(a, b);
			}
			case 33: // comp_expr = bin_expr.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return a;
			}
			case 35: // bin_expr = bin_expr.a PLUS term.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Plus(a, b);
			}
			case 36: // bin_expr = bin_expr.a SUB term.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Sub(a, b);
			}
			case 37: // bin_expr = term.a
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return a;
			}
			case 38: // term = term.a MUL factor.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Mul(a, b);
			}
			case 39: // term = term.a DIV factor.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Div(a, b);
			}
			case 40: // term = term.a MOD factor.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Mod(a, b);
			}
			case 41: // term = factor.b
			{
					final Symbol _symbol_b = _symbols[offset + 1];
					final Expr b = (Expr) _symbol_b.value;
					 return b;
			}
			case 42: // factor = LP expr.a RP
			{
					final Symbol _symbol_a = _symbols[offset + 2];
					final Expr a = (Expr) _symbol_a.value;
					 return a;
			}
			case 46: // fun_call = ID.id LP RP
			{
					final Symbol id = _symbols[offset + 1];
					 return new FunCall(id, new List());
			}
			case 47: // fun_call = ID.id LP expr_list.a RP
			{
					final Symbol id = _symbols[offset + 1];
					final Symbol _symbol_a = _symbols[offset + 3];
					final List a = (List) _symbol_a.value;
					 return new FunCall(id, a);
			}
			case 48: // literal = NUMERAL.i
			{
					final Symbol i = _symbols[offset + 1];
					 return new Literal(i);
			}
			case 49: // type_decl = INT.i
			{
					final Symbol i = _symbols[offset + 1];
					 return new TypeDecl(i);
			}
			case 50: // id = ID.id
			{
					final Symbol id = _symbols[offset + 1];
					 return new ID(id);
			}
			case 51: // id_decl = ID.id
			{
					final Symbol id = _symbols[offset + 1];
					 return new IdDecl(id);
			}
			case 34: // bin_expr = 
			{
				return new Symbol(null);
			}
			case 8: // stmt = decl
			case 9: // stmt = assign
			case 22: // param_stmt = param_decl
			case 43: // factor = id
			case 44: // factor = fun_call
			case 45: // factor = literal
			{
				return _symbols[offset + 1];
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}
