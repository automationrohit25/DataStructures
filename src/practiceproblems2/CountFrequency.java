package practiceproblems2;

public class CountFrequency {
	
	static int countDigitOne(int n) {
		
		int counter = 0;
		for(int i = 1; i <=n; i++) {
			String str = String.valueOf(i);
			int x = str.split("1", -1).length -1;
			counter = counter + x;
		}
		return counter;
	}

	public static void main(String[] args) {
		
		int n = 13;
		System.out.println(countDigitOne(n));
		

	}

}
