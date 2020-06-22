/**
 * Leetcode #1475 Problem Link -
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * 
 * @author ketanmalik June 22 2020
 */

class Solution {
	public static void main(String[] args) {
		System.out.println(finalPrices(new int[] { 8, 6, 7, 8, 3, 3, 5, 7 }));
	}

	public static int[] finalPrices(int[] prices) {
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					prices[i] -= prices[j];
					break;
				}
			}
		}
		return prices;
	}
}