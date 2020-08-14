
/**
 * Leetcode #409 - https://leetcode.com/problems/longest-palindrome/
 * 
 * @author ketanmalik
 * Aug 14 2020
 * */

import java.util.HashMap;
import java.util.Map;

class LC409 {
	public int longestPalindrome(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		boolean oddTaken = false;
		int res = 0;
		for (Character c : map.keySet()) {
			if (map.get(c) % 2 == 0) {
				res += map.get(c);
			} else {
				if (!oddTaken) {
					res += map.get(c);
					oddTaken = true;
				} else {
					res += map.get(c) - 1;
				}
			}
		}
		return res;
	}
}