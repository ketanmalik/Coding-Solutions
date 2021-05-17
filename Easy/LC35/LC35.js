/**
 * Leetcode #35 - https://leetcode.com/problems/search-insert-position/
 *
 * @author ketanmalik June 10 2020
 */

var searchInsert = function (nums, target) {
  let start = 0,
    end = nums.length - 1,
    mid = 0;
  while (start <= end) {
    mid = ((start + end) / 2) | 0;
    if (nums[mid] == target) return mid;
    else if (target > nums[mid]) start = ++mid;
    else end = --mid;
  }
  return start;
};

console.log(searchInsert([1, 3, 5, 6, 7, 9, 10], 8));
