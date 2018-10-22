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
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\lang.ast:9
 * @astdecl Type : ASTNode;
 * @production Type : {@link ASTNode};

 */
public abstract class Type extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\Visitor.jrag:136
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Type() {
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
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:17
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    isUnknownType_reset();
    isIntType_reset();
    isBoolType_reset();
    compatibleType_Type_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:25
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public Type clone() throws CloneNotSupportedException {
    Type node = (Type) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:40
   */
  @Deprecated
  public abstract Type fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:48
   */
  public abstract Type treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:56
   */
  public abstract Type treeCopy();
  /**
   * @attribute syn
   * @aspect Types
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:57
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:57")
  public abstract String print();
/** @apilevel internal */
protected boolean isUnknownType_visited = false;
  /** @apilevel internal */
  private void isUnknownType_reset() {
    isUnknownType_computed = false;
    isUnknownType_visited = false;
  }
  /** @apilevel internal */
  protected boolean isUnknownType_computed = false;

  /** @apilevel internal */
  protected boolean isUnknownType_value;

  /**
   * @attribute syn
   * @aspect Types
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:41
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:41")
  public boolean isUnknownType() {
    ASTState state = state();
    if (isUnknownType_computed) {
      return isUnknownType_value;
    }
    if (isUnknownType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isUnknownType().");
    }
    isUnknownType_visited = true;
    state().enterLazyAttribute();
    isUnknownType_value = false;
    isUnknownType_computed = true;
    state().leaveLazyAttribute();
    isUnknownType_visited = false;
    return isUnknownType_value;
  }
/** @apilevel internal */
protected boolean isIntType_visited = false;
  /** @apilevel internal */
  private void isIntType_reset() {
    isIntType_computed = false;
    isIntType_visited = false;
  }
  /** @apilevel internal */
  protected boolean isIntType_computed = false;

  /** @apilevel internal */
  protected boolean isIntType_value;

  /**
   * @attribute syn
   * @aspect Types
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:47
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:47")
  public boolean isIntType() {
    ASTState state = state();
    if (isIntType_computed) {
      return isIntType_value;
    }
    if (isIntType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isIntType().");
    }
    isIntType_visited = true;
    state().enterLazyAttribute();
    isIntType_value = false;
    isIntType_computed = true;
    state().leaveLazyAttribute();
    isIntType_visited = false;
    return isIntType_value;
  }
/** @apilevel internal */
protected boolean isBoolType_visited = false;
  /** @apilevel internal */
  private void isBoolType_reset() {
    isBoolType_computed = false;
    isBoolType_visited = false;
  }
  /** @apilevel internal */
  protected boolean isBoolType_computed = false;

  /** @apilevel internal */
  protected boolean isBoolType_value;

  /**
   * @attribute syn
   * @aspect Types
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:53
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\NTAUtils.jrag:53")
  public boolean isBoolType() {
    ASTState state = state();
    if (isBoolType_computed) {
      return isBoolType_value;
    }
    if (isBoolType_visited) {
      throw new RuntimeException("Circular definition of attribute Type.isBoolType().");
    }
    isBoolType_visited = true;
    state().enterLazyAttribute();
    isBoolType_value = false;
    isBoolType_computed = true;
    state().leaveLazyAttribute();
    isBoolType_visited = false;
    return isBoolType_value;
  }
/** @apilevel internal */
protected java.util.Set compatibleType_Type_visited;
  /** @apilevel internal */
  private void compatibleType_Type_reset() {
    compatibleType_Type_values = null;
    compatibleType_Type_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map compatibleType_Type_values;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:40
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:40")
  public boolean compatibleType(Type type) {
    Object _parameters = type;
    if (compatibleType_Type_visited == null) compatibleType_Type_visited = new java.util.HashSet(4);
    if (compatibleType_Type_values == null) compatibleType_Type_values = new java.util.HashMap(4);
    ASTState state = state();
    if (compatibleType_Type_values.containsKey(_parameters)) {
      return (Boolean) compatibleType_Type_values.get(_parameters);
    }
    if (compatibleType_Type_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Type.compatibleType(Type).");
    }
    compatibleType_Type_visited.add(_parameters);
    state().enterLazyAttribute();
    boolean compatibleType_Type_value = this.equals(type);
    compatibleType_Type_values.put(_parameters, compatibleType_Type_value);
    state().leaveLazyAttribute();
    compatibleType_Type_visited.remove(_parameters);
    return compatibleType_Type_value;
  }
}
