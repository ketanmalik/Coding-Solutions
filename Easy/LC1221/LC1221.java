/*
 Leetcode #1221
 
Balanced strings are those who have equal quantity of 'L' and 'R' characters.
Given a balanced string s split it in the maximum amount of balanced strings.
Return the maximum amount of splitted balanced strings.

Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:
Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.

Example 3:
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".

Example 4:
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
 
@author ketanmalik
May 19 2020
 */

public class LC1221 {
	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLLLRLLLRRRR"));
	}

	public static int balancedStringSplit(String s) {
		
		// Time - O(n)
        int res = 0, count = 0;
        for(char c: s.toCharArray()){
            if(c == 'R') count++;
            else count --;
            if(count == 0) res++;
        }
        return res;
        
        // Time - O(n^2)
//		int r = 0, l = 0, res = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'R')
//				r++;
//			else
//				l++;
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s.charAt(j) == 'R')
//					r++;
//				else
//					l++;
//				if (l == r) {
//					res++;
//					i = j;
//					break;
//				}
//			}
//			r = 0;
//			l = 0;
//		}
//		return res;
	}
}
