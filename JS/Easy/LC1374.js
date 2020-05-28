/*
 * Leetcode #1374 Problem Link - https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 *
 * @author ketanmalik
 * May 28 2020
 *
 * */

var generateTheString = function (n) {
  var res = new Array(n).fill("a");
  n % 2 == 0 ? (res[n - 1] = "b") : "";
  return res.join("");
};

console.log(generateTheString(9));
