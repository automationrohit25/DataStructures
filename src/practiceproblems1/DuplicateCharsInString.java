package practiceproblems1;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		
		String s = "combination";
		HashMap<Character,Integer> hm = new HashMap<>();
		char[] ch = s.toCharArray();
		
		for(char c: ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c) +1);
			} else {
				hm.put(c, 1);
			}
		}
		
		Set<Character> keySet = hm.keySet();
		for(char c:keySet) {
			if(hm.get(c) > 1) {
				System.out.println("Duplicate Characters are: " + c);
			}
		}
		
		
		
	}

}
