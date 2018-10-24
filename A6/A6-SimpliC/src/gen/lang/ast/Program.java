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
 * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/lang.ast:1
 * @astdecl Program : ASTNode ::= Fun*;
 * @production Program : {@link ASTNode} ::= <span class="component">{@link Fun}*</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Visitor.jrag:54
   */
  public Object accept(Visitor visitor, Object data) {
	return visitor.visit(this, data);
	}
  /**
   * @aspect CodeGen
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:11
   */
  public void genCode(PrintStream out) {
		out.println(".global _start");
		out.println(".data");
		out.println("ask_message: .ascii \"Please enter a number: \"");
		out.println("ask_msg_len: .quad 23");
		out.println("buf: .skip 1024");
		out.println();
		out.println(".text");
		out.println("_start:");
        out.println("        call main");
        out.println("				 call _exit");

		for (Fun f : getFuns()) {
			f.genCode(out);
		}

		out.println("# Procedure to read number from stdin.");
		out.println("# C signature: long int read(void)");
		out.println("read:");
		out.println("        pushq %rbp");
		out.println("        movq %rsp, %rbp");
		out.println("        movq $0, %rdi");
		out.println("        movq $buf, %rsi");
		out.println("        movq $1024, %rdx");
		out.println("        movq $0, %rax");
		out.println("        syscall                 # sys_read(0, buf, 1024)");
		out.println("        ### Convert string to integer (atoi).");
		out.println("        ### RAX = string length (nchar)");
		out.println("        ### RSI = string pointer");
		out.println("        movq $0, %rdx           # sum <- 0");
		out.println("        cmpq $0, %rax           # if (nchar > 0)");
		out.println("        jle atoi_done           # nchar <= 0");
		out.println("        movq %rsi, %rdi         # copy RSI to RDI for sign check later");
		out.println("        movb (%rsi), %ch        # look at first char");
		out.println("        cmp $0x2D, %ch");
		out.println("        jne atoi_loop");
		out.println("        incq %rsi               # skip sign char");
		out.println("atoi_loop:");
		out.println("        cmpq $0, %rax           # while (nchar > 0)");
		out.println("        jle atoi_done           # leave loop if nchar <= 0");
		out.println("        movzbq (%rsi), %rcx     # move byte, zero extend to quad-word");
		out.println("        cmpq $0x30, %rcx        # test if < '0'");
		out.println("        jl atoi_done            # character is not numeric");
		out.println("        cmpq $0x39, %rcx        # test if > '9'");
		out.println("        jg atoi_done            # character is not numeric");
		out.println("        imulq $10, %rdx         # multiply sum by 10");
		out.println("        subq $0x30, %rcx        # value of character");
		out.println("        addq %rcx, %rdx         # add to sum");
		out.println("        incq %rsi               # step to next char");
		out.println("        decq %rax               # nchar--");
		out.println("        jmp atoi_loop           # loop back");
		out.println("atoi_done:");
		out.println("        movq %rdx, %rax         # put result value in RAX");
		out.println("        movb (%rdi), %ch        # check sign char");
		out.println("        cmp $0x2D, %ch");
		out.println("        jne read_end");
		out.println("        negq %rax               # negate result due to sign char");
		out.println("read_end:");
		out.println("        popq %rbp");
		out.println("        ret");
		out.println();
		out.println("# Procedure to print number to stdout.");
		out.println("# C signature: void print(long int)");
		out.println("print:");
		out.println("        pushq %rbp");
		out.println("        movq %rsp, %rbp");
		out.println("        ### Convert integer to string (itoa).");
		out.println("        movq 16(%rbp), %rax");
		out.println("        movq $(buf+1023), %rsi  # RSI = write pointer (starts at end of buffer)");
		out.println("        movb $0x0A, (%rsi)      # insert newline");
		out.println("        movq $1, %rcx           # RCX = string length");
		out.println("        cmpq $0, %rax");
		out.println("        jge itoa_loop");
		out.println("        negq %rax               # negate to make RAX positive");
		out.println("itoa_loop:                      # do.. while (at least one iteration)");
		out.println("        movq $10, %rdi");
		out.println("        movq $0, %rdx");
		out.println("        idivq %rdi              # divide RDX:RAX by 10");
		out.println("        addb $0x30, %dl         # remainder + '0'");
		out.println("        decq %rsi               # move string pointer");
		out.println("        movb %dl, (%rsi)");
		out.println("        incq %rcx               # increment string length");
		out.println("        cmpq $0, %rax");
		out.println("        jg itoa_loop            # produce more digits");
		out.println("itoa_done:");
		out.println("        movq 16(%rbp), %rax");
		out.println("        cmpq $0, %rax");
		out.println("        jge print_end");
		out.println("        decq %rsi");
		out.println("        incq %rcx");
		out.println("        movb $0x2D, (%rsi)");
		out.println("print_end:");
		out.println("        movq $1, %rdi");
		out.println("        movq %rcx, %rdx");
		out.println("        movq $1, %rax");
		out.println("        syscall");
		out.println("        popq %rbp");
		out.println("        ret");
		out.println();
		out.println("print_string:");
		out.println("        pushq %rbp");
		out.println("        movq %rsp, %rbp");
		out.println("        movq $1, %rdi");
		out.println("        movq 16(%rbp), %rsi");
		out.println("        movq 24(%rbp), %rdx");
		out.println("        movq $1, %rax");
		out.println("        syscall");
		out.println("        popq %rbp");
		out.println(" ret");
		out.println("_exit:"); 		//EXIT
		out.println("        movq $0, %rdi");
		out.println("        movq $60, %rax");
		out.println("        syscall"); // Done!
	}
  /**
   * @aspect Interpreter
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:7
   */
  public void eval() {
                boolean found = false;
                for (Fun fun : getFuns()) {
                        if (fun.getIdDecl().getID().equals("main")) {
                                found = true;
                                fun.eval(new ActivationRecord());
                        }
                }
                if (!found)
                        throw new RuntimeException();
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
    intType_reset();
    boolType_reset();
    localIndex_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    Program_errors_visited = false;
    Program_errors_computed = false;
    
    Program_errors_value = null;
    contributorMap_Program_errors = null;
    contributorMap_Fun_functionCalls = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
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
   * @declaredat ASTNode:71
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
   * @declaredat ASTNode:81
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
   * @declaredat ASTNode:101
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
   * @declaredat ASTNode:115
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
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:26
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

  /**
   * @aspect <NoAspect>
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:212
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_Fun_functionCalls = null;

  /** @apilevel internal */
  protected void survey_Fun_functionCalls() {
    if (contributorMap_Fun_functionCalls == null) {
      contributorMap_Fun_functionCalls = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_Fun_functionCalls(this, contributorMap_Fun_functionCalls);
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
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="predefinedFunctions", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:3")
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
    ParamDecl pd = new ParamDecl();
    pd.setIdDecl(new IdDecl("a"));
    List<ParamDecl> l = new List<ParamDecl>();
    l.add(pd);
    Param p = new Param(l);
    Fun f = new Fun();
    f.setIdDecl(d);
    f.setParam(p);
    list.add(f);
  
    d = new IdDecl("read");
    f = new Fun();
    f.setIdDecl(d);
    f.setParam(new Param(new List<ParamDecl>()));
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
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:29
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="UnknownDecl", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:29")
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
   * @aspect Types
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:39
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:39")
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
   * @attribute syn
   * @aspect Types
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:45
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:45")
  public IntType intType() {
    ASTState state = state();
    if (intType_computed) {
      return intType_value;
    }
    if (intType_visited) {
      throw new RuntimeException("Circular definition of attribute Program.intType().");
    }
    intType_visited = true;
    state().enterLazyAttribute();
    intType_value = new IntType("<int>");
    intType_value.setParent(this);
    intType_computed = true;
    state().leaveLazyAttribute();
    intType_visited = false;
    return intType_value;
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
   * @attribute syn
   * @aspect Types
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:51
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="Types", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:51")
  public BoolType boolType() {
    ASTState state = state();
    if (boolType_computed) {
      return boolType_value;
    }
    if (boolType_visited) {
      throw new RuntimeException("Circular definition of attribute Program.boolType().");
    }
    boolType_visited = true;
    state().enterLazyAttribute();
    boolType_value = new BoolType("<bool>");
    boolType_value.setParent(this);
    boolType_computed = true;
    state().leaveLazyAttribute();
    boolType_visited = false;
    return boolType_value;
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
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:315
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
    localIndex_value = 0;
    localIndex_computed = true;
    state().leaveLazyAttribute();
    localIndex_visited = false;
    return localIndex_value;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:50
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == unknownDecl_value) {
      // @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:58
      return false;
    }
    else {
      return getParent().Define_isVariable(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:50
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isVariable
   */
  protected boolean canDefine_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:51
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == unknownDecl_value) {
      // @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:59
      return false;
    }
    else {
      return getParent().Define_isFunction(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:51
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isFunction
   */
  protected boolean canDefine_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:65
   * @apilevel internal
   */
  public Fun Define_function(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return null;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/TypeAnalysis.jrag:65
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute function
   */
  protected boolean canDefine_function(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:28
   * @apilevel internal
   */
  public Program Define_program(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return this;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:28
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute program
   */
  protected boolean canDefine_program(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:24
   * @apilevel internal
   */
  public List<Fun> Define_predefinedFunctions(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return predefinedFunctions();
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:24
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute predefinedFunctions
   */
  protected boolean canDefine_predefinedFunctions(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:31
   * @apilevel internal
   */
  public UnknownDecl Define_unknownDecl(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return unknownDecl();
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:31
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownDecl
   */
  protected boolean canDefine_unknownDecl(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:40
   * @apilevel internal
   */
  public UnknownType Define_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return unknownType();
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:40
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownType
   */
  protected boolean canDefine_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:46
   * @apilevel internal
   */
  public IntType Define_intType(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return intType();
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:46
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute intType
   */
  protected boolean canDefine_intType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:52
   * @apilevel internal
   */
  public BoolType Define_boolType(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return boolType();
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NTAUtils.jrag:52
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute boolType
   */
  protected boolean canDefine_boolType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NameAnalysis.jrag:9
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getFunListNoTransform()) {
      // @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NameAnalysis.jrag:53
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
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/NameAnalysis.jrag:9
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:298
   * @apilevel internal
   */
  public boolean Define_isParam(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return false;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/CodeGen.jrag:298
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isParam
   */
  protected boolean canDefine_isParam(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:187
   * @apilevel internal
   */
  public String Define_appendUniqueID(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == unknownDecl_value) {
      // @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:189
      return "";
    }
    else {
      return getParent().Define_appendUniqueID(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:187
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute appendUniqueID
   */
  protected boolean canDefine_appendUniqueID(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
/** @apilevel internal */
protected boolean Program_errors_visited = false;
  /**
   * @attribute coll
   * @aspect Errors
   * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:26
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Errors", declaredAt="/h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Errors.jrag:26")
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
