package LeetCode;

public class NumberClosetToZero {

	static int numberClosestToZero(int[] nums) {

		int m = Integer.MAX_VALUE; int closestNum =0;

		for (int num : nums) {

			if (Math.abs(num) < m) {
				m = Math.abs(num);
				closestNum = num;
			} else if (Math.abs(num) == m && num > closestNum) {
				closestNum = num;
			}
		}

		return closestNum;
	}

	public static void main(String[] args) {

		int[] nums = { -4, -2, 1, 4, 8 };
//		int closestNum = 0;
		System.out.println(numberClosestToZero(nums));

	}

}
