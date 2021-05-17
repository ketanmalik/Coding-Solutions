
/**
 * Leetcode #961 Problem Link -
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 *
 * @author ketanmalik June 1 2020
 */

import java.util.HashMap;
import java.util.Map;

public class LC961 {

	public static void main(String[] args) {
		System.out.println(repeatedNTimes(new int[] { 5, 1, 5, 2, 5, 3, 5, 4 }));
	}

	// O(n) Approach
	public static int repeatedNTimes(int[] A) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i]))
				return A[i];
			map.put(A[i], 1);
		}
		return -1;
	}

	// Brute-Force Approach - O(nlogn)
//	public int repeatedNTimes(int[] A) {
//		int sum = 0, count = (A.length / 2);
//		Arrays.sort(A);
//		for (int i = 0; i < A.length - 1; i++) {
//			if (A[i] == A[i + 1])
//				sum++;
//			if (sum == count - 1)
//				return A[i];
//		}
//		return -1;
//	}
}
