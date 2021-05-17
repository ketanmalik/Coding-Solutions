/**
 * Leetcode #264 - https://leetcode.com/problems/ugly-number-ii/
 *
 * @author ketanmalik
 * July 04 2020
 */
var nthUglyNumber = function (n) {
  let nums = [2, 3, 5];
  let count = [0, 0, 0];
  let res = [1];
  n--;

  while (n > 0) {
    const newNums = nums.map((e, i) => res[count[i]] * e);
    const newMin = Math.min(...newNums);
    newNums.forEach((e, i) => (newNums[i] === newMin ? count[i]++ : ""));
    res.push(newMin);
    n--;
  }

  return res.pop();
};

console.log(nthUglyNumber(1690));
