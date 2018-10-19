/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/lang.ast:27
 * @astdecl BoolLiteral : Expr ::= <BOOLEAN:String>;
 * @production BoolLiteral : {@link Expr} ::= <span class="component">&lt;BOOLEAN:String&gt;</span>;

 */
public class BoolLiteral extends Expr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public BoolLiteral() {
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
    name = {"BOOLEAN"},
    type = {"String"},
    kind = {"Token"}
  )
  public BoolLiteral(String p0) {
    setBOOLEAN(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public BoolLiteral(beaver.Symbol p0) {
    setBOOLEAN(p0);
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
    type_reset();
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
  public BoolLiteral clone() throws CloneNotSupportedException {
    BoolLiteral node = (BoolLiteral) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public BoolLiteral copy() {
    try {
      BoolLiteral node = (BoolLiteral) clone();
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
  public BoolLiteral fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public BoolLiteral treeCopyNoTransform() {
    BoolLiteral tree = (BoolLiteral) copy();
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
  public BoolLiteral treeCopy() {
    BoolLiteral tree = (BoolLiteral) copy();
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
    return super.is$Equal(node) && (tokenString_BOOLEAN == ((BoolLiteral) node).tokenString_BOOLEAN);    
  }
  /**
   * Replaces the lexeme BOOLEAN.
   * @param value The new value for the lexeme BOOLEAN.
   * @apilevel high-level
   */
  public void setBOOLEAN(String value) {
    tokenString_BOOLEAN = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_BOOLEAN;
  /**
   */
  public int BOOLEANstart;
  /**
   */
  public int BOOLEANend;
  /**
   * JastAdd-internal setter for lexeme BOOLEAN using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme BOOLEAN
   * @apilevel internal
   */
  public void setBOOLEAN(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setBOOLEAN is only valid for String lexemes");
    tokenString_BOOLEAN = (String)symbol.value;
    BOOLEANstart = symbol.getStart();
    BOOLEANend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme BOOLEAN.
   * @return The value for the lexeme BOOLEAN.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="BOOLEAN")
  public String getBOOLEAN() {
    return tokenString_BOOLEAN != null ? tokenString_BOOLEAN : "";
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /** @apilevel internal */
  private void type_reset() {
    type_computed = false;
    
    type_value = null;
    type_visited = false;
  }
  /** @apilevel internal */
  protected boolean type_computed = false;

  /** @apilevel internal */
  protected Type type_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:15
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:15")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute BoolLiteral.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = new BoolType();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
}
