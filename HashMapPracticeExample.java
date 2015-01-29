import java.util.*;

public class HashMapPracticeExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> HelloWorld = new HashMap<String, Integer>();
		
		HelloWorld.put("Jenna", new Integer(21));
		HelloWorld.put("Emily", new Integer(19));
		HelloWorld.put("Andrew", new Integer(25));
		
		System.out.println(HelloWorld.get("Jenna"));
		System.out.println(HelloWorld.get("Emily"));
		System.out.println(HelloWorld.get("Andrew"));
	}
}
