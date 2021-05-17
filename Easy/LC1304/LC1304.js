/*
 * Leetcode #1304 Problem Link -  https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 *
 * @author ketanmalik
 * May 28 2020
 *
 * */

let sumZero = function (n) {
  let res = [];
  if (n % 2 === 1) res.push(0);
  for (let i = 1; i <= n / 2; i++) {
    res.push(i, -i);
  }
  return res;
};

console.log(sumZero(999));
