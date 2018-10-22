/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/lang.ast:11
 * @astdecl BoolType : Type ::= <ID:String>;
 * @production BoolType : {@link Type} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class BoolType extends Type implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public BoolType() {
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
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"ID"},
    type = {"String"},
    kind = {"Token"}
  )
  public BoolType(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public BoolType(beaver.Symbol p0) {
    setID(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    isBoolType_reset();
    print_reset();
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
  public BoolType clone() throws CloneNotSupportedException {
    BoolType node = (BoolType) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public BoolType copy() {
    try {
      BoolType node = (BoolType) clone();
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
  public BoolType fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public BoolType treeCopyNoTransform() {
    BoolType tree = (BoolType) copy();
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
  public BoolType treeCopy() {
    BoolType tree = (BoolType) copy();
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
    return super.is$Equal(node) && (tokenString_ID == ((BoolType) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
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
   * @declaredat /Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/NTAUtils.jrag:54
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/NTAUtils.jrag:53")
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
    isBoolType_value = true;
    isBoolType_computed = true;
    state().leaveLazyAttribute();
    isBoolType_visited = false;
    return isBoolType_value;
  }
/** @apilevel internal */
protected boolean print_visited = false;
  /** @apilevel internal */
  private void print_reset() {
    print_computed = false;
    
    print_value = null;
    print_visited = false;
  }
  /** @apilevel internal */
  protected boolean print_computed = false;

  /** @apilevel internal */
  protected String print_value;

  /**
   * @attribute syn
   * @aspect Types
   * @declaredat /Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/NTAUtils.jrag:59
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/NTAUtils.jrag:57")
  public String print() {
    ASTState state = state();
    if (print_computed) {
      return print_value;
    }
    if (print_visited) {
      throw new RuntimeException("Circular definition of attribute Type.print().");
    }
    print_visited = true;
    state().enterLazyAttribute();
    print_value = "boolType";
    print_computed = true;
    state().leaveLazyAttribute();
    print_visited = false;
    return print_value;
  }
}
