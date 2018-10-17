/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\lang.ast:4
 * @astdecl Param : ASTNode ::= ParamDecl*;
 * @production Param : {@link ASTNode} ::= <span class="component">{@link ParamDecl}*</span>;

 */
public class Param extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\PrettyPrint.jrag:25
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("(");
		for(int i = 0; i < getNumParamDecl(); i++) {
			getParamDecl(i).prettyPrint(out, ind);
				if(i != getNumParamDecl() - 1)
					out.print(", ");
		}
		out.print(")");
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\Visitor.jrag:60
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Param() {
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
    name = {"ParamDecl"},
    type = {"List<ParamDecl>"},
    kind = {"List"}
  )
  public Param(List<ParamDecl> p0) {
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
  public Param clone() throws CloneNotSupportedException {
    Param node = (Param) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Param copy() {
    try {
      Param node = (Param) clone();
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
  public Param fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public Param treeCopyNoTransform() {
    Param tree = (Param) copy();
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
  public Param treeCopy() {
    Param tree = (Param) copy();
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
   * Replaces the ParamDecl list.
   * @param list The new list node to be used as the ParamDecl list.
   * @apilevel high-level
   */
  public void setParamDeclList(List<ParamDecl> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ParamDecl list.
   * @return Number of children in the ParamDecl list.
   * @apilevel high-level
   */
  public int getNumParamDecl() {
    return getParamDeclList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ParamDecl list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ParamDecl list.
   * @apilevel low-level
   */
  public int getNumParamDeclNoTransform() {
    return getParamDeclListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ParamDecl list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ParamDecl list.
   * @apilevel high-level
   */
  public ParamDecl getParamDecl(int i) {
    return (ParamDecl) getParamDeclList().getChild(i);
  }
  /**
   * Check whether the ParamDecl list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParamDecl() {
    return getParamDeclList().getNumChild() != 0;
  }
  /**
   * Append an element to the ParamDecl list.
   * @param node The element to append to the ParamDecl list.
   * @apilevel high-level
   */
  public void addParamDecl(ParamDecl node) {
    List<ParamDecl> list = (parent == null) ? getParamDeclListNoTransform() : getParamDeclList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParamDeclNoTransform(ParamDecl node) {
    List<ParamDecl> list = getParamDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ParamDecl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParamDecl(ParamDecl node, int i) {
    List<ParamDecl> list = getParamDeclList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ParamDecl list.
   * @return The node representing the ParamDecl list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ParamDecl")
  public List<ParamDecl> getParamDeclList() {
    List<ParamDecl> list = (List<ParamDecl>) getChild(0);
    return list;
  }
  /**
   * Retrieves the ParamDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParamDecl list.
   * @apilevel low-level
   */
  public List<ParamDecl> getParamDeclListNoTransform() {
    return (List<ParamDecl>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the ParamDecl list without
   * triggering rewrites.
   */
  public ParamDecl getParamDeclNoTransform(int i) {
    return (ParamDecl) getParamDeclListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ParamDecl list.
   * @return The node representing the ParamDecl list.
   * @apilevel high-level
   */
  public List<ParamDecl> getParamDecls() {
    return getParamDeclList();
  }
  /**
   * Retrieves the ParamDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParamDecl list.
   * @apilevel low-level
   */
  public List<ParamDecl> getParamDeclsNoTransform() {
    return getParamDeclListNoTransform();
  }
}
