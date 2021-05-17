
/*
 * Leetcode #832 Problem Link - https://leetcode.com/problems/flipping-an-image/
 * 
 * @author ketanmalik
 * May 28 2020
 * 
 * */

import java.util.Arrays;

public class LC832 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(flipAndInvertImage(new int[][] { { 1, 0, 0 }, { 0, 1, 1 }, { 1, 1, 1 } })));
	}

	public static int[][] flipAndInvertImage(int[][] A) {
		int[][] res = new int[A.length][A[0].length];
		int row = 0, col = 0;
		for (int i = 0; i < A.length; i++) {
			col = 0;
			for (int j = A[0].length - 1; j >= 0; j--) {
				res[row][col] = A[i][j];
				if (res[row][col] == 1)
					res[row][col] = 0;
				else
					res[row][col] = 1;
				col++;
			}
			row++;
		}
		return res;
	}

}
