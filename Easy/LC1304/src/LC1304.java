/*
 * Leetcode #1304 Problem Link -  https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 * 
 * @author ketanmalik
 * May 28 2020
 * 
 * */

import java.util.Arrays;

public class LC1304 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sumZero(5)));
	}

	public static int[] sumZero(int n) {
		int[] res = new int[n];
		int num = 1, ctr = n / 2, index = 0;

		if ((n % 2) != 0) {
			ctr = (n - 1) / 2;
			res[n - 1] = 0;
		}

		for (int i = 0; i < ctr; i++) {
			res[index] = num;
			res[++index] = -num;
			num += 1;
			index += 1;
		}
		return res;
	}
}
