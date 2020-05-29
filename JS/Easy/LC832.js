/*
 * Leetcode #832 Problem Link - https://leetcode.com/problems/flipping-an-image/
 *
 * @author ketanmalik
 * May 28 2020
 *
 * */

var flipAndInvertImage = function (A) {
  A.forEach((row, i) => (A[i] = row.reverse().map((e) => (e ? 0 : 1))));
  return A;
};

console.log(
  flipAndInvertImage([
    [1, 1, 0],
    [1, 0, 1],
    [0, 0, 0],
  ])
);
