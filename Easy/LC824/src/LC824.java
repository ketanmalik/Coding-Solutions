/**
 * Leetcode #824 - https://leetcode.com/problems/goat-latin/
 * 
 * @author ketanmalik Aug 19 2020
 */

class LC824 {
	public static void main(String[] args) {
		System.out.println(toGoatLatin("I speak Goat Latin"));
	}

	public static String toGoatLatin(String S) {
		StringBuilder res = new StringBuilder();
		String temp = "";
		for (String s : S.split(" ")) {
			temp += "a";
			if ("aAeEiIoOuU".indexOf(s.charAt(0)) < 0) {
				s = s.substring(1) + s.charAt(0);
			}
			res.append(s).append("ma").append(temp).append(" ");
		}
		res.deleteCharAt(res.length() - 1);
		return res.toString();
	}
}