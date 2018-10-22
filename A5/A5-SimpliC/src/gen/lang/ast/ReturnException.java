package lang.ast;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat /Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/Interpreter.jrag:206
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
