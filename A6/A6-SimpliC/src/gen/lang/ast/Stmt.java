/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/lang.ast:14
 * @astdecl Stmt : ASTNode;
 * @production Stmt : {@link ASTNode};

 */
public abstract class Stmt extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:153
   */
  public void genCode(PrintStream out) {}
  /**
   * @aspect Interpreter
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:37
   */
  public abstract void eval(ActivationRecord actrec)
        throws ReturnException;
  /**
   * @declaredat ASTNode:1
   */
  public Stmt() {
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
    isIncompatible_reset();
    compatibleTypes_reset();
    localLookup_String_reset();
    index_reset();
    funName_reset();
    uniqueId_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public Stmt clone() throws CloneNotSupportedException {
    Stmt node = (Stmt) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:42
   */
  @Deprecated
  public abstract Stmt fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract Stmt treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract Stmt treeCopy();
/** @apilevel internal */
protected boolean isIncompatible_visited = false;
  /** @apilevel internal */
  private void isIncompatible_reset() {
    isIncompatible_computed = false;
    isIncompatible_visited = false;
  }
  /** @apilevel internal */
  protected boolean isIncompatible_computed = false;

  /** @apilevel internal */
  protected boolean isIncompatible_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:38
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:38")
  public boolean isIncompatible() {
    ASTState state = state();
    if (isIncompatible_computed) {
      return isIncompatible_value;
    }
    if (isIncompatible_visited) {
      throw new RuntimeException("Circular definition of attribute Stmt.isIncompatible().");
    }
    isIncompatible_visited = true;
    state().enterLazyAttribute();
    isIncompatible_value = !compatibleTypes();
    isIncompatible_computed = true;
    state().leaveLazyAttribute();
    isIncompatible_visited = false;
    return isIncompatible_value;
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
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:42
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:42")
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
    compatibleTypes_value = true;
    compatibleTypes_computed = true;
    state().leaveLazyAttribute();
    compatibleTypes_visited = false;
    return compatibleTypes_value;
  }
/** @apilevel internal */
protected java.util.Set localLookup_String_visited;
  /** @apilevel internal */
  private void localLookup_String_reset() {
    localLookup_String_values = null;
    localLookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map localLookup_String_values;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NameAnalysis.jrag:22
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NameAnalysis.jrag:22")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Stmt.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_value = unknownDecl();
    localLookup_String_values.put(_parameters, localLookup_String_value);
    state().leaveLazyAttribute();
    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
  /**
   * @attribute inh
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:201
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:201")
  public int index() {
    ASTState state = state();
    if (index_computed) {
      return index_value;
    }
    if (index_visited) {
      throw new RuntimeException("Circular definition of attribute Stmt.index().");
    }
    index_visited = true;
    state().enterLazyAttribute();
    index_value = getParent().Define_index(this, null);
    index_computed = true;
    state().leaveLazyAttribute();
    index_visited = false;
    return index_value;
  }
/** @apilevel internal */
protected boolean index_visited = false;
  /** @apilevel internal */
  private void index_reset() {
    index_computed = false;
    index_visited = false;
  }
  /** @apilevel internal */
  protected boolean index_computed = false;

  /** @apilevel internal */
  protected int index_value;

  /**
   * @attribute inh
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:204
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:204")
  public String funName() {
    ASTState state = state();
    if (funName_computed) {
      return funName_value;
    }
    if (funName_visited) {
      throw new RuntimeException("Circular definition of attribute Stmt.funName().");
    }
    funName_visited = true;
    state().enterLazyAttribute();
    funName_value = getParent().Define_funName(this, null);
    funName_computed = true;
    state().leaveLazyAttribute();
    funName_visited = false;
    return funName_value;
  }
/** @apilevel internal */
protected boolean funName_visited = false;
  /** @apilevel internal */
  private void funName_reset() {
    funName_computed = false;
    
    funName_value = null;
    funName_visited = false;
  }
  /** @apilevel internal */
  protected boolean funName_computed = false;

  /** @apilevel internal */
  protected String funName_value;

  /**
   * @attribute inh
   * @aspect Interpreter
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:194
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Interpreter", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:194")
  public String uniqueId() {
    ASTState state = state();
    if (uniqueId_computed) {
      return uniqueId_value;
    }
    if (uniqueId_visited) {
      throw new RuntimeException("Circular definition of attribute Stmt.uniqueId().");
    }
    uniqueId_visited = true;
    state().enterLazyAttribute();
    uniqueId_value = getParent().Define_uniqueId(this, null);
    uniqueId_computed = true;
    state().leaveLazyAttribute();
    uniqueId_visited = false;
    return uniqueId_value;
  }
/** @apilevel internal */
protected boolean uniqueId_visited = false;
  /** @apilevel internal */
  private void uniqueId_reset() {
    uniqueId_computed = false;
    
    uniqueId_value = null;
    uniqueId_visited = false;
  }
  /** @apilevel internal */
  protected boolean uniqueId_computed = false;

  /** @apilevel internal */
  protected String uniqueId_value;

  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:64
    if (isIncompatible()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Program_errors(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (isIncompatible()) {
      collection.add(error("Incompatible types!"));
    }
  }
}
