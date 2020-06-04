
/**
 * LC #344 Problem Link - https://leetcode.com/problems/reverse-string/
 * 
 * @author ketanmalik
 * June 4 2020
 * */

import java.util.Arrays;

public class LC344 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' })));
	}

	public static char[] reverseString(char[] s) {
		char temp;
		int first = 0, last = s.length - 1;
		while (first < last) {
			temp = s[first];
			s[first] = s[last];
			s[last] = temp;
			first++;
			last--;
		}
		return s;
	}

}
