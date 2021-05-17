
/**
 * Leetcode #977 Problem Link - https://leetcode.com/problems/squares-of-a-sorted-array/
 * 
 * @author ketanmalik
 * June 4 2020
 * */

import java.util.Arrays;

public class LC977 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] { -4, -1, 0, 3, 10 })));
	}

	// Brute-Force Approach, O(nlogn)
	public static int[] sortedSquares(int[] A) {
		boolean hasNegatives = false;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0)
				hasNegatives = true;
			A[i] *= A[i];
		}
		if (hasNegatives)
			Arrays.sort(A);
		return A;
	}
}
