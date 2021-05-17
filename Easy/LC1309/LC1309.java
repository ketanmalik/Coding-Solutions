/*
 * Leetcode #1309 Problem Link - https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 * 
 * @author ketanmalik
 * May 27 2020
 * 
 * */

public class LC1309 {

	public static void main(String[] args) {
		System.out.println(freqAlphabets("10#12#11#"));
	}

	public static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			flag = false;
			try {
				if (s.charAt(i + 2) == '#') {
					int n1 = (s.charAt(i) - '0') * 10;
					int n2 = s.charAt(i + 1) - '0';
					int num = n1 + n2;
					char c = (char) (num + 96);
					sb.append(c);
					i += 2;
					temp.setLength(0);
					flag = true;
				} else {
					flag = false;
				}
			} catch (Exception e) {
				flag = false;
			}
			if (!flag) {
				int num = s.charAt(i) - '0';
				char c = (char) (num + 96);
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
