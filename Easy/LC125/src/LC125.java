/**
 * @author ketanmalik August 3 2020
 * 
 *         Leetcode #125 Problem Link -
 *         https://leetcode.com/problems/valid-palindrome/
 */

public class LC125 {
	public static void main(String[] args) {
		System.out.println(isPalindrome("ab_a"));
	}

	public static boolean isPalindrome(String s) {
		StringBuilder str = new StringBuilder();
		str.append(s.replaceAll("\\W|_", ""));
		str = str.reverse();
		return str.toString().equalsIgnoreCase(s.replaceAll("\\W|_", ""));
	}
}
