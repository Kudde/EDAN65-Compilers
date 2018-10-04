/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\A2-MinimalAST\\src\\jastadd\\lang.ast:1
 * @astdecl Program : ASTNode ::= Fun*;
 * @production Program : {@link ASTNode} ::= <span class="component">{@link Fun}*</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\A2-MinimalAST\\src\\jastadd\\Visitor.jrag:46
   */
  public Object accept(Visitor visitor, Object data) {
	return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Program() {
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
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Fun"},
    type = {"List<Fun>"},
    kind = {"List"}
  )
  public Program(List<Fun> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
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
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
  public Program fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public Program treeCopyNoTransform() {
    Program tree = (Program) copy();
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
  public Program treeCopy() {
    Program tree = (Program) copy();
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
   * Replaces the Fun list.
   * @param list The new list node to be used as the Fun list.
   * @apilevel high-level
   */
  public void setFunList(List<Fun> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Fun list.
   * @return Number of children in the Fun list.
   * @apilevel high-level
   */
  public int getNumFun() {
    return getFunList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Fun list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Fun list.
   * @apilevel low-level
   */
  public int getNumFunNoTransform() {
    return getFunListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Fun list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Fun list.
   * @apilevel high-level
   */
  public Fun getFun(int i) {
    return (Fun) getFunList().getChild(i);
  }
  /**
   * Check whether the Fun list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasFun() {
    return getFunList().getNumChild() != 0;
  }
  /**
   * Append an element to the Fun list.
   * @param node The element to append to the Fun list.
   * @apilevel high-level
   */
  public void addFun(Fun node) {
    List<Fun> list = (parent == null) ? getFunListNoTransform() : getFunList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addFunNoTransform(Fun node) {
    List<Fun> list = getFunListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Fun list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setFun(Fun node, int i) {
    List<Fun> list = getFunList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Fun list.
   * @return The node representing the Fun list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Fun")
  public List<Fun> getFunList() {
    List<Fun> list = (List<Fun>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Fun list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Fun list.
   * @apilevel low-level
   */
  public List<Fun> getFunListNoTransform() {
    return (List<Fun>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Fun list without
   * triggering rewrites.
   */
  public Fun getFunNoTransform(int i) {
    return (Fun) getFunListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Fun list.
   * @return The node representing the Fun list.
   * @apilevel high-level
   */
  public List<Fun> getFuns() {
    return getFunList();
  }
  /**
   * Retrieves the Fun list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Fun list.
   * @apilevel low-level
   */
  public List<Fun> getFunsNoTransform() {
    return getFunListNoTransform();
  }
}
