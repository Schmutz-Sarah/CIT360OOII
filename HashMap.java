
public class HashMap {
	
	public static void main(String[] args) {
		
		//This next section is to create a hashmap
		HashMap<String, String> countryNames = new HashMap<String, String>(200);
		
		// This next section will put stuff into the hashmap
		countryNames.put("GB", "Great Britain");
		countryNames.put("FR", "France");
		countryNames.put("IT", "Italy");
		countryNames.put("FW", "Far Far Away");
		
		String name = countryNames.get("IT");
	}
}
