package practiceproblems1;

import java.util.Iterator;

public class StringCompressionExample {
	
	public static String compression(String str) {
		String s = str.charAt(0) + "";
		int count = 1;
		
		for(int i = 1; i < str.length(); i++) {
			
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr == prev) {
				count++;
			} else {
				if(count >=1) {
				s = s + count;
				count = 1;
			}
				s = s + curr;
			}
		
		}
		if(count >=1) {
			s = s + count;
		}
		return s;
	}

		
	public static void main(String[] args) {
		
		System.out.println(compression("aaabbccdde"));

	}

}
