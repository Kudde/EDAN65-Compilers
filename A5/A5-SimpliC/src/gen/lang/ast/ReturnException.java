package lang.ast;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\Interpreter.jrag:178
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
