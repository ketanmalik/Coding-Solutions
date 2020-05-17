/*
Leetcode #1281

Given an integer number n, return the difference between the product of its digits and the sum of its digits. 

Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21

@author ketanmalik
May 16 2020
*/

public class LC1281 {

	public static void main(String args[]) {
		System.out.println(subtractProductAndSum(234));
	}

	public static int subtractProductAndSum(int n) {
		int p = 1, s = 0;
		while (n > 0) {
			p *= n % 10;
			s += n % 10;
			n /= 10;
		}
		return p - s;
	}
}
