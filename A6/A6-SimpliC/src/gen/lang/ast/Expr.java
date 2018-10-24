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
 * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/lang.ast:22
 * @astdecl Expr : ASTNode;
 * @production Expr : {@link ASTNode};

 */
public abstract class Expr extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:211
   */
  public void genCode(PrintStream out) {}
  /**
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:212
   */
  public void genEval(PrintStream out) {}
  /**
   * @aspect Interpreter
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:86
   */
  public abstract int eval(ActivationRecord actrec);
  /**
   * @declaredat ASTNode:1
   */
  public Expr() {
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
  }
  /** @apilevel internal 
   * @declaredat ASTNode:21
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:25
   */
  public Expr clone() throws CloneNotSupportedException {
    Expr node = (Expr) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:36
   */
  @Deprecated
  public abstract Expr fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:44
   */
  public abstract Expr treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:52
   */
  public abstract Expr treeCopy();
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:4")
  public abstract Type type();
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:30
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:30")
  public abstract Type expectedType();
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:60
    if (!type().equals(expectedType())) {
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
    if (!type().equals(expectedType())) {
      collection.add(error("type " + type().print() + " should be " + expectedType().print() + "!"));
    }
  }
}
