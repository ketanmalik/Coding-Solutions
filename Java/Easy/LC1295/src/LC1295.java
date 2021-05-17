/*
Leetcode #1295

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

@author ketanmalik
May 18 2020
*/

public class LC1295 {

	public static void main(String args[]) {
		System.out.println(findNumbers(new int[] { 12, 345, 2, 6, 789 }));
	}

	public static int findNumbers(int[] nums) {
		int res = 0, x = 0;
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] > 0) {
				nums[i] /= 10;
				x++;
			}
			if (x % 2 == 0)
				res++;
			x = 0;
		}
		return res;
	}
}
