/*
 * Leetcode #728 Problem Link - https://leetcode.com/problems/self-dividing-numbers/
 *
 * @author ketanmalik
 * May 29 2020
 * */

var selfDividingNumbers = function (left, right) {
  let res = [];

  for (let i = left; i <= right; i++) {
    String(i)
      .split("")
      .every((num) => +num && !(i % num))
      ? res.push(i)
      : "";
  }

  return res;
};
