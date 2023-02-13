package practiceproblems2;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Apple", 1);
		hm.put("Bat", 2);
		hm.put("Cat", 3);
		
		
		for(Map.Entry<String, Integer> entrySet: hm.entrySet()) {
			System.out.println(entrySet.getKey() + "====>" + entrySet.getValue());
		}

		
		for(Map.Entry<String, Integer> entrySet : hm.entrySet()){
			System.out.println(entrySet.getKey() + "===>" + entrySet.getValue());
		}
	}

}
