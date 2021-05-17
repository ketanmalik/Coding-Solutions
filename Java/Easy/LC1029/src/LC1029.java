/**
 * Leetcode #1029 Problem Link - https://leetcode.com/problems/two-city-scheduling/
 * 
 * @author ketanmalik
 * June 4 2020
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class LC1029 {
	public int twoCitySchedCost(int[][] costs) {
		HashMap<Integer, Integer> diffMap = new LinkedHashMap<>();
		int diff = 0;
		for (int i = 0; i < costs.length; i++) {
			diff = Math.abs(costs[i][0] - costs[i][1]);
			diffMap.put(i, diff);
		}
		List<Map.Entry<Integer, Integer>> diffList = new LinkedList<Map.Entry<Integer, Integer>>(diffMap.entrySet());
		Collections.sort(diffList, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		diffMap.clear();
		for (Map.Entry<Integer, Integer> entry : diffList)
			diffMap.put(entry.getKey(), entry.getValue());
		int n = costs.length / 2, temp = 0, index = 0, res = 0, c1 = 0, c2 = 0, goingToA = 0, goingToB = 0;
		List<Integer> keyToDelete = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : diffMap.entrySet()) {
			if (temp >= n)
				break;
			index = entry.getKey();
			c1 = costs[index][0];
			c2 = costs[index][1];
			if (c1 < c2) {
				res += c1;
				goingToA++;
			} else {
				res += c2;
				goingToB++;
			}
			temp++;
			keyToDelete.add(entry.getKey());
		}
		for (Integer key : keyToDelete)
			diffMap.remove(key);
		temp = 0;
		for (Map.Entry<Integer, Integer> entry : diffMap.entrySet()) {
			index = entry.getKey();
			c1 = costs[index][0];
			c2 = costs[index][1];
			if (c1 < c2 && goingToA < n || goingToB >= n) {
				res += c1;
				goingToA++;
			} else {
				res += c2;
				goingToB++;
			}
		}
		return res;
	}
}