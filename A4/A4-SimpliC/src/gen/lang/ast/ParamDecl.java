/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/lang.ast:7
 * @astdecl ParamDecl : ASTNode ::= TypeDecl IdDecl;
 * @production ParamDecl : {@link ASTNode} ::= <span class="component">{@link TypeDecl}</span> <span class="component">{@link IdDecl}</span>;

 */
public class ParamDecl extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Visitor.jrag:133
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/PrettyPrint.jrag:35
   */
  public void prettyPrint(PrintStream out, String ind) {
		getTypeDecl().prettyPrint(out, ind);
		out.print(" ");
		getIdDecl().prettyPrint(out, ind);
	}
  /**
   * @declaredat ASTNode:1
   */
  public ParamDecl() {
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
    name = {"TypeDecl", "IdDecl"},
    type = {"TypeDecl", "IdDecl"},
    kind = {"Child", "Child"}
  )
  public ParamDecl(TypeDecl p0, IdDecl p1) {
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
    typeLookup_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public ParamDecl clone() throws CloneNotSupportedException {
    ParamDecl node = (ParamDecl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public ParamDecl copy() {
    try {
      ParamDecl node = (ParamDecl) clone();
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
   * @declaredat ASTNode:60
   */
  @Deprecated
  public ParamDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public ParamDecl treeCopyNoTransform() {
    ParamDecl tree = (ParamDecl) copy();
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
   * @declaredat ASTNode:90
   */
  public ParamDecl treeCopy() {
    ParamDecl tree = (ParamDecl) copy();
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
   * @declaredat ASTNode:104
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
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:22
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:22")
  public Type typeLookup() {
    ASTState state = state();
    if (typeLookup_computed) {
      return typeLookup_value;
    }
    if (typeLookup_visited) {
      throw new RuntimeException("Circular definition of attribute ParamDecl.typeLookup().");
    }
    typeLookup_visited = true;
    state().enterLazyAttribute();
    typeLookup_value = getParent().Define_typeLookup(this, null);
    typeLookup_computed = true;
    state().leaveLazyAttribute();
    typeLookup_visited = false;
    return typeLookup_value;
  }
/** @apilevel internal */
protected boolean typeLookup_visited = false;
  /** @apilevel internal */
  private void typeLookup_reset() {
    typeLookup_computed = false;
    
    typeLookup_value = null;
    typeLookup_visited = false;
  }
  /** @apilevel internal */
  protected boolean typeLookup_computed = false;

  /** @apilevel internal */
  protected Type typeLookup_value;

  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:28
   * @apilevel internal
   */
  public Type Define_typeLookup(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdDeclNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:25
      return !getTypeDecl().isUnknownType() ? getTypeDecl() : typeLookup();
    }
    else {
      return getParent().Define_typeLookup(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:28
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute typeLookup
   */
  protected boolean canDefine_typeLookup(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
}
