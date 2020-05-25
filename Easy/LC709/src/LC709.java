/*
 * Leetcode #709
 * 
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * 
 * Example 1:
 * Input: "Hello"
 * Output: "hello"
 * 
 * Example 2:
 * Input: "here"
 * Output: "here"
 * 
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 * 
 * @author ketanmalik
 * May 25 2020
 * 
 * */

public class LC709 {
	public static void main(String[] args) {
		System.out.println(toLowerCase("aAbBSbAAdS&!h"));
	}

	public static String toLowerCase(String str) {
		StringBuilder res = new StringBuilder();
		for (char c : str.toCharArray()) {
			int temp = c;
			if (temp < 97 && temp >= 65)
				res.append(Character.toChars(c + 32));
			else
				res.append(c);
		}
		return res.toString();
	}
}
