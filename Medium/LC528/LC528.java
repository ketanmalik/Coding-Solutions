
/**
 * Leetcode #528 Problem Link -
 * https://leetcode.com/problems/random-pick-with-weight/
 *
 * @author ketanmalik June 5 2020
 */

import java.util.Random;

class LC528 {

	private int sum = 0;
	private int[] arr;
	Random r;

	public LC528(int[] w) {
		arr = new int[w.length];
		r = new Random();
		for (int i = 0; i < w.length; i++) {
			sum += w[i];
			arr[i] = sum;
		}
	}

	public int pickIndex() {
		int rand = r.nextInt(sum) + 1;
		return binarySearch(rand);
	}

	public int binarySearch(int val) {
		int l = 0, r = arr.length - 1, mid = 0;
		while (l < r) {
			mid = l + (r - l) / 2;
			if (arr[mid] < val)
				l = mid + 1;
			else
				r = mid;
		}
		return l;
	}
}