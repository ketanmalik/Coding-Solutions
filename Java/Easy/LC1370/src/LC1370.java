/**
 * Leetcode #1370 - https://leetcode.com/problems/increasing-decreasing-string/
 * 
 * @author ketanmalik
 * June 22 202
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class LC1370 {

	public static void main(String[] args) {
		System.out
				.println(sortString("ratewgasdfhewuyasdfwefhwiqefhsuefwegfweihfifhsauifgewfdghewifhawdgewwqrewrfwgaw"));
	}

	public static String sortString(String s) {
		StringBuilder res = new StringBuilder();
		Map<Character, Integer> map = new TreeMap<>();
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		for (int x = 0; x < s.length(); x++) {

			List<Character> keys = new ArrayList<>(map.keySet());
			for (Character key : keys) {
				if (len >= s.length())
					return res.toString();
				if (map.get(key) > 0) {
					res.append(key);
					len++;
				}
				map.replace(key, map.get(key) - 1);
			}

			if (len >= s.length())
				return res.toString();
			Collections.reverse(keys);
			for (Character key : keys) {
				if (len >= s.length())
					return res.toString();
				if (map.get(key) > 0) {
					res.append(key);
					len++;
				}
				map.replace(key, map.get(key) - 1);
			}
			if (len >= s.length())
				return res.toString();
		}

		return res.toString();
	}
}