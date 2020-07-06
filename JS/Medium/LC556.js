/**
 * Leetcode #556 - https://leetcode.com/problems/next-greater-element-iii/
 *
 * @author ketanmalik
 * July 06 2020
 *
 */

var nextGreaterElement = function (n) {
  let arr = n
    .toString()
    .split("")
    .map((e) => +e);
  let maxIndex = -1;
  let maxDigit = -Infinity;

  for (let i = arr.length - 1; i >= 0; i--) {
    if (arr[i] < maxDigit) {
      maxIndex = i;
      break;
    }
    maxDigit = Math.max(maxDigit, arr[i]);
  }

  if (maxIndex === -1) return -1;

  let tempArr = arr.splice(maxIndex + 1).sort((a, b) => a - b);

  for (let i = 0; i < tempArr.length; i++) {
    if (tempArr[i] > arr[maxIndex]) {
      [arr[maxIndex], tempArr[i]] = [tempArr[i], arr[maxIndex]];
      break;
    }
  }
  let res = parseInt(arr.concat(tempArr).join(""));
  let max32Bit = 2147483647;
  return res > max32Bit ? -1 : res;
};
