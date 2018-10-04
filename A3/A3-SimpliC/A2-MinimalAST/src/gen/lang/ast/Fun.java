/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\A2-MinimalAST\\src\\jastadd\\lang.ast:3
 * @astdecl Fun : ASTNode ::= TypeDecl IdDecl Param Block;
 * @production Fun : {@link ASTNode} ::= <span class="component">{@link TypeDecl}</span> <span class="component">{@link IdDecl}</span> <span class="component">{@link Param}</span> <span class="component">{@link Block}</span>;

 */
public class Fun extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\A2-MinimalAST\\src\\jastadd\\PrettyPrint.jrag:16
   */
  public void prettyPrint(PrintStream out, String ind) {
		getTypeDecl().prettyPrint(out, ind);
		out.print(" ");
		getIdDecl().prettyPrint(out, ind);
		getParam().prettyPrint(out, ind);
		getBlock().prettyPrint(out, ind + "\t");
		out.print(ind + "}\n\n");
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\A2-MinimalAST\\src\\jastadd\\Visitor.jrag:49
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Fun() {
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
    children = new ASTNode[4];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"TypeDecl", "IdDecl", "Param", "Block"},
    type = {"TypeDecl", "IdDecl", "Param", "Block"},
    kind = {"Child", "Child", "Child", "Child"}
  )
  public Fun(TypeDecl p0, IdDecl p1, Param p2, Block p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 4;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public Fun clone() throws CloneNotSupportedException {
    Fun node = (Fun) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Fun copy() {
    try {
      Fun node = (Fun) clone();
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
   * @declaredat ASTNode:61
   */
  @Deprecated
  public Fun fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Fun treeCopyNoTransform() {
    Fun tree = (Fun) copy();
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
   * @declaredat ASTNode:91
   */
  public Fun treeCopy() {
    Fun tree = (Fun) copy();
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
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the TypeDecl child.
   * @param node The new node to replace the TypeDecl child.
   * @apilevel high-level
   */
  public void setTypeDecl(TypeDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the TypeDecl child.
   * @return The current node used as the TypeDecl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="TypeDecl")
  public TypeDecl getTypeDecl() {
    return (TypeDecl) getChild(0);
  }
  /**
   * Retrieves the TypeDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the TypeDecl child.
   * @apilevel low-level
   */
  public TypeDecl getTypeDeclNoTransform() {
    return (TypeDecl) getChildNoTransform(0);
  }
  /**
   * Replaces the IdDecl child.
   * @param node The new node to replace the IdDecl child.
   * @apilevel high-level
   */
  public void setIdDecl(IdDecl node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the IdDecl child.
   * @return The current node used as the IdDecl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdDecl")
  public IdDecl getIdDecl() {
    return (IdDecl) getChild(1);
  }
  /**
   * Retrieves the IdDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdDecl child.
   * @apilevel low-level
   */
  public IdDecl getIdDeclNoTransform() {
    return (IdDecl) getChildNoTransform(1);
  }
  /**
   * Replaces the Param child.
   * @param node The new node to replace the Param child.
   * @apilevel high-level
   */
  public void setParam(Param node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Param child.
   * @return The current node used as the Param child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Param")
  public Param getParam() {
    return (Param) getChild(2);
  }
  /**
   * Retrieves the Param child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Param child.
   * @apilevel low-level
   */
  public Param getParamNoTransform() {
    return (Param) getChildNoTransform(2);
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   */
  public void setBlock(Block node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Block")
  public Block getBlock() {
    return (Block) getChild(3);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   */
  public Block getBlockNoTransform() {
    return (Block) getChildNoTransform(3);
  }
}
