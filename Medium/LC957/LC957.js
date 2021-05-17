/**
 * Leetcode #957 - https://leetcode.com/problems/prison-cells-after-n-days/
 *
 * @author ketanmalik
 * July 03
 */

var prisonAfterNDays = function (cells, N) {
  let len = cells.length;
  N = N % 14 ? N % 14 : 14;
  let days = N;
  while (days > 0) {
    cells = cells.map((e, i) =>
      i !== 0 && i !== len - 1
        ? (cells[i - 1] && cells[i + 1]) || (!cells[i - 1] && !cells[i + 1])
          ? 1
          : 0
        : e
    );
    if (days === N) {
      cells[0] = 0;
      cells[len - 1] = 0;
    }
    days--;
  }
  return cells;
};

console.log(prisonAfterNDays([1, 0, 0, 1, 0, 0, 1, 0], 1000000000));
