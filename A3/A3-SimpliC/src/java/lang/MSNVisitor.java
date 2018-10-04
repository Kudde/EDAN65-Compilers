package lang;

import lang.ast.*;

/**
 * Calculates the maximum statement nesting (MSN)..
 */
public class MSNVisitor extends TraversingVisitor {
	public static int result(ASTNode n) {
		MSNVisitor v = new MSNVisitor();
		n.accept(v, null);
		return v.depth;
	}

	private int depth = 1;

	public Object visit(WhileStmt node, Object data) {
		depth++;
		return visitChildren(node, data);
	}
	public Object visit(IfStmt node, Object data) {
		depth++;
		return visitChildren(node, data);
	}
}
