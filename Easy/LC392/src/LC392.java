/**
 * Leetcode #392 - https://leetcode.com/problems/is-subsequence/
 * 
 * @author ketanmalik June 9 2020
 */

class LC392 {

	public static void main(String[] args) {
		System.out.println(isSubsequence("abab", "yuyuyuiuaiueyeyuhiuweuiywebdfiurehherihaehruierhuieb"));
	}

	public static boolean isSubsequence(String s, String t) {
		if (s.length() > t.length())
			return false;
		int found = 0, lastFound = -1, len = s.length();
		for (int i = 0; i < len; i++) {
			for (int j = ++lastFound; j < t.length(); j++) {
				if (s.charAt(i) == t.charAt(j)) {
					lastFound = j;
					found++;
					break;
				}
			}
		}
		if (found == len)
			return true;
		return false;
	}
}

