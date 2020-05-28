import java.util.Arrays;

/*
 * Leetcode #1374 Problem Link - https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 * 
 * @author ketanmalik
 * May 28 2020
 * 
 * */

public class LC1374 {
	public static void main(String[] args) {
		System.out.println(generateTheString(9));
		System.out.println(generateTheString(8));
	}

	public static String generateTheString(int n) {
		char[] str = new char[n];
		Arrays.fill(str, 'a');
		if (n % 2 == 0)
			str[n - 1] = 'b';
		return new String(str);

		// A little less efficient way
//		StringBuilder res = new StringBuilder();
//		int ctr = n;
//		if ((n % 2) == 0) {
//			ctr = n - 1;
//			res.append("b");
//		}
//		for (int i = 0; i < ctr; i++)
//			res.append("a");
//
//		return res.toString();
	}
}
