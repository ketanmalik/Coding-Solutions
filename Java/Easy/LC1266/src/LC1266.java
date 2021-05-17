/*
 * Leetcode #1266
 * 
 * On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.
 * You can move according to the next rules:
 * 
 * 		1. In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
 * 		2. You have to visit the points in the same order as they appear in the array.
 * 
 * Example 1
 * Input: points = [[1,1],[3,4],[-1,0]]
 * Output: 7
 * Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
 * Time from [1,1] to [3,4] = 3 seconds 
 * Time from [3,4] to [-1,0] = 4 seconds
 * Total time = 7 seconds
 * 
 * @author ketanmalik
 * May 21 2020
 * 
 * */

public class LC1266 {

	public static void main(String[] args) {
		int[][] testCase = { { 1, 1 }, { 3, 4 }, { 30, -5 } };
		System.out.println(minTimeToVisitAllPoints(testCase));
	}

	public static int minTimeToVisitAllPoints(int[][] points) {
		int time = 0;
		for (int i = 0; i < points.length - 1; i++) {
			int x = points[i][0] - points[i + 1][0];
			int y = points[i][1] - points[i + 1][1];
			time += Math.max(Math.abs(x), Math.abs(y));
		}
		return time;

		// A longer approach
//         int time = 0;
//         for(int i=0; i<points.length-1; i++){
//             // source coordinates for x & y
//             int xs = points[i][0], ys = points[i][1];

//             // target coordinates for x & y
//             int xt = points[i+1][0], yt = points[i+1][1];

//             if(xs == xt) time += Math.abs(ys - yt);
//             else if(ys == yt) time += Math.abs(xs - xt);
//             else{
//                 if(Math.abs(ys - yt) > Math.abs(xs - xt)){
//                     while(xs != xt){
//                     time += 1;
//                     if(xt < xs) xs--; else xs++;
//                     if(yt < ys) ys--; else ys++;
//                 }
//                 if(ys != yt) time += Math.abs(ys - yt);
//                 }else{
//                      while(ys != yt){
//                     time += 1;
//                     if(xt < xs) xs--; else xs++;
//                     if(yt < ys) ys--; else ys++;
//                 }
//                 if(xs != xt) time += Math.abs(xs - xt);
//                 }
//             }
//         }
//         return time;
	}
}
