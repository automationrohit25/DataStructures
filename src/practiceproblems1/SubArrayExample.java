package practiceproblems1;

public class SubArrayExample {
	
	public void findSubArrayPositiveNumbers(int[] arr, int sum) {
		if(arr.length == 0) {
			System.out.println("The given array is empty");
			return;
		}
		
		int start, end, window_sum;
		
		start = 0;
		end = 0;
		window_sum = 0;
		
		while(end < arr.length) {
			window_sum = window_sum + arr[end];
			
			if(window_sum == sum) {
				System.out.println("Start Index " + start + "End index " + end);
				return;
			}
			
			while(window_sum > sum && start <= end) {
				window_sum = window_sum - arr[start++];
				
				if(window_sum == sum) {
					System.out.println("Start Index " + start + "End index " + end);
					return;
				}
				
			}
			end++;
			System.out.println("there is no such sub array");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
