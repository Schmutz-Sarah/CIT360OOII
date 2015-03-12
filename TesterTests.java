import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.text.DateFormat.Field;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.*;

import junit.framework.*;
public class TesterTests {

	
	public class JUnitDemo extends TestCase {
		  private Tester list = new Tester();

		  // You can use the constructor instead of setUp():
		  public JUnitDemo(String name) {
		    super(name);
		    for (int i = 0; i < 3; i++)
		      list.add("" + i);
		  }

		  // Thus, setUp() is optional, but is run right
		  // before the test:
		  protected void setUp() {
		    System.out.println("Set up for " + list.getId());
		  }

		  // tearDown() is also optional, and is called after
		  // each test. setUp() and tearDown() can be either
		  // protected or public:
		  public void tearDown() {
		    System.out.println("Tearing down " + list.getId());
		  }

		  // All tests have method names beginning with "test":
		  public void testInsert() {
		    System.out.println("Running testInsert()");
		    assertEquals(list.size(), 3);
		    list.add(1, "Insert");
		    assertEquals(list.size(), 4);
		    assertEquals(list.get(1), "Insert");
		  }

		  public void testReplace() {
		    System.out.println("Running testReplace()");
		    assertEquals(list.size(), 3);
		    list.set(1, "Replace");
		    assertEquals(list.size(), 3);
		    assertEquals(list.get(1), "Replace");
		  }

		  // A "helper" method to reduce code duplication. As long
		  // as the name doesn't start with "test," it will not
		  // be automatically executed by JUnit.
		  private void compare(ArrayList lst, String[] strs) {
		    Object[] array = lst.toArray();
		    assertTrue("Arrays not the same length", array.length == strs.length);
		    for (int i = 0; i < array.length; i++)
		      assertEquals(strs[i], (String) array[i]);
		  }

		  public void testOrder() {
		    System.out.println("Running testOrder()");
		    compare(list, new String[] { "0", "1", "2" });
		  }

		  public void testRemove() {
		    System.out.println("Running testRemove()");
		    assertEquals(list.size(), 3);
		    list.remove(1);
		    assertEquals(list.size(), 2);
		    compare(list, new String[] { "0", "2" });
		  }

		  public void testAddAll() {
		    System.out.println("Running testAddAll()");
		    list.addAll(Arrays.asList(new Object[] { "An", "African", "Swallow" }));
		    assertEquals(list.size(), 6);
		    compare(list,
		        new String[] { "0", "1", "2", "An", "African", "Swallow" });
		  }

		 
		} ///:~
		       
		@Test
		public void test() throws IllegalArgumentException, IllegalAccessException {
			junit.textui.TestRunner.run(JUnitDemo.class);
			Class<?> parentClass = getClass().getSuperclass();
			java.lang.reflect.Field[] fields = parentClass.getDeclaredFields();
			for (java.lang.reflect.Field field : fields) {
			    System.out.println("field: " + field.getName());
			    
			    
			}

			Method[] methods = parentClass.getDeclaredMethods();
			for (Method method : methods) {
			    System.out.println("method: " + method.getName());
			    if(method.getDefaultValue() != null){
			    	fail();
			    }
			}
			
		}
}
