package rahulShettyClasses;

public class Recursion_1 {
	
	static int arr[] = {12, 2, 30, 13, 5};

	public static void main(String[] args) {
		
		int value = SumOfDigit(arr.length -1);
		System.out.println(value);
		int fact_value = Factorial(5);
		System.out.println(fact_value);
	}
	
	private static int SumOfDigit(int n) {
		
		if(n==0) 
		  return arr[n];
		
		return arr[n] + SumOfDigit(n -1);
		
	}
	
	static int Factorial(int n) {
		if(n == 1)
			return 1;
		return n * Factorial(n-1);
	}

}
