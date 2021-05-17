/**
 * Leetcode #1299 Problem Link - https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 *
 * @author ketanmalik
 * May 26 2020
 */

var replaceElements = function (arr) {
  var max = 0;
  let res = [];
  res[res.length - 1] = -1;
  for (var i = res.length - 1; i > 0; i--) {
    max = Math.max(max, arr[i]);
    res[i - 1] = max;
  }
  return res;
};

console.log(replaceElements([1, 2, 34, 542, 31]));
