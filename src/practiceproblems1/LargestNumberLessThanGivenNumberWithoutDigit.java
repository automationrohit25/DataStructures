package practiceproblems1;

public class LargestNumberLessThanGivenNumberWithoutDigit {
	
	static int getLessNumber(int number, int digit) {
		
		char c = Integer.toString(digit).charAt(0);
		
		for(int i = number; i > 0; i--) {
			if(Integer.toString(i).indexOf(c) == -1){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(getLessNumber(123, 2));

	}

}
