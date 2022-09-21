import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class StringUnique {

	public static void main(String[] args) {
		System.out.println(uniqueFinder("CreditSuisse",5));
	}

	public static boolean uniqueFinder(String var, int count) {
		char ch[] = var.toLowerCase().toCharArray();
		
		
		HashMap<Character, Integer> uniqueCounter= new HashMap<Character, Integer>();
		
		for(char c : ch) {
			if(uniqueCounter.containsKey(c)) {
				uniqueCounter.put(c, uniqueCounter.get(c)+1);
			} else {
				uniqueCounter.put(c, 1);
			}
		}
		
		return count == uniqueCounter.values().stream().filter(ct -> ct==1).count();
		
	}
	
}
