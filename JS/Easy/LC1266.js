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

var minTimeToVisitAllPoints = function (points) {
  var time = 0;
  for (var i = 0; i < points.length - 1; i++) {
    var x = Math.abs(points[i][0] - points[i + 1][0]);
    var y = Math.abs(points[i][1] - points[i + 1][1]);
    time += Math.max(x, y);
  }
  return time;
};

console.log(
  minTimeToVisitAllPoints([
    [559, 511],
    [932, 618],
    [-623, -443],
    [431, 91],
    [838, -127],
    [773, -917],
    [-500, -910],
    [830, -417],
    [-870, 73],
    [-864, -600],
    [450, 535],
    [-479, -370],
    [856, 573],
    [-549, 369],
    [529, -462],
    [-839, -856],
    [-515, -447],
    [652, 197],
    [-83, 345],
    [-69, 423],
    [310, -737],
    [78, -201],
    [443, 958],
    [-311, 988],
    [-477, 30],
    [-376, -153],
    [-272, 451],
    [322, -125],
    [-114, -214],
    [495, 33],
    [371, -533],
    [-393, -224],
    [-405, -633],
    [-693, 297],
    [504, 210],
    [-427, -231],
    [315, 27],
    [991, 322],
    [811, -746],
    [252, 373],
    [-737, -867],
    [-137, 130],
    [507, 380],
    [100, -638],
    [-296, 700],
    [341, 671],
    [-944, 982],
    [937, -440],
    [40, -929],
    [-334, 60],
    [-722, -92],
    [-35, -852],
    [25, -495],
    [185, 671],
    [149, -452],
  ])
);
