package practiceproblems1;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	static char firstnonRep(String s) {
		
		HashMap<Character, Integer> char_counts = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(char_counts.containsKey(c)) {
				char_counts.put(c, char_counts.get(c)+1);
			}else {
				char_counts.put(c, 1);
			}
		}
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(char_counts.get(c) == 1) {
				return c;
			}
		}
		return '_';
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(firstnonRep("abcab"));
	}

}
