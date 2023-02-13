package practiceproblems1;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str = "India is my country";
		
		String[] words = str.split(" ");
		
		String revword = "";
		String revw = "";
		
		for(int i = words.length-1; i>=0; i--) {
			revword = revword + words[i] + " ";
			for(int j = revword.length()-1; j>=0; j--) {
				revw = revw + revword.charAt(j);
			}
			
		}
		
	}

}
