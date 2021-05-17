/**
 * Leetcode #961 Problem Link -
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 *
 * @author ketanmalik June 1 2020
 */

var repeatedNTimes = function (A) {
  let map = new Map();
  for (let elem of A) {
    if (map.has(elem)) return elem;
    map.set(elem, 1);
  }
};

console.log(repeatedNTimes([5, 1, 5, 2, 5, 3, 5, 4]));
