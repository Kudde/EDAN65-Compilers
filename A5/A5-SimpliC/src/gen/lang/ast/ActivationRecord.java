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
 * @declaredat C:\\Users\\kevin\\LTH\\edan65\\A5\\A5-SimpliC\\src\\jastadd\\Interpreter.jrag:16
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
      return 0;
  //    return map.containsKey(name) ? map.get(name) : null;
    }


}
