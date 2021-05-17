/*
Leetcode #1295

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

@author ketanmalik
May 18 2020
*/

var findNumbers = function (nums) {
  return nums.reduce(
    (acc, curr) => (1 === Math.floor(Math.log10(curr)) % 2 ? acc + 1 : acc),
    0
  );
};

// var reducer = (acc, curr, i, arr) => {

// };

console.log(findNumbers([12, 345, 2, 6, 789]));
