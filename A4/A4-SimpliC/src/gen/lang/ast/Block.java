/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\lang.ast:5
 * @astdecl Block : Stmt ::= Stmt*;
 * @production Block : {@link Stmt} ::= <span class="component">{@link Stmt}*</span>;

 */
public class Block extends Stmt implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\PrettyPrint.jrag:42
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(" {\n");
		for (int i = 0; i < getNumStmt(); i++) {
			getStmt(i).prettyPrint(out, ind);
		}
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\Visitor.jrag:63
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Block() {
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
    name = {"Stmt"},
    type = {"List<Stmt>"},
    kind = {"List"}
  )
  public Block(List<Stmt> p0) {
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
    localLookup_String_reset();
    lookup_String_reset();
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
  public Block clone() throws CloneNotSupportedException {
    Block node = (Block) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Block copy() {
    try {
      Block node = (Block) clone();
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
  public Block fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Block treeCopyNoTransform() {
    Block tree = (Block) copy();
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
  public Block treeCopy() {
    Block tree = (Block) copy();
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
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Stmt list.
   * @param list The new list node to be used as the Stmt list.
   * @apilevel high-level
   */
  public void setStmtList(List<Stmt> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Stmt list.
   * @return Number of children in the Stmt list.
   * @apilevel high-level
   */
  public int getNumStmt() {
    return getStmtList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Stmt list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Stmt list.
   * @apilevel low-level
   */
  public int getNumStmtNoTransform() {
    return getStmtListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Stmt list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Stmt list.
   * @apilevel high-level
   */
  public Stmt getStmt(int i) {
    return (Stmt) getStmtList().getChild(i);
  }
  /**
   * Check whether the Stmt list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasStmt() {
    return getStmtList().getNumChild() != 0;
  }
  /**
   * Append an element to the Stmt list.
   * @param node The element to append to the Stmt list.
   * @apilevel high-level
   */
  public void addStmt(Stmt node) {
    List<Stmt> list = (parent == null) ? getStmtListNoTransform() : getStmtList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addStmtNoTransform(Stmt node) {
    List<Stmt> list = getStmtListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Stmt list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setStmt(Stmt node, int i) {
    List<Stmt> list = getStmtList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Stmt list.
   * @return The node representing the Stmt list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Stmt")
  public List<Stmt> getStmtList() {
    List<Stmt> list = (List<Stmt>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Stmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stmt list.
   * @apilevel low-level
   */
  public List<Stmt> getStmtListNoTransform() {
    return (List<Stmt>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Stmt list without
   * triggering rewrites.
   */
  public Stmt getStmtNoTransform(int i) {
    return (Stmt) getStmtListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Stmt list.
   * @return The node representing the Stmt list.
   * @apilevel high-level
   */
  public List<Stmt> getStmts() {
    return getStmtList();
  }
  /**
   * Retrieves the Stmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stmt list.
   * @apilevel low-level
   */
  public List<Stmt> getStmtsNoTransform() {
    return getStmtListNoTransform();
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
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\NameAnalysis.jrag:13
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\NameAnalysis.jrag:13")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Block.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_value = localLookup_compute(name);
    localLookup_String_values.put(_parameters, localLookup_String_value);
    state().leaveLazyAttribute();
    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
  /** @apilevel internal */
  private IdDecl localLookup_compute(String name) {
  		for (int i = 0; i < getNumStmt(); i++) {
  			IdDecl decl = getStmt(i).localLookup(name);
  			if (!decl.isUnknown()) return decl;
  		}
  		return unknownDecl();
  	}
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\NameAnalysis.jrag:12
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\NameAnalysis.jrag:12")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Block.lookup(String).");
    }
    lookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl lookup_String_value = getParent().Define_lookup(this, null, name);
    lookup_String_values.put(_parameters, lookup_String_value);
    state().leaveLazyAttribute();
    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_visited;
  /** @apilevel internal */
  private void lookup_String_reset() {
    lookup_String_values = null;
    lookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookup_String_values;

  /**
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\NameAnalysis.jrag:9
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getStmtListNoTransform()) {
      // @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\NameAnalysis.jrag:38
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      {
      		IdDecl decl = localLookup(name);
      		return !decl.isUnknown() ? decl : lookup(name);
      	}
    }
    else {
      return getParent().Define_lookup(this, _callerNode, name);
    }
  }
  /**
   * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A4\\A4-SimpliC\\src\\jastadd\\NameAnalysis.jrag:9
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
}
