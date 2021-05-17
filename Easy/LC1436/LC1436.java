
/*
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 * 
 * Example 1:
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo" 
 * Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
 * 
 * Example 2:
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * Explanation: All possible trips are: 
 * "D" -> "B" -> "C" -> "A". 
 * "B" -> "C" -> "A". 
 * "C" -> "A". 
 * "A". 
 * Clearly the destination city is "A".
 * 
 * @author ketanmalik
 * May 21 2020
 * 
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC1436 {

	public static void main(String[] args) {
		List<List<String>> list = new ArrayList<>();
		list.add(new ArrayList<>(Arrays.asList("London", "New York")));
		list.add(new ArrayList<>(Arrays.asList("New York", "Lima")));

		System.out.println(destCity(list));
	}

	public static String destCity(List<List<String>> paths) {
		Map<String, Boolean> map = new HashMap<>();
		for (int i = 0; i < paths.size(); i++) {
			String src = paths.get(i).get(0);
			String dest = paths.get(i).get(1);
			map.put(src, true);
			if (!map.containsKey(dest))
				map.put(dest, false);
		}
		for (String key : map.keySet()) {
			if (!map.get(key))
				return key;
		}
		return null;
	}
}
