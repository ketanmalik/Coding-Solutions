/*
 * Leetcode #1252
 * 
 * Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. 
 * For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.
 * Return the number of cells with odd values in the matrix after applying the increment to all indices.
 * 
 * Example 1:
 * Input: n = 2, m = 3, indices = [[0,1],[1,1]]
 * Output: 6
 * Explanation: Initial matrix = [[0,0,0],[0,0,0]].
 * After applying first increment it becomes [[1,2,1],[0,1,0]].
 * The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
 * 
 * @author ketanmalik
 * May 25 2020
 * 
 * */

public class LC1252 {

	public static void main(String[] args) {
		System.out.println(oddCells(3, 4, new int[][] { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 1 } }));
	}

	// Time Complexity - O(n+m)
	public static int oddCells(int n, int m, int[][] indices) {
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[m];

		for (int i = 0; i < indices.length; i++) {
			int ri = indices[i][0];
			int ci = indices[i][1];

			row[ri] = !row[ri];
			col[ci] = !col[ci];
		}

		int re = 0, ro = 0, ce = 0, co = 0;
		for (int i = 0; i < n; i++) {
			if (row[i])
				ro++;
			else
				re++;
		}
		for (int i = 0; i < m; i++) {
			if (col[i])
				co++;
			else
				ce++;
		}

		return ro * ce + re * co;

		// Brute-force approach, O(n*m)
		// int[][] arr = new int[n][m];
		// int res = 0;
		// for(int i=0; i<indices.length; i++){
		// int index = indices[i][0];
		// for(int j=0; j<m; j++){
		// ++arr[index][j];
		// if(arr[index][j] % 2 == 0) res--;
		// else res++;
		// }
		// }
		// for(int i=0; i<indices.length; i++){
		// int index = indices[i][1];
		// for(int j=0; j<n; j++){
		// ++arr[j][index];
		// if(arr[j][index] % 2 == 0) res--;
		// else res++;
		// }
		// }
		// return res;
	}

}
