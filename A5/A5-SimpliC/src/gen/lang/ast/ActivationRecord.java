package lang.ast;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat /Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/Interpreter.jrag:186
 */
public class ActivationRecord extends java.lang.Object {
  
        private HashMap<String, Integer> map;

  
        public ActivationRecord() {
                map = new HashMap<String, Integer>();
        }

  

        public void put(String name, int value) {
                map.put(name, value);
        }

  

        public int get(String name) {
                Object n = map.get(name);
                if (n == null)
                        return 0;
                else
                        return (int) n;
        }


}
