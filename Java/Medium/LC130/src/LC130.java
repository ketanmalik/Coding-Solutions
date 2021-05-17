/**
 * Leetcode #130 Problem Link -
 * https://leetcode.com/problems/surrounded-regions/submissions/
 * 
 * @author ketanmalik June 17 2020
 * 
 */

class LC130 {
	public void solve(char[][] board) {
		if (board.length == 0)
			return;
		int row = board.length;
		int col = board[0].length;

		for (int i = 0; i < col; i++) {
			// board[i][0];
			if (board[0][i] == 'O') {
				replace(0, i, row, col, board);
			}
		}
		for (int i = 1; i < row; i++) {
			// board[i][col-1]
			if (board[i][col - 1] == 'O') {
				replace(i, col - 1, row, col, board);
			}
		}
		for (int i = col - 2; i >= 0; i--) {
			// board[row-1][i]
			if (board[row - 1][i] == 'O') {
				replace(row - 1, i, row, col, board);
			}
		}
		for (int i = row - 2; i >= 1; i--) {
			// board[0][i]
			if (board[i][0] == 'O') {
				replace(i, 0, row, col, board);
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (board[i][j] == 'O')
					board[i][j] = 'X';
				if (board[i][j] == 'C')
					board[i][j] = 'O';
			}
		}
	}

	public static void replace(int i, int j, int row, int col, char[][] A) {
		if (i > row || j > col)
			return;
		if (i < 0 || j < 0)
			return;
		A[i][j] = 'C';
		if (i + 1 < row && A[i + 1][j] == 'O')
			replace(i + 1, j, row, col, A);
		if (i > 0 && A[i - 1][j] == 'O')
			replace(i - 1, j, row, col, A);
		if (j + 1 < col && A[i][j + 1] == 'O')
			replace(i, j + 1, row, col, A);
		if (j > 0 && A[i][j - 1] == 'O')
			replace(i, j - 1, row, col, A);
	}
}