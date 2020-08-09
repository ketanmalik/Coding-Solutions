
/**
 * Leetcode #994 - https://leetcode.com/problems/rotting-oranges/
 * 
 * @author ketanmalik
 * Aug 9 2020
 * */

import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class LC994 {

	public static void main(String[] args) {
		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		System.out.println(orangesRotting(grid));
	}

	public static int orangesRotting(int[][] grid) {
		Queue<Pair> q = new LinkedList<>();
		int row = grid.length, col = grid[0].length;
		int total = 0, rotten = 0, time = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 1 || grid[i][j] == 2)
					total++;
				if (grid[i][j] == 2)
					q.offer(new Pair(i, j));
			}
		}

		if (total == 0)
			return 0;

		while (!q.isEmpty()) {
			int size = q.size();
			rotten += size;
			if (rotten == total)
				return time;
			time++;

			while (size-- > 0) {
				Pair p = q.peek();

				if (p.x + 1 < row && grid[p.x + 1][p.y] == 1) {
					grid[p.x + 1][p.y] = 2;
					q.offer(new Pair(p.x + 1, p.y));
				}
				if (p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1) {
					grid[p.x - 1][p.y] = 2;
					q.offer(new Pair(p.x - 1, p.y));
				}
				if (p.y + 1 < col && grid[p.x][p.y + 1] == 1) {
					grid[p.x][p.y + 1] = 2;
					q.offer(new Pair(p.x, p.y + 1));
				}
				if (p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1) {
					grid[p.x][p.y - 1] = 2;
					q.offer(new Pair(p.x, p.y - 1));
				}

				q.poll();
			}
		}
		return -1;
	}
}