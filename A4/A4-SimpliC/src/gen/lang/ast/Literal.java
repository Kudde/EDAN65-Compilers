/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/lang.ast:26
 * @astdecl Literal : Expr ::= <NUMERAL:String>;
 * @production Literal : {@link Expr} ::= <span class="component">&lt;NUMERAL:String&gt;</span>;

 */
public class Literal extends Expr implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Visitor.jrag:127
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/PrettyPrint.jrag:155
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getNUMERAL());
	}
  /**
   * @declaredat ASTNode:1
   */
  public Literal() {
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
    name = {"NUMERAL"},
    type = {"String"},
    kind = {"Token"}
  )
  public Literal(String p0) {
    setNUMERAL(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public Literal(beaver.Symbol p0) {
    setNUMERAL(p0);
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
<<<<<<< HEAD
    expectedType_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
=======
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
<<<<<<< HEAD
   * @declaredat ASTNode:38
=======
   * @declaredat ASTNode:37
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
   */
  public Literal clone() throws CloneNotSupportedException {
    Literal node = (Literal) super.clone();
    return node;
  }
  /** @apilevel internal 
<<<<<<< HEAD
   * @declaredat ASTNode:43
=======
   * @declaredat ASTNode:42
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
   */
  public Literal copy() {
    try {
      Literal node = (Literal) clone();
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
<<<<<<< HEAD
   * @declaredat ASTNode:62
=======
   * @declaredat ASTNode:61
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
   */
  @Deprecated
  public Literal fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
<<<<<<< HEAD
   * @declaredat ASTNode:72
=======
   * @declaredat ASTNode:71
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
   */
  public Literal treeCopyNoTransform() {
    Literal tree = (Literal) copy();
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
<<<<<<< HEAD
   * @declaredat ASTNode:92
=======
   * @declaredat ASTNode:91
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
   */
  public Literal treeCopy() {
    Literal tree = (Literal) copy();
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
<<<<<<< HEAD
   * @declaredat ASTNode:106
=======
   * @declaredat ASTNode:105
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_NUMERAL == ((Literal) node).tokenString_NUMERAL);    
  }
  /**
   * Replaces the lexeme NUMERAL.
   * @param value The new value for the lexeme NUMERAL.
   * @apilevel high-level
   */
  public void setNUMERAL(String value) {
    tokenString_NUMERAL = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_NUMERAL;
  /**
   */
  public int NUMERALstart;
  /**
   */
  public int NUMERALend;
  /**
   * JastAdd-internal setter for lexeme NUMERAL using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme NUMERAL
   * @apilevel internal
   */
  public void setNUMERAL(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setNUMERAL is only valid for String lexemes");
    tokenString_NUMERAL = (String)symbol.value;
    NUMERALstart = symbol.getStart();
    NUMERALend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme NUMERAL.
   * @return The value for the lexeme NUMERAL.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="NUMERAL")
  public String getNUMERAL() {
    return tokenString_NUMERAL != null ? tokenString_NUMERAL : "";
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
<<<<<<< HEAD
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:9
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:4")
=======
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:14
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:14")
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
<<<<<<< HEAD
      throw new RuntimeException("Circular definition of attribute Expr.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = intType();
=======
      throw new RuntimeException("Circular definition of attribute Literal.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = new IntType();
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
<<<<<<< HEAD
/** @apilevel internal */
protected boolean expectedType_visited = false;
  /** @apilevel internal */
  private void expectedType_reset() {
    expectedType_computed = false;
    
    expectedType_value = null;
    expectedType_visited = false;
  }
  /** @apilevel internal */
  protected boolean expectedType_computed = false;

  /** @apilevel internal */
  protected Type expectedType_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\TypeAnalysis.jrag:30")
  public Type expectedType() {
    ASTState state = state();
    if (expectedType_computed) {
      return expectedType_value;
    }
    if (expectedType_visited) {
      throw new RuntimeException("Circular definition of attribute Expr.expectedType().");
    }
    expectedType_visited = true;
    state().enterLazyAttribute();
    expectedType_value = intType();
    expectedType_computed = true;
    state().leaveLazyAttribute();
    expectedType_visited = false;
    return expectedType_value;
  }
=======
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2
}
