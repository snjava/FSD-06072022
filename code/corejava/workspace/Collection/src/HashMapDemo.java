import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put(12, "Abc");
		map.put(112, "Xyz");
		map.put(1.2, "Abc");
		map.put(true, "Abc");
		map.put("Xyz", false);
		map.put(12, "Demo");
		map.put(null, "Pqr");
		map.put(999, null);
		
		
		System.out.println(map);
		
	}

}