/**
 * Leetcode #66 - https://leetcode.com/problems/plus-one/
 *
 * @author ketanmalik
 * July 06 2020
 *
 */

var plusOne = function (digits) {
  digits[digits.length - 1]++;
  if (digits[digits.length - 1] === 10) {
    digits[digits.length - 1] = 0;
    for (let i = digits.length - 2; i >= 0; i--) {
      digits[i]++;
      if (digits[i] !== 10) break;
      if (digits[i] === 10) digits[i] = 0;
    }
  }
  if (digits[0] === 0) digits.unshift(1);
  return digits;

  // One-liner solution
  // return (BigInt(digits.join('')) + BigInt(1)).toString('').split('');
};
