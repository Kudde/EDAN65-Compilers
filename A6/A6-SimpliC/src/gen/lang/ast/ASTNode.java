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
 * @astdecl ASTNode;
 * @production ASTNode;

 */
public class ASTNode<T extends ASTNode> extends beaver.Symbol implements Cloneable {
  /**
   * @aspect Errors
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:22
   */
  protected ErrorMessage error(String message) {
		return new ErrorMessage(message, getLine(getStart()));
	}
  /**
   * @aspect DumpTree
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/DumpTree.jrag:9
   */
  private static final String DUMP_TREE_INDENT = "  ";
  /**
   * @aspect DumpTree
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/DumpTree.jrag:11
   */
  public String dumpTree() {
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		dumpTree(new PrintStream(bytes));
		return bytes.toString();
	}
  /**
   * @aspect DumpTree
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/DumpTree.jrag:17
   */
  public void dumpTree(PrintStream out) {
		dumpTree(out, "");
		out.flush();
	}
  /**
   * @aspect DumpTree
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/DumpTree.jrag:22
   */
  public void dumpTree(PrintStream out, String indent) {
		out.print(indent + getClass().getSimpleName());
		out.println(getTokens());
		String childIndent = indent + DUMP_TREE_INDENT;
		for (ASTNode child : astChildren()) {
			if (child == null) {
				out.println(childIndent + "null");
			} else {
				child.dumpTree(out, childIndent);
			}
		}
	}
  /**
   * @aspect DumpTree
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/DumpTree.jrag:35
   */
  public String getTokens() {
		java.util.TreeSet<java.lang.reflect.Method> methods = new java.util.TreeSet<>(
				new java.util.Comparator<java.lang.reflect.Method>() {
					public int compare(java.lang.reflect.Method m1, java.lang.reflect.Method m2) {
						return m1.getName().compareTo(m2.getName());
					}
				});

		methods.addAll(java.util.Arrays.asList(getClass().getMethods()));

		String result = "";
		for (java.lang.reflect.Method method : methods) {
			ASTNodeAnnotation.Token token = method.getAnnotation(ASTNodeAnnotation.Token.class);
			if (token != null) {
				try {
					result += String.format(" %s=\"%s\"", token.name(), method.invoke(this));
				} catch (IllegalAccessException ignored) {
				} catch (InvocationTargetException ignored) {
				}
			}
		}
		return result;
	}
  /**
   * @aspect Visitor
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Visitor.jrag:51
   */
  public Object accept(Visitor visitor, Object data) {
		throw new Error("Visitor: accept method not available for " + getClass().getName());
	}
  /**
   * @aspect Interpreter
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:208
   */
  protected Fun funcall() {
      		return null;
      	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/PrettyPrint.jrag:4
   */
  public void prettyPrint(PrintStream out) {
		prettyPrint(out, "");
		out.println();
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/PrettyPrint.jrag:9
   */
  public void prettyPrint(PrintStream out, String ind) {
		for (int i = 0; i < getNumChild(); ++i) {
			getChild(i).prettyPrint(out, ind);
		}
	}
  /**
   * @declaredat ASTNode:1
   */
  public ASTNode() {
    super();
    init$Children();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:11
   */
  public void init$Children() {
  }
  /**
   * Cached child index. Child indices are assumed to never change (AST should
   * not change after construction).
   * @apilevel internal
   * @declaredat ASTNode:18
   */
  private int childIndex = -1;
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  public int getIndexOfChild(ASTNode node) {
    if (node == null) {
      return -1;
    }
    if (node.childIndex >= 0) {
      return node.childIndex;
    }
    for (int i = 0; children != null && i < children.length; i++) {
      if (children[i] == node) {
        node.childIndex = i;
        return i;
      }
    }
    return -1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public static final boolean generatedWithCacheCycle = true;
  /** @apilevel low-level 
   * @declaredat ASTNode:41
   */
  protected ASTNode parent;
  /** @apilevel low-level 
   * @declaredat ASTNode:44
   */
  protected ASTNode[] children;
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  private static ASTState state = new ASTState();
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public final ASTState state() {
    return state;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:56
   */
  public final static ASTState resetState() {
    return state = new ASTState();
  }
  /**
   * @return an iterator that can be used to iterate over the children of this node.
   * The iterator does not allow removing children.
   * @declaredat ASTNode:65
   */
  public java.util.Iterator<T> astChildIterator() {
    return new java.util.Iterator<T>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < getNumChild();
      }

      @Override
      public T next() {
        return hasNext() ? (T) getChild(index++) : null;
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
  /** @return an object that can be used to iterate over the children of this node 
   * @declaredat ASTNode:87
   */
  public Iterable<T> astChildren() {
    return new Iterable<T>() {
      @Override
      public java.util.Iterator<T> iterator() {
        return astChildIterator();
      }
    };
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:97
   */
  public T getChild(int i) {
    ASTNode child = getChildNoTransform(i);
    return (T) child;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:102
   */
  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }
  /**
   * Gets a child without triggering rewrites.
   * @apilevel low-level
   * @declaredat ASTNode:109
   */
  public T getChildNoTransform(int i) {
    if (children == null) {
      return null;
    }
    T child = (T) children[i];
    return child;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:117
   */
  protected int numChildren;
  /** @apilevel low-level 
   * @declaredat ASTNode:120
   */
  protected int numChildren() {
    return numChildren;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:125
   */
  public int getNumChild() {
    return numChildren();
  }
  /**
   * Behaves like getNumChild, but does not invoke AST transformations (rewrites).
   * @apilevel low-level
   * @declaredat ASTNode:133
   */
  public final int getNumChildNoTransform() {
    return numChildren();
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:137
   */
  public void setChild(ASTNode node, int i) {
    if (children == null) {
      children = new ASTNode[(i + 1 > 4 || !(this instanceof List)) ? i + 1 : 4];
    } else if (i >= children.length) {
      ASTNode c[] = new ASTNode[i << 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = node;
    if (i >= numChildren) {
      numChildren = i+1;
    }
    if (node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:155
   */
  public void insertChild(ASTNode node, int i) {
    if (children == null) {
      children = new ASTNode[(i + 1 > 4 || !(this instanceof List)) ? i + 1 : 4];
      children[i] = node;
    } else {
      ASTNode c[] = new ASTNode[children.length + 1];
      System.arraycopy(children, 0, c, 0, i);
      c[i] = node;
      if (i < children.length) {
        System.arraycopy(children, i, c, i+1, children.length-i);
        for(int j = i+1; j < c.length; ++j) {
          if (c[j] != null) {
            c[j].childIndex = j;
          }
        }
      }
      children = c;
    }
    numChildren++;
    if (node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:180
   */
  public void removeChild(int i) {
    if (children != null) {
      ASTNode child = (ASTNode) children[i];
      if (child != null) {
        child.parent = null;
        child.childIndex = -1;
      }
      // Adding a check of this instance to make sure its a List, a move of children doesn't make
      // any sense for a node unless its a list. Also, there is a problem if a child of a non-List node is removed
      // and siblings are moved one step to the right, with null at the end.
      if (this instanceof List || this instanceof Opt) {
        System.arraycopy(children, i+1, children, i, children.length-i-1);
        children[children.length-1] = null;
        numChildren--;
        // fix child indices
        for(int j = i; j < numChildren; ++j) {
          if (children[j] != null) {
            child = (ASTNode) children[j];
            child.childIndex = j;
          }
        }
      } else {
        children[i] = null;
      }
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:207
   */
  public ASTNode getParent() {
    return (ASTNode) parent;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:211
   */
  public void setParent(ASTNode node) {
    parent = node;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:276
   */
  public void flushTreeCache() {
    flushCache();
    if (children != null) {
      for (int i = 0; i < children.length; i++) {
        if (children[i] != null) {
          ((ASTNode) children[i]).flushTreeCache();
        }
      }
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:287
   */
  public void flushCache() {
    flushAttrAndCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:291
   */
  public void flushAttrAndCollectionCache() {
    flushAttrCache();
    flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:296
   */
  public void flushAttrCache() {
    numLocals_reset();
    localIndex_reset();
    lastNode_reset();
    prevNode_int_reset();
    program_reset();
    predefinedFunctions_reset();
    unknownDecl_reset();
    unknownType_reset();
    intType_reset();
    boolType_reset();
    prevNode_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:310
   */
  public void flushCollectionCache() {
  }
  /** @apilevel internal 
   * @declaredat ASTNode:313
   */
  public ASTNode<T> clone() throws CloneNotSupportedException {
    ASTNode node = (ASTNode) super.clone();
    node.flushAttrAndCollectionCache();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:319
   */
  public ASTNode<T> copy() {
    try {
      ASTNode node = (ASTNode) clone();
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
   * @declaredat ASTNode:338
   */
  @Deprecated
  public ASTNode<T> fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:348
   */
  public ASTNode<T> treeCopyNoTransform() {
    ASTNode tree = (ASTNode) copy();
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
   * @declaredat ASTNode:368
   */
  public ASTNode<T> treeCopy() {
    ASTNode tree = (ASTNode) copy();
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
  /**
   * Performs a full traversal of the tree using getChild to trigger rewrites
   * @apilevel low-level
   * @declaredat ASTNode:385
   */
  public void doFullTraversal() {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).doFullTraversal();
    }
  }
  /** @apilevel internal 
   * @declaredat ASTNode:391
   */
  protected boolean is$Equal(ASTNode n1, ASTNode n2) {
    if (n1 == null && n2 == null) return true;
    if (n1 == null || n2 == null) return false;
    return n1.is$Equal(n2);
  }
  /** @apilevel internal 
   * @declaredat ASTNode:397
   */
  protected boolean is$Equal(ASTNode node) {
    if (getClass() != node.getClass()) {
      return false;
    }
    if (numChildren != node.numChildren) {
      return false;
    }
    for (int i = 0; i < numChildren; i++) {
      if (children[i] == null && node.children[i] != null) {
        return false;
      }
      if (!((ASTNode)children[i]).is$Equal(((ASTNode)node.children[i]))) {
        return false;
      }
    }
    return true;
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:26
   */
    /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).collect_contributors_Program_errors(_root, _map);
    }
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
  }

  /**
   * @aspect <NoAspect>
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:212
   */
    /** @apilevel internal */
  protected void collect_contributors_Fun_functionCalls(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).collect_contributors_Fun_functionCalls(_root, _map);
    }
  }
  /** @apilevel internal */
  protected void contributeTo_Fun_functionCalls(Set<IdDecl> collection) {
  }

/** @apilevel internal */
protected boolean numLocals_visited = false;
  /** @apilevel internal */
  private void numLocals_reset() {
    numLocals_computed = false;
    numLocals_visited = false;
  }
  /** @apilevel internal */
  protected boolean numLocals_computed = false;

  /** @apilevel internal */
  protected int numLocals_value;

  /**
   * @attribute syn
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:312
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:312")
  public int numLocals() {
    ASTState state = state();
    if (numLocals_computed) {
      return numLocals_value;
    }
    if (numLocals_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.numLocals().");
    }
    numLocals_visited = true;
    state().enterLazyAttribute();
    numLocals_value = lastNode().localIndex() - localIndex();
    numLocals_computed = true;
    state().leaveLazyAttribute();
    numLocals_visited = false;
    return numLocals_value;
  }
/** @apilevel internal */
protected boolean localIndex_visited = false;
  /** @apilevel internal */
  private void localIndex_reset() {
    localIndex_computed = false;
    localIndex_visited = false;
  }
  /** @apilevel internal */
  protected boolean localIndex_computed = false;

  /** @apilevel internal */
  protected int localIndex_value;

  /**
   * @attribute syn
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:314
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:314")
  public int localIndex() {
    ASTState state = state();
    if (localIndex_computed) {
      return localIndex_value;
    }
    if (localIndex_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.localIndex().");
    }
    localIndex_visited = true;
    state().enterLazyAttribute();
    localIndex_value = prevNode().localIndex();
    localIndex_computed = true;
    state().leaveLazyAttribute();
    localIndex_visited = false;
    return localIndex_value;
  }
/** @apilevel internal */
protected boolean lastNode_visited = false;
  /** @apilevel internal */
  private void lastNode_reset() {
    lastNode_computed = false;
    
    lastNode_value = null;
    lastNode_visited = false;
  }
  /** @apilevel internal */
  protected boolean lastNode_computed = false;

  /** @apilevel internal */
  protected ASTNode lastNode_value;

  /**
   * @attribute syn
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:323
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:323")
  public ASTNode lastNode() {
    ASTState state = state();
    if (lastNode_computed) {
      return lastNode_value;
    }
    if (lastNode_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.lastNode().");
    }
    lastNode_visited = true;
    state().enterLazyAttribute();
    lastNode_value = prevNode(getNumChild());
    lastNode_computed = true;
    state().leaveLazyAttribute();
    lastNode_visited = false;
    return lastNode_value;
  }
/** @apilevel internal */
protected java.util.Set prevNode_int_visited;
  /** @apilevel internal */
  private void prevNode_int_reset() {
    prevNode_int_values = null;
    prevNode_int_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map prevNode_int_values;

  /**
   * @attribute syn
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:324
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:324")
  public ASTNode prevNode(int i) {
    Object _parameters = i;
    if (prevNode_int_visited == null) prevNode_int_visited = new java.util.HashSet(4);
    if (prevNode_int_values == null) prevNode_int_values = new java.util.HashMap(4);
    ASTState state = state();
    if (prevNode_int_values.containsKey(_parameters)) {
      return (ASTNode) prevNode_int_values.get(_parameters);
    }
    if (prevNode_int_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute ASTNode.prevNode(int).");
    }
    prevNode_int_visited.add(_parameters);
    state().enterLazyAttribute();
    ASTNode prevNode_int_value = i>0 ? getChild(i-1).lastNode() : this;
    prevNode_int_values.put(_parameters, prevNode_int_value);
    state().leaveLazyAttribute();
    prevNode_int_visited.remove(_parameters);
    return prevNode_int_value;
  }
  /**
   * @attribute inh
   * @aspect Errors
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:28
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Errors", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:28")
  public Program program() {
    ASTState state = state();
    if (program_computed) {
      return program_value;
    }
    if (program_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.program().");
    }
    program_visited = true;
    state().enterLazyAttribute();
    program_value = getParent().Define_program(this, null);
    program_computed = true;
    state().leaveLazyAttribute();
    program_visited = false;
    return program_value;
  }
/** @apilevel internal */
protected boolean program_visited = false;
  /** @apilevel internal */
  private void program_reset() {
    program_computed = false;
    
    program_value = null;
    program_visited = false;
  }
  /** @apilevel internal */
  protected boolean program_computed = false;

  /** @apilevel internal */
  protected Program program_value;

  /**
   * @attribute inh
   * @aspect predefinedFunctions
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:24
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="predefinedFunctions", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:24")
  public List<Fun> predefinedFunctions() {
    ASTState state = state();
    if (predefinedFunctions_computed) {
      return predefinedFunctions_value;
    }
    if (predefinedFunctions_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.predefinedFunctions().");
    }
    predefinedFunctions_visited = true;
    state().enterLazyAttribute();
    predefinedFunctions_value = getParent().Define_predefinedFunctions(this, null);
    predefinedFunctions_computed = true;
    state().leaveLazyAttribute();
    predefinedFunctions_visited = false;
    return predefinedFunctions_value;
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
   * @attribute inh
   * @aspect UnknownDecl
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="UnknownDecl", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:31")
  public UnknownDecl unknownDecl() {
    ASTState state = state();
    if (unknownDecl_computed) {
      return unknownDecl_value;
    }
    if (unknownDecl_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.unknownDecl().");
    }
    unknownDecl_visited = true;
    state().enterLazyAttribute();
    unknownDecl_value = getParent().Define_unknownDecl(this, null);
    unknownDecl_computed = true;
    state().leaveLazyAttribute();
    unknownDecl_visited = false;
    return unknownDecl_value;
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
   * @attribute inh
   * @aspect Types
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:40
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:40")
  public UnknownType unknownType() {
    ASTState state = state();
    if (unknownType_computed) {
      return unknownType_value;
    }
    if (unknownType_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.unknownType().");
    }
    unknownType_visited = true;
    state().enterLazyAttribute();
    unknownType_value = getParent().Define_unknownType(this, null);
    unknownType_computed = true;
    state().leaveLazyAttribute();
    unknownType_visited = false;
    return unknownType_value;
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
   * @attribute inh
   * @aspect Types
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:46
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:46")
  public IntType intType() {
    ASTState state = state();
    if (intType_computed) {
      return intType_value;
    }
    if (intType_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.intType().");
    }
    intType_visited = true;
    state().enterLazyAttribute();
    intType_value = getParent().Define_intType(this, null);
    intType_computed = true;
    state().leaveLazyAttribute();
    intType_visited = false;
    return intType_value;
  }
/** @apilevel internal */
protected boolean intType_visited = false;
  /** @apilevel internal */
  private void intType_reset() {
    intType_computed = false;
    
    intType_value = null;
    intType_visited = false;
  }
  /** @apilevel internal */
  protected boolean intType_computed = false;

  /** @apilevel internal */
  protected IntType intType_value;

  /**
   * @attribute inh
   * @aspect Types
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:52
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:52")
  public BoolType boolType() {
    ASTState state = state();
    if (boolType_computed) {
      return boolType_value;
    }
    if (boolType_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.boolType().");
    }
    boolType_visited = true;
    state().enterLazyAttribute();
    boolType_value = getParent().Define_boolType(this, null);
    boolType_computed = true;
    state().leaveLazyAttribute();
    boolType_visited = false;
    return boolType_value;
  }
/** @apilevel internal */
protected boolean boolType_visited = false;
  /** @apilevel internal */
  private void boolType_reset() {
    boolType_computed = false;
    
    boolType_value = null;
    boolType_visited = false;
  }
  /** @apilevel internal */
  protected boolean boolType_computed = false;

  /** @apilevel internal */
  protected BoolType boolType_value;

  /**
   * @attribute inh
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:321
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:321")
  public ASTNode prevNode() {
    ASTState state = state();
    if (prevNode_computed) {
      return prevNode_value;
    }
    if (prevNode_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.prevNode().");
    }
    prevNode_visited = true;
    state().enterLazyAttribute();
    prevNode_value = getParent().Define_prevNode(this, null);
    prevNode_computed = true;
    state().leaveLazyAttribute();
    prevNode_visited = false;
    return prevNode_value;
  }
/** @apilevel internal */
protected boolean prevNode_visited = false;
  /** @apilevel internal */
  private void prevNode_reset() {
    prevNode_computed = false;
    
    prevNode_value = null;
    prevNode_visited = false;
  }
  /** @apilevel internal */
  protected boolean prevNode_computed = false;

  /** @apilevel internal */
  protected ASTNode prevNode_value;

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:321
   * @apilevel internal
   */
  public ASTNode Define_prevNode(ASTNode _callerNode, ASTNode _childNode) {
    int i = this.getIndexOfChild(_callerNode);
    return prevNode(i);
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:321
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute prevNode
   */
  protected boolean canDefine_prevNode(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_isVariable(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_isVariable(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:52
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isVariable
   */
  protected boolean canDefine_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public boolean Define_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_isFunction(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_isFunction(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:53
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isFunction
   */
  protected boolean canDefine_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public Fun Define_function(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_function(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_function(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:67
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute function
   */
  protected boolean canDefine_function(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public Program Define_program(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_program(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_program(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:29
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute program
   */
  protected boolean canDefine_program(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public List<Fun> Define_predefinedFunctions(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_predefinedFunctions(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_predefinedFunctions(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:25
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute predefinedFunctions
   */
  protected boolean canDefine_predefinedFunctions(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public UnknownDecl Define_unknownDecl(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_unknownDecl(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_unknownDecl(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:32
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownDecl
   */
  protected boolean canDefine_unknownDecl(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public UnknownType Define_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_unknownType(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_unknownType(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:43
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownType
   */
  protected boolean canDefine_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public IntType Define_intType(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_intType(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_intType(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:49
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute intType
   */
  protected boolean canDefine_intType(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public BoolType Define_boolType(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_boolType(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_boolType(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:55
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute boolType
   */
  protected boolean canDefine_boolType(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_lookup(self, _callerNode, name)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_lookup(self, _callerNode, name);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NameAnalysis.jrag:38
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return false;
  }
  /** @apilevel internal */
  public boolean Define_isParam(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_isParam(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_isParam(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:302
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isParam
   */
  protected boolean canDefine_isParam(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public String Define_appendUniqueID(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_appendUniqueID(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_appendUniqueID(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:201
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute appendUniqueID
   */
  protected boolean canDefine_appendUniqueID(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public String Define_funName(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_funName(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_funName(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:205
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute funName
   */
  protected boolean canDefine_funName(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public int Define_localIndex(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_localIndex(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_localIndex(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:318
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute localIndex
   */
  protected boolean canDefine_localIndex(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public Fun Define_enclosingFunction(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_enclosingFunction(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_enclosingFunction(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:206
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute enclosingFunction
   */
  protected boolean canDefine_enclosingFunction(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public int Define_index(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_index(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_index(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:202
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute index
   */
  protected boolean canDefine_index(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public String Define_uniqueId(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_uniqueId(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_uniqueId(self, _callerNode);
  }

  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:195
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute uniqueId
   */
  protected boolean canDefine_uniqueId(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
public ASTNode rewrittenNode() { throw new Error("rewrittenNode is undefined for ASTNode"); }
}
