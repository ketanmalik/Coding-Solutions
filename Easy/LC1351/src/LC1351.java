/*
 * LC #1351 Probem Link - https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * 
 * @author ketanmalik
 * May 26 2020
 * 
 * */

public class LC1351 {
	public static void main(String[] args) {
		System.out.println(countNegatives(new int[][] { { 3, 1 }, { 1, -1 } }));
	}

	public static int countNegatives(int[][] grid) {
		int row = grid.length, col = grid[0].length, res = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] < 0) {
					res += col - j;
					break;
				}
			}
		}
		return res;
	}

}
