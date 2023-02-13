package practiceproblems1;

public class ReverseString {

	public static void main(String[] args) {

		String str = "mysore";
		String revword = "";
		
		for(int i = str.length() -1; i >=0; i--) {
			revword = revword + str.charAt(i);
		}
		
		System.out.println(revword);

	}

}
