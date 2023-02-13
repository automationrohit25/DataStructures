package practiceproblems1;

public class StringExpansion {
	
	static String expandstring(String inputString) {
		
		for(int i = 0; i < inputString.length(); i++) {
			if(Character.isDigit(inputString.charAt(i))) {
				String s = inputString.charAt(i-1) + "";
				int num = Integer.parseInt(inputString.charAt(i) + "");
				for(int j = 0 ; j < num; j++) {
					System.out.print(inputString.charAt(i-1));
				}
			}
		}
		return null;
		
	}
	
	

	public static void main(String[] args) {
		
	   expandstring("a3b2c4");
	}

}
