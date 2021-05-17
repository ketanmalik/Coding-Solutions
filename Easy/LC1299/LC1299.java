import java.util.Arrays;

/*
 * Leetcode #1299 Problem Link - https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * 
 *  @author ketanmalik
 *  May 26 2020
 *  
 * */

public class LC1299 {
	public static void main(String[] args) {
		System.out.println(replaceElements(new int[] { 1, 18, 12, 3, 2, 1 }));
	}

	public static String replaceElements(int[] arr) {
		int max = 0;
		int[] res = new int[arr.length];
		res[res.length - 1] = -1;
		for (int i = res.length - 1; i > 0; i--) {
			max = Math.max(max, arr[i]);
			res[i - 1] = max;
		}
		return Arrays.toString(res);
	}
}
