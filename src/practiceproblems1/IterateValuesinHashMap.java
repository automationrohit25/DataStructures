 package practiceproblems1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateValuesinHashMap {

	public static void main(String[] args) {
	
	  HashMap<String, String> hm  = new HashMap<>();
	  hm.put("A","B");
	  hm.put("B", "Ball");
	
//	  System.out.println(hm);
//	  
//	  for(Map.Entry<String, String> mapentry : hm.entrySet()) {
//		  System.out.println(mapentry.getValue());
//		  
//	  }
//	  
//	  hm.forEach((k,v) -> System.out.println("key is " + k + " value is "+ v));
	  
	  for(Map.Entry<String, String> set : hm.entrySet()) {
		  System.out.println(set.getKey() + "==>" + set.getValue());
	  }
	}

}
