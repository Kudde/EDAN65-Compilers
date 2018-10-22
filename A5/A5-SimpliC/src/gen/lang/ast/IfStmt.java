/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
/**
 * @ast node
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\lang.ast:18
 * @astdecl IfStmt : Stmt ::= Expr If:Block [Else:Block];
 * @production IfStmt : {@link Stmt} ::= <span class="component">{@link Expr}</span> <span class="component">If:{@link Block}</span> <span class="component">[Else:{@link Block}]</span>;

 */
public class IfStmt extends Stmt implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\Interpreter.jrag:64
   */
  public void eval(ActivationRecord actrec) throws ReturnException {
                if (getExpr().eval(actrec) == 1)
                        getIf().eval(actrec);
                else
                        if (hasElse())
                                getElse().eval(actrec);

        }
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\PrettyPrint.jrag:75
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind + "if (");
		getExpr().prettyPrint(out, ind);
		out.print(")");
		getIf().prettyPrint(out, ind + "\t");
		out.print(ind + "}\n");
		if (hasElse()) {
			out.print(ind + "else");
			getElse().prettyPrint(out, ind + "\t");
			out.print(ind + "}\n");
		}
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\Visitor.jrag:117
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public IfStmt() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[3];
    setChild(new Opt(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Expr", "If", "Else"},
    type = {"Expr", "Block", "Opt<Block>"},
    kind = {"Child", "Child", "Opt"}
  )
  public IfStmt(Expr p0, Block p1, Opt<Block> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    compatibleTypes_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public IfStmt clone() throws CloneNotSupportedException {
    IfStmt node = (IfStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public IfStmt copy() {
    try {
      IfStmt node = (IfStmt) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:62
   */
  @Deprecated
  public IfStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public IfStmt treeCopyNoTransform() {
    IfStmt tree = (IfStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:92
   */
  public IfStmt treeCopy() {
    IfStmt tree = (IfStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:106
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the If child.
   * @param node The new node to replace the If child.
   * @apilevel high-level
   */
  public void setIf(Block node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the If child.
   * @return The current node used as the If child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="If")
  public Block getIf() {
    return (Block) getChild(1);
  }
  /**
   * Retrieves the If child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the If child.
   * @apilevel low-level
   */
  public Block getIfNoTransform() {
    return (Block) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Else child. This is the <code>Opt</code>
   * node containing the child Else, not the actual child!
   * @param opt The new node to be used as the optional node for the Else child.
   * @apilevel low-level
   */
  public void setElseOpt(Opt<Block> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Else child.
   * @param node The new node to be used as the Else child.
   * @apilevel high-level
   */
  public void setElse(Block node) {
    getElseOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Else child exists.
   * @return {@code true} if the optional Else child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasElse() {
    return getElseOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Else child.
   * @return The Else child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Block getElse() {
    return (Block) getElseOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * @return The optional node for child the Else child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Else")
  public Opt<Block> getElseOpt() {
    return (Opt<Block>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Else.
   * @apilevel low-level
   */
  public Opt<Block> getElseOptNoTransform() {
    return (Opt<Block>) getChildNoTransform(2);
  }
/** @apilevel internal */
protected boolean compatibleTypes_visited = false;
  /** @apilevel internal */
  private void compatibleTypes_reset() {
    compatibleTypes_computed = false;
    compatibleTypes_visited = false;
  }
  /** @apilevel internal */
  protected boolean compatibleTypes_computed = false;

  /** @apilevel internal */
  protected boolean compatibleTypes_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:44
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:42")
  public boolean compatibleTypes() {
    ASTState state = state();
    if (compatibleTypes_computed) {
      return compatibleTypes_value;
    }
    if (compatibleTypes_visited) {
      throw new RuntimeException("Circular definition of attribute Stmt.compatibleTypes().");
    }
    compatibleTypes_visited = true;
    state().enterLazyAttribute();
    compatibleTypes_value = getExpr().type().compatibleType(boolType());
    compatibleTypes_computed = true;
    state().leaveLazyAttribute();
    compatibleTypes_visited = false;
    return compatibleTypes_value;
  }
}
