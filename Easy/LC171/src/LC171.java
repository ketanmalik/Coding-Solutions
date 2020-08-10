/**
 * Leetcode #171 - https://leetcode.com/problems/excel-sheet-column-number/
 * 
 * @author ketanmalik Aug 10 2020
 */

class LC171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("FXSHRXW"));
	}

	public static int titleToNumber(String s) {
		char[] arr = s.toCharArray();
		int pow = 1;
		int res = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			res += (arr[i] - 'A' + 1) * (pow);
			pow *= 26;
		}
		return res;
	}
}