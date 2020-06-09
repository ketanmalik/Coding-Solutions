
/**
 * Leetcode #1380 - https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * 
 * @author ketanmalik
 * June 9 2020
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LC1380 {

	public static void main(String[] args) {
		System.out.println(Arrays
				.toString(luckyNumbers(new int[][] { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } }).toArray()));
	}

	public static List<Integer> luckyNumbers(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, colIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					colIndex = j;
				}
			}
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][colIndex] > max)
					max = matrix[j][colIndex];
			}
			if (max == min)
				res.add(max);
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			colIndex = 0;
		}
		return res;
	}
}