/*
 * Leetcode #1021 - https://leetcode.com/problems/remove-outermost-parentheses/
 * 
 * @author ketanmalik
 * May 26 2020
 * 
 * */

public class LC1021 {
	public static void main(String[] args) {
		System.out.println(removeOuterParentheses("(()())(())"));
	}

	public static String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		int opr = 0;
		for (char c : S.toCharArray()) {
			if (c == '(') {
				++opr;
				if (opr != 1)
					sb.append(c);
			} else {
				--opr;
				if (opr != 0)
					sb.append(c);
			}
		}
		return sb.toString();
	}
}
