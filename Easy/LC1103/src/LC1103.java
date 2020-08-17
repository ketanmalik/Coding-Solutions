/**
 * Leetcode #1103 - https://leetcode.com/problems/distribute-candies-to-people/
 * 
 * @author ketanmalik Aug 17 2020
 */

class LC1103 {
	public static void main(String[] args) {
		System.out.println(distributeCandies(10, 3));
	}

	public static int[] distributeCandies(int candies, int num_people) {
		int[] res = new int[num_people];
		if (candies == 0)
			return res;

		// idx -> keeps track of current index, count -> keeps track of candies to be
		// distributed
		int idx = 0, count = 1;

		while (candies > 0) {
			if (candies - count >= 0) {
				candies -= count; // Reduce total candies by count of candies given in this round
				res[idx] += count++;
				if (++idx == res.length)
					idx = 0; // Checks if current index has reached the end of array
			} else {
				res[idx] += candies; // Final case when last person receives all the remaining candies
				candies -= count;
			}
		}
		return res;
	}
}