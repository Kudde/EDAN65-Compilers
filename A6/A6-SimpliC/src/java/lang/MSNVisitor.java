package lang;

import lang.ast.*;

/**
 * Calculates the maximum statement nesting (MSN)..
 */
 public class MSNVisitor extends TraversingVisitor {
 	public static int result(ASTNode n) {
 		MSNVisitor v = new MSNVisitor();
 		int eOst = 1;
 		n.accept(v, eOst);
 		return v.depth;
 	}

 	private int depth = 1;

 	public Object visit(WhileStmt node, Object data) {
 		int t = (int) data;
 		t++;
 		if (t > depth) depth = t;
 		return visitChildren(node, t);
 	}
 	public Object visit(IfStmt node, Object data) {
 		int t = (int) data;
 		t++;
 		if (t > depth) depth = t;
 		return visitChildren(node, t);
 	}
 }
