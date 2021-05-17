import java.util.HashMap;
import java.util.Map;

/**
 * LC #137 Problem Link - https://leetcode.com/problems/single-number-ii/
 * 
 * @author ketanmalik June 22 2020
 */

class LC137 {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] { 2, 1, 0, 3, 0, 2, 1, 0, 1, 2 }));
	}

	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			Integer x = map.get(num);
			if (x == null)
				map.put(num, 1);
			else if (x == 1)
				map.put(num, 2);
			else
				map.remove(num);
		}
		return map.keySet().toArray(new Integer[0])[0];
	}
}
