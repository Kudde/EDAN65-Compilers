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
 * @declaredat /Users/ludde/ht18/edan65/A5/A5-SimpliC/src/jastadd/Interpreter.jrag:219
 */
public class ActivationRecord extends java.lang.Object {
  
        private HashMap<String, Integer> map;

  
        public ActivationRecord() {
                map = new HashMap<String, Integer>();
        }

  

        public void put(String name, int value) {
                map.put(name, value);
        }

  

        public Integer get(String name) {
                Object n = map.get(name);
                if (n == null)
                        return null;
                else
                        return (int) n;
        }

  

        public void print() {
          for (String name: map.keySet()){

            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println("Key: " + key + " Value: " + value);


          }
        }


}
