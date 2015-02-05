import java.util.*;

public class NewArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> companyDetails = new HashMap<String, Integer>();
		
		companyDetails.put("eBay", 4444);
		companyDetails.put("Paypal", 5555);
		companyDetails.put("IBM", 6666);
		companyDetails.put("Google", 7777);
		companyDetails.put("Yahoo", 8888);
		
		System.out.println("==> Size of companyDetails Map: " + companyDetails.size());
	}
}
