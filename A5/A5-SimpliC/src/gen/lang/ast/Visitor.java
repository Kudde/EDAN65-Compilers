package lang.ast;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * Visitor interface for Calc language. Each concrete node type must
 * have a visit method.
 * @ast interface
 * @aspect Visitor
 * @declaredat /Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/Visitor.jrag:6
 */
public interface Visitor {


		//Program
		 

		//Program
		public Object visit(Program node, Object data);

		 
		public Object visit(Fun node, Object data);

		 
		public Object visit(Param node, Object data);

		 
		public Object visit(Block node, Object data);

		 
		public Object visit(List node, Object data);

		 
		public Object visit(Opt node, Object data);


		//Expr
		 

		//Expr
		public Object visit(Mul node, Object data);

		 
		public Object visit(Div node, Object data);

		 
		public Object visit(Plus node, Object data);

		 
		public Object visit(Sub node, Object data);

		 
		public Object visit(Mod node, Object data);

		 
		public Object visit(Equal node, Object data);

		 
		public Object visit(NotEqual node, Object data);

		 
		public Object visit(Less node, Object data);

		 
		public Object visit(Greater node, Object data);

		 
		public Object visit(LessEqual node, Object data);

		 
		public Object visit(GreaterEqual node, Object data);

		 
		public Object visit(FunCall node, Object data);


		//Stmt
		 

		//Stmt
		public Object visit(AssignStmt node, Object data);

		 
		public Object visit(DeclStmt node, Object data);

		 
		public Object visit(WhileStmt node, Object data);

		 
		public Object visit(IfStmt node, Object data);

		 
		public Object visit(ReturnStmt node, Object data);

		 
		public Object visit(ExprStmt node, Object data);


		//Finals
		 

		//Finals
		public Object visit(Literal node, Object data);

		 
		public Object visit(Type node, Object data);

		 
		public Object visit(ParamDecl node, Object data);

		 
		public Object visit(IdDecl node, Object data);

		 
		public Object visit(IdUse node, Object data);
}
