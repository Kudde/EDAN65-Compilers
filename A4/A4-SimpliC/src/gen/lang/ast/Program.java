/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/lang.ast:1
 * @astdecl Program : ASTNode ::= Fun*;
 * @production Program : {@link ASTNode} ::= <span class="component">{@link Fun}*</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Visitor.jrag:54
   */
  public Object accept(Visitor visitor, Object data) {
	return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Program() {
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
    name = {"Fun"},
    type = {"List<Fun>"},
    kind = {"List"}
  )
  public Program(List<Fun> p0) {
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
    predefinedFunctions_reset();
    unknownDecl_reset();
    unknownType_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    Program_errors_visited = false;
    Program_errors_computed = false;
    
    Program_errors_value = null;
    contributorMap_Program_errors = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
   * @declaredat ASTNode:67
   */
  @Deprecated
  public Program fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:77
   */
  public Program treeCopyNoTransform() {
    Program tree = (Program) copy();
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
   * @declaredat ASTNode:97
   */
  public Program treeCopy() {
    Program tree = (Program) copy();
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
   * @declaredat ASTNode:111
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Fun list.
   * @param list The new list node to be used as the Fun list.
   * @apilevel high-level
   */
  public void setFunList(List<Fun> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Fun list.
   * @return Number of children in the Fun list.
   * @apilevel high-level
   */
  public int getNumFun() {
    return getFunList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Fun list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Fun list.
   * @apilevel low-level
   */
  public int getNumFunNoTransform() {
    return getFunListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Fun list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Fun list.
   * @apilevel high-level
   */
  public Fun getFun(int i) {
    return (Fun) getFunList().getChild(i);
  }
  /**
   * Check whether the Fun list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasFun() {
    return getFunList().getNumChild() != 0;
  }
  /**
   * Append an element to the Fun list.
   * @param node The element to append to the Fun list.
   * @apilevel high-level
   */
  public void addFun(Fun node) {
    List<Fun> list = (parent == null) ? getFunListNoTransform() : getFunList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addFunNoTransform(Fun node) {
    List<Fun> list = getFunListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Fun list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setFun(Fun node, int i) {
    List<Fun> list = getFunList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Fun list.
   * @return The node representing the Fun list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Fun")
  public List<Fun> getFunList() {
    List<Fun> list = (List<Fun>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Fun list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Fun list.
   * @apilevel low-level
   */
  public List<Fun> getFunListNoTransform() {
    return (List<Fun>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Fun list without
   * triggering rewrites.
   */
  public Fun getFunNoTransform(int i) {
    return (Fun) getFunListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Fun list.
   * @return The node representing the Fun list.
   * @apilevel high-level
   */
  public List<Fun> getFuns() {
    return getFunList();
  }
  /**
   * Retrieves the Fun list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Fun list.
   * @apilevel low-level
   */
  public List<Fun> getFunsNoTransform() {
    return getFunListNoTransform();
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Errors.jrag:26
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_Program_errors = null;

  /** @apilevel internal */
  protected void survey_Program_errors() {
    if (contributorMap_Program_errors == null) {
      contributorMap_Program_errors = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_Program_errors(this, contributorMap_Program_errors);
    }
  }

/** @apilevel internal */
protected boolean predefinedFunctions_visited = false;
  /** @apilevel internal */
  private void predefinedFunctions_reset() {
    predefinedFunctions_computed = false;
    
    predefinedFunctions_value = null;
    predefinedFunctions_visited = false;
  }
  /** @apilevel internal */
  protected boolean predefinedFunctions_computed = false;

  /** @apilevel internal */
  protected List<Fun> predefinedFunctions_value;

  /**
   * @attribute syn
   * @aspect predefinedFunctions
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="predefinedFunctions", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:3")
  public List<Fun> predefinedFunctions() {
    ASTState state = state();
    if (predefinedFunctions_computed) {
      return predefinedFunctions_value;
    }
    if (predefinedFunctions_visited) {
      throw new RuntimeException("Circular definition of attribute Program.predefinedFunctions().");
    }
    predefinedFunctions_visited = true;
    state().enterLazyAttribute();
    predefinedFunctions_value = predefinedFunctions_compute();
    predefinedFunctions_value.setParent(this);
    predefinedFunctions_computed = true;
    state().leaveLazyAttribute();
    predefinedFunctions_visited = false;
    return predefinedFunctions_value;
  }
  /** @apilevel internal */
  private List<Fun> predefinedFunctions_compute() {
    List<Fun> list = new List<Fun>();
    IdDecl d = new IdDecl("print");
    Fun f = new Fun();
    f.setIdDecl(d);
    list.add(f);
    d = new IdDecl("read");
    f = new Fun();
    f.setIdDecl(d);
    list.add(f);
    return list;
  }
/** @apilevel internal */
protected boolean unknownDecl_visited = false;
  /** @apilevel internal */
  private void unknownDecl_reset() {
    unknownDecl_computed = false;
    
    unknownDecl_value = null;
    unknownDecl_visited = false;
  }
  /** @apilevel internal */
  protected boolean unknownDecl_computed = false;

  /** @apilevel internal */
  protected UnknownDecl unknownDecl_value;

  /**
   * @attribute syn
   * @aspect UnknownDecl
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:21
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="UnknownDecl", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:21")
  public UnknownDecl unknownDecl() {
    ASTState state = state();
    if (unknownDecl_computed) {
      return unknownDecl_value;
    }
    if (unknownDecl_visited) {
      throw new RuntimeException("Circular definition of attribute Program.unknownDecl().");
    }
    unknownDecl_visited = true;
    state().enterLazyAttribute();
    unknownDecl_value = new UnknownDecl("<unknown>");
    unknownDecl_value.setParent(this);
    unknownDecl_computed = true;
    state().leaveLazyAttribute();
    unknownDecl_visited = false;
    return unknownDecl_value;
  }
/** @apilevel internal */
protected boolean unknownType_visited = false;
  /** @apilevel internal */
  private void unknownType_reset() {
    unknownType_computed = false;
    
    unknownType_value = null;
    unknownType_visited = false;
  }
  /** @apilevel internal */
  protected boolean unknownType_computed = false;

  /** @apilevel internal */
  protected UnknownType unknownType_value;

  /**
   * @attribute syn
   * @aspect UnknownType
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="UnknownType", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:31")
  public UnknownType unknownType() {
    ASTState state = state();
    if (unknownType_computed) {
      return unknownType_value;
    }
    if (unknownType_visited) {
      throw new RuntimeException("Circular definition of attribute Program.unknownType().");
    }
    unknownType_visited = true;
    state().enterLazyAttribute();
    unknownType_value = new UnknownType("<unknown>");
    unknownType_value.setParent(this);
    unknownType_computed = true;
    state().leaveLazyAttribute();
    unknownType_visited = false;
    return unknownType_value;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Errors.jrag:28
   * @apilevel internal
   */
  public Program Define_program(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return this;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Errors.jrag:28
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute program
   */
  protected boolean canDefine_program(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:16
   * @apilevel internal
   */
  public List<Fun> Define_predefinedFunctions(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return predefinedFunctions();
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:16
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute predefinedFunctions
   */
  protected boolean canDefine_predefinedFunctions(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:23
   * @apilevel internal
   */
  public UnknownDecl Define_unknownDecl(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return unknownDecl();
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:23
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownDecl
   */
  protected boolean canDefine_unknownDecl(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:33
   * @apilevel internal
   */
  public UnknownType Define_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return unknownType();
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/UtilFun.jrag:33
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownType
   */
  protected boolean canDefine_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:28
   * @apilevel internal
   */
  public Type Define_typeLookup(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return unknownType();
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
    int childIndex = this.getIndexOfChild(_callerNode);
    return 0;
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
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:9
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getFunListNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:53
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      {
      		for (Fun f : predefinedFunctions()) {
      			if (f.getIdDecl().getID().equals(name))
      				return f.getIdDecl();
      		}
      		for (int i = 0; i < getNumFun(); i++) {
      			if (getFun(i).getIdDecl().getID().equals(name))
      				return getFun(i).getIdDecl();
      		}
      	return unknownDecl();
      	}
    }
    else {
      int index = this.getIndexOfChild(_callerNode);
      return unknownDecl();
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
/** @apilevel internal */
protected boolean Program_errors_visited = false;
  /**
   * @attribute coll
   * @aspect Errors
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Errors.jrag:26
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Errors", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Errors.jrag:26")
  public Set<ErrorMessage> errors() {
    ASTState state = state();
    if (Program_errors_computed) {
      return Program_errors_value;
    }
    if (Program_errors_visited) {
      throw new RuntimeException("Circular definition of attribute Program.errors().");
    }
    Program_errors_visited = true;
    state().enterLazyAttribute();
    Program_errors_value = errors_compute();
    Program_errors_computed = true;
    state().leaveLazyAttribute();
    Program_errors_visited = false;
    return Program_errors_value;
  }
  /** @apilevel internal */
  private Set<ErrorMessage> errors_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof Program)) {
      node = node.getParent();
    }
    Program root = (Program) node;
    root.survey_Program_errors();
    Set<ErrorMessage> _computedValue = new TreeSet<ErrorMessage>();
    if (root.contributorMap_Program_errors.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_Program_errors.get(this)) {
        contributor.contributeTo_Program_errors(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected boolean Program_errors_computed = false;

  /** @apilevel internal */
  protected Set<ErrorMessage> Program_errors_value;

}
