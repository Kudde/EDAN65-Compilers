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
 * @ast class
 * @aspect Interpreter
 * @declaredat /h/d5/d/dat14kjo/edan65/A6/A6-SimpliC/src/jastadd/Interpreter.jrag:233
 */
public class ReturnException extends Exception {
  
        private int value;

  

        public ReturnException(int value) {
                super();
                this.value = value;
        }

  
        public int getReturn() {
                return value;
        }


}
