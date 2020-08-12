/**
 * Leetcode #119 - https://leetcode.com/problems/pascals-triangle-ii/
 * 
 * @author ketanmalik
 * Aug 12 2020
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LC119 {

	public static void main(String args[]) {
		System.out.println(getRow(3));
	}

	public static List<Integer> getRow(int rowIndex) {
		if (rowIndex == 0)
			return new ArrayList<>(Arrays.asList(1));
		if (rowIndex == 1)
			return new ArrayList<>(Arrays.asList(1, 1));
		if (rowIndex == 2)
			return new ArrayList<>(Arrays.asList(1, 2, 1));
		int count = 3;
		int[] temp = new int[rowIndex + 1];
		int[] res = new int[rowIndex + 1];
		temp[0] = 1;
		temp[1] = 2;
		temp[2] = 1;
		res[0] = 1;

		int loop = rowIndex - 2;

		while (loop > 0) {
			for (int i = 1; i < count; i++) {
				res[i] = temp[i - 1] + temp[i];
			}
			res[count] = 1;

			for (int i = 0; i <= count; i++) {
				temp[i] = res[i];
			}
			count++;
			loop--;
		}

		List<Integer> row = new ArrayList<>();
		for (int i = 0; i < res.length; i++) {
			row.add(res[i]);
		}
		return row;

	}
}