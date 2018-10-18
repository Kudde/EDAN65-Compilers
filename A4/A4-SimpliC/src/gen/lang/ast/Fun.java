/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/lang.ast:3
 * @astdecl Fun : ASTNode ::= TypeDecl IdDecl Param Block;
 * @production Fun : {@link ASTNode} ::= <span class="component">{@link TypeDecl}</span> <span class="component">{@link IdDecl}</span> <span class="component">{@link Param}</span> <span class="component">{@link Block}</span>;

 */
public class Fun extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Visitor.jrag:57
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/PrettyPrint.jrag:16
   */
  public void prettyPrint(PrintStream out, String ind) {
		getTypeDecl().prettyPrint(out, ind);
		out.print(" ");
		getIdDecl().prettyPrint(out, ind);
		getParam().prettyPrint(out, ind);
		getBlock().prettyPrint(out, ind + "\t");
		out.print(ind + "}\n\n");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Fun() {
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
    children = new ASTNode[4];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"TypeDecl", "IdDecl", "Param", "Block"},
    type = {"TypeDecl", "IdDecl", "Param", "Block"},
    kind = {"Child", "Child", "Child", "Child"}
  )
  public Fun(TypeDecl p0, IdDecl p1, Param p2, Block p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 4;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localLookup_String_reset();
    typeLookup_reset();
    argLookup_reset();
    lookup_String_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public Fun clone() throws CloneNotSupportedException {
    Fun node = (Fun) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public Fun copy() {
    try {
      Fun node = (Fun) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public Fun fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public Fun treeCopyNoTransform() {
    Fun tree = (Fun) copy();
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
   * @declaredat ASTNode:95
   */
  public Fun treeCopy() {
    Fun tree = (Fun) copy();
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
   * @declaredat ASTNode:109
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
   * Replaces the Param child.
   * @param node The new node to replace the Param child.
   * @apilevel high-level
   */
  public void setParam(Param node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Param child.
   * @return The current node used as the Param child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Param")
  public Param getParam() {
    return (Param) getChild(2);
  }
  /**
   * Retrieves the Param child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Param child.
   * @apilevel low-level
   */
  public Param getParamNoTransform() {
    return (Param) getChildNoTransform(2);
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   */
  public void setBlock(Block node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Block")
  public Block getBlock() {
    return (Block) getChild(3);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   */
  public Block getBlockNoTransform() {
    return (Block) getChildNoTransform(3);
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
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:29
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:29")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Fun.localLookup(String).");
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
  		for (int i = 0; i < getParam().getNumParamDecl(); i++) {
  			if (getParam().getParamDecl(i).getIdDecl().getID().equals(name))
  				return getParam().getParamDecl(i).getIdDecl();
  		}
  		return unknownDecl();
  	}
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:23
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:23")
  public Type typeLookup() {
    ASTState state = state();
    if (typeLookup_computed) {
      return typeLookup_value;
    }
    if (typeLookup_visited) {
      throw new RuntimeException("Circular definition of attribute Fun.typeLookup().");
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
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:31")
  public int argLookup() {
    ASTState state = state();
    if (argLookup_computed) {
      return argLookup_value;
    }
    if (argLookup_visited) {
      throw new RuntimeException("Circular definition of attribute Fun.argLookup().");
    }
    argLookup_visited = true;
    state().enterLazyAttribute();
    argLookup_value = getParent().Define_argLookup(this, null);
    argLookup_computed = true;
    state().leaveLazyAttribute();
    argLookup_visited = false;
    return argLookup_value;
  }
/** @apilevel internal */
protected boolean argLookup_visited = false;
  /** @apilevel internal */
  private void argLookup_reset() {
    argLookup_computed = false;
    argLookup_visited = false;
  }
  /** @apilevel internal */
  protected boolean argLookup_computed = false;

  /** @apilevel internal */
  protected int argLookup_value;

  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:28
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:28")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Fun.lookup(String).");
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
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:28
   * @apilevel internal
   */
  public Type Define_typeLookup(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdDeclNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:26
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
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:32
   * @apilevel internal
   */
  public int Define_argLookup(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdDeclNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:35
      return getParam().getNumParamDecl();
    }
    else {
      return getParent().Define_argLookup(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:32
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute argLookup
   */
  protected boolean canDefine_argLookup(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:37
   * @apilevel internal
   */
  public Fun Define_funLookup(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdDeclNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:39
      return this;
    }
    else {
      return getParent().Define_funLookup(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:37
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute funLookup
   */
  protected boolean canDefine_funLookup(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:9
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getBlockNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:48
      {
      		IdDecl decl = localLookup(name);
      		return !decl.isUnknown() ? decl : lookup(name);
      	}
    }
    else if (_callerNode == getParamNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:43
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
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:9
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
}
