
/**
 * Leetcode #435 - https://leetcode.com/problems/non-overlapping-intervals/
 * 
 * @author ketanmalik 
 * Aug 15 2020
 * */

import java.util.Arrays;

class LC435 {
	public static void main(String[] args) {
		System.out.println(eraseOverlapIntervals(new int[][] { { 1, 5 }, { 2, 3 }, { 4, 7 }, { 9, 10 }, { 1, 8 } }));
	}

	public static int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length <= 1)
			return 0;
		Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
		int prev = intervals[0][1];
		int remove = 0;
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < prev) {
				remove++;
			} else
				prev = intervals[i][1];
		}
		return remove;
	}
}