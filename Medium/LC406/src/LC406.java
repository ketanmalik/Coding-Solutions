import java.util.Arrays;
import java.util.Comparator;

/**
 * Leetcode #406 - https://leetcode.com/problems/queue-reconstruction-by-height/
 * 
 * @author ketanmalik June 6 2020
 */

class LC406 {
	public static void main(String args[]) {
		int[][] res = reconstructQueue(new int[][] { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } });
	}

	public static int[][] reconstructQueue(int[][] people) {

		// Brute-Force Approach - O(nlogn)
		if (people.length == 0)
			return new int[0][];
		int[][] res = new int[people.length][people[0].length];
		Arrays.sort(people, new Comparator<int[]>() {
			public int compare(int[] a1, int[] a2) {
				return Integer.compare(a1[0], a2[0]);
			}
		});

		for (int i = 0; i < res.length; i++)
			res[i][0] = -1;

		boolean firstElem = true;
		int temp = 0, height = 0, ahead = 0;

		for (int i = 0; i < people.length; i++) {
			height = people[i][0];
			ahead = people[i][1];
			if (firstElem) {
				res[ahead][0] = height;
				res[ahead][1] = ahead;
				firstElem = false;
			} else {
				if (ahead == 0) {
					for (int j = 0; j < res.length; j++) {
						if (res[j][0] == -1 && res[j][1] == 0) {
							res[j][0] = height;
							res[j][1] = ahead;
							break;
						}
					}
				} else {
					temp = 0;
					for (int j = 0; j < res.length; j++) {
						if (temp == ahead) {
							while (j < res.length) {
								if (res[j][0] == -1 && res[j][1] == 0) {
									res[j][0] = height;
									res[j][1] = ahead;
									break;
								}
								j += 1;
							}
							break;
						} else if ((res[j][0] == -1 && res[j][1] == 0) || res[j][0] >= height) {
							temp++;
						}
					}
				}
			}
		}
		return res;
	}
}