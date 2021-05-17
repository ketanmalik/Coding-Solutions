/**
 * Leetcode #380 Problem Link - https://leetcode.com/problems/insert-delete-getrandom-o1/
 *
 * @author ketanmalik
 * June 12 2020
 * */

/**
 * Initialize your data structure here.
 */
let set;
var RandomizedSet = function () {
  set = new Set();
};

/**
 * Inserts a value to the set. Returns true if the set did not already contain the specified element.
 * @param {number} val
 * @return {boolean}
 */
RandomizedSet.prototype.insert = function (val) {
  return set.size !== set.add(val).size;
};

/**
 * Removes a value from the set. Returns true if the set contained the specified element.
 * @param {number} val
 * @return {boolean}
 */
RandomizedSet.prototype.remove = function (val) {
  return set.delete(val);
};

/**
 * Get a random element from the set.
 * @return {number}
 */
RandomizedSet.prototype.getRandom = function () {
  return [...set][(Math.random() * set.size) | 0];
};

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = new RandomizedSet()
 * var param_1 = obj.insert(val)
 * var param_2 = obj.remove(val)
 * var param_3 = obj.getRandom()
 */
