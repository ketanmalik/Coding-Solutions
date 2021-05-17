/**
 * Leetcode #171 - https://leetcode.com/problems/excel-sheet-column-number/
 *
 * @author ketanmalik Aug 10 2020
 */

var titleToNumber = function (s) {
  let arr = [...s];
  let res = 0,
    pow = 1;
  for (let i = arr.length - 1; i >= 0; i--) {
    res += (arr[i].charCodeAt() - 64) * pow;
    pow *= 26;
  }
  return res;
};

console.log(titleToNumber("FXSHRXW"));
