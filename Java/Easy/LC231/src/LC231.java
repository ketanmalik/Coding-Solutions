/**
 * Leetoce #231 - https://leetcode.com/problems/power-of-two/
 * 
 * @author ketanmalik June 8 2020
 */

public class LC231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(512));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 1)
			return true;
		if (n <= 0 || (n % 2 != 0))
			return false;
		while (n > 1) {
			if (n % 2 != 0)
				return false;
			n /= 2;
		}
		return true;
	}

}
