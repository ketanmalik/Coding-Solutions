/**
 * Leetcode #657 Problem Link -
 * https://leetcode.com/problems/robot-return-to-origin/
 * 
 * @author ketanmalik June 2 2020
 */

public class LC657 {

	public static void main(String[] args) {
		System.out.println(judgeCircle("LLDRU"));
	}

	public static boolean judgeCircle(String moves) {
		int vertical = 0, horizontal = 0;
		for (char c : moves.toCharArray()) {
			switch (c) {
			case 'U':
				vertical++;
				break;
			case 'L':
				horizontal++;
				break;
			case 'D':
				vertical--;
				break;
			case 'R':
				horizontal--;
				break;
			default:
				break;
			}
		}
		return (vertical == 0 && horizontal == 0);
	}
}
