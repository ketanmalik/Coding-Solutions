
/**
 * Leetcode #942 - https://leetcode.com/problems/di-string-match/
 * 
 * @author ketanmalik
 * June 8 2020
 * */

import java.util.Arrays;

public class LC942 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(diStringMatch("DIIIDIDI")));
	}

	public static int[] diStringMatch(String S) {
		int iCount = 0, dCount = S.length(), i = 0;
		int[] res = new int[S.length() + 1];

		for (char c : S.toCharArray()) {
			if (c == 'I')
				res[i] = iCount++;
			else
				res[i] = dCount--;
			i++;
		}
		if (S.charAt(S.length() - 1) == 'D')
			res[S.length()] = iCount;
		else
			res[S.length()] = dCount;
		return res;
	}
}
