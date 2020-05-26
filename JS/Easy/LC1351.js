/*
 * LC #1351 Probem Link - https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 *
 * @author ketanmalik
 * May 26 2020
 *
 * */

var countNegatives = function (grid) {
  let row = grid.length,
    col = grid[0].length,
    res = 0;
  let i = row - 1,
    j = 0;
  while (i >= 0 && j < col) {
    let num = grid[i][j];
    if (num >= 0) j++;
    else {
      i--;
      res += col - j;
      j = 0;
    }
  }
  return res;
};

console.log(
  countNegatives([
    [5, 1, 0],
    [-5, -5, -5],
  ])
);
