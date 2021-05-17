/**
 * Leetcode #977 Problem Link - https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * @author ketanmalik
 * June 4 2020
 * */

var sortedSquares = function (A) {
  return A.map((e) => e * e).sort((a, b) => a - b);
};

console.log(sortedSquares([-4, -1, 0, 3, 10]));
