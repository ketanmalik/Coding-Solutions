
/*
 * Leetcode #804 Problem Link - https://leetcode.com/problems/unique-morse-code-words/submissions/
 * 
 * @author ketanmalik
 * May 27 2020
 * */

import java.util.HashMap;
import java.util.Map;

public class LC804 {

	public int uniqueMorseRepresentations(String[] words) {
		String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Map<String, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			for (char c : words[i].toCharArray()) {
				sb.append(codes[c - 97]);
			}
			map.put(sb.toString(), 1);
			sb.setLength(0);
		}
		return map.size();
	}

}
