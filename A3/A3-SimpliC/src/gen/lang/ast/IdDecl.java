/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.HashSet;
/**
 * @ast node
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\src\\jastadd\\lang.ast:36
 * @astdecl IdDecl : ASTNode ::= <Decl:String>;
 * @production IdDecl : {@link ASTNode} ::= <span class="component">&lt;Decl:String&gt;</span>;

 */
public class IdDecl extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\src\\jastadd\\NameAnalysis.jrag:92
   */
  public void checkNames(PrintStream err, SymbolTable symbols) {
		if (!symbols.declare(getDecl())) {
			err.format("Error at line %d: symbol \'%s\' is already declared!", getLine(), getDecl());
			err.println();
		}
	}
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\src\\jastadd\\PrettyPrint.jrag:163
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getDecl());
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A3\\A3-SimpliC\\src\\jastadd\\Visitor.jrag:130
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public IdDecl() {
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
    name = {"Decl"},
    type = {"String"},
    kind = {"Token"}
  )
  public IdDecl(String p0) {
    setDecl(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public IdDecl(beaver.Symbol p0) {
    setDecl(p0);
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
  public IdDecl clone() throws CloneNotSupportedException {
    IdDecl node = (IdDecl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public IdDecl copy() {
    try {
      IdDecl node = (IdDecl) clone();
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
  public IdDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public IdDecl treeCopyNoTransform() {
    IdDecl tree = (IdDecl) copy();
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
  public IdDecl treeCopy() {
    IdDecl tree = (IdDecl) copy();
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
    return super.is$Equal(node) && (tokenString_Decl == ((IdDecl) node).tokenString_Decl);    
  }
  /**
   * Replaces the lexeme Decl.
   * @param value The new value for the lexeme Decl.
   * @apilevel high-level
   */
  public void setDecl(String value) {
    tokenString_Decl = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Decl;
  /**
   */
  public int Declstart;
  /**
   */
  public int Declend;
  /**
   * JastAdd-internal setter for lexeme Decl using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Decl
   * @apilevel internal
   */
  public void setDecl(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setDecl is only valid for String lexemes");
    tokenString_Decl = (String)symbol.value;
    Declstart = symbol.getStart();
    Declend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Decl.
   * @return The value for the lexeme Decl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Decl")
  public String getDecl() {
    return tokenString_Decl != null ? tokenString_Decl : "";
  }
}
