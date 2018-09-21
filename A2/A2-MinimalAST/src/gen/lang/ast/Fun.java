/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/ludde/ht18/edan65/A2/A2-MinimalAST/src/jastadd/lang.ast:3
 * @astdecl Fun : ASTNode ::= type:TypeDecl name:IdDecl;
 * @production Fun : {@link ASTNode} ::= <span class="component">type:{@link TypeDecl}</span> <span class="component">name:{@link IdDecl}</span>;

 */
public class Fun extends ASTNode<ASTNode> implements Cloneable {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"type", "name"},
    type = {"TypeDecl", "IdDecl"},
    kind = {"Child", "Child"}
  )
  public Fun(TypeDecl p0, IdDecl p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Fun clone() throws CloneNotSupportedException {
    Fun node = (Fun) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
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
   * @declaredat ASTNode:59
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
   * @declaredat ASTNode:69
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
   * @declaredat ASTNode:89
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
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the type child.
   * @param node The new node to replace the type child.
   * @apilevel high-level
   */
  public void settype(TypeDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the type child.
   * @return The current node used as the type child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="type")
  public TypeDecl gettype() {
    return (TypeDecl) getChild(0);
  }
  /**
   * Retrieves the type child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the type child.
   * @apilevel low-level
   */
  public TypeDecl gettypeNoTransform() {
    return (TypeDecl) getChildNoTransform(0);
  }
  /**
   * Replaces the name child.
   * @param node The new node to replace the name child.
   * @apilevel high-level
   */
  public void setname(IdDecl node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the name child.
   * @return The current node used as the name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="name")
  public IdDecl getname() {
    return (IdDecl) getChild(1);
  }
  /**
   * Retrieves the name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the name child.
   * @apilevel low-level
   */
  public IdDecl getnameNoTransform() {
    return (IdDecl) getChildNoTransform(1);
  }
}
