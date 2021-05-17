/*
 * Leetcode #771
 * 
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

@author ketanmalik
May 14 2020
*/
public class LC771 {

	public static void main(String args[]) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	}

	public static int numJewelsInStones(String J, String S) {

		// Complexity O(max(J.len, S.len))
		int res = 0;
		int count[] = new int[126];

		for (char c : S.toCharArray()) {
			count[c]++;
		}

		for (char ch : J.toCharArray()) {
			res += count[ch];
		}

		// Complexity O(n*m)
		/*
		 * for (int i = 0; i < S.length(); i++) { for (int j = 0; j < J.length(); j++) {
		 * if (S.charAt(i) == J.charAt(j)) { res++; break; } } }
		 */

		return res;
	}
}
