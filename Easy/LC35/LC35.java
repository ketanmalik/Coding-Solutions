/**
 * Leetcode #35 - https://leetcode.com/problems/search-insert-position/
 * 
 * @author ketanmalik June 10 2020
 */

public class LC35 {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] { 1, 3, 5, 8, 9, 10 }, 8));
	}

	public static int searchInsert(int[] nums, int target) {
		int start = 0, end = nums.length - 1, mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (nums[mid] == target)
				return mid;
			else if (target > nums[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return start;
	}

}
