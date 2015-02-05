import java.util.*;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
		//This next section is to create a hashmap
		Map<String, Double> Hello = new Map<String, Double>();
		
		// This next section will put stuff into the hashmap
		Hello.put("Kenneth", new Double(1.0));
		Hello.put("Sarah", new Double(2.0));
		Hello.put("Jacob", new Double(3.0));
		
		System.out.println(Hello.get("Kenneth"));
		System.out.println(Hello.get("Sarah"));
		System.out.println(Hello.get("Jacob"));
	}
}
