/*
 * Leetcode #728 Problem Link - https://leetcode.com/problems/self-dividing-numbers/
 * 
 * @author ketanmalik
 * May 29 2020
 * */

import java.util.ArrayList;
import java.util.List;

public class LC728 {

	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 30));
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<Integer>();
		boolean divisible = true;

		for (int i = left; i <= right; i++) {
			int dividend = i;
			divisible = true;
			while (dividend > 0) {
				int divisor = dividend % 10;
				if (divisor == 0) {
					divisible = false;
					break;
				}
				if (i % divisor != 0) {
					divisible = false;
					break;
				}
				dividend /= 10;
			}
			if (divisible)
				res.add(i);
		}
		return res;
	}
}
