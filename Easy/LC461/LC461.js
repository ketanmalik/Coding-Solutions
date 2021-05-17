/**
 * Leetcode #461 - https://leetcode.com/problems/hamming-distance/
 *
 * @author ketanmalik
 * July 05
 */

var hammingDistance = function (x, y) {
  return (x ^ y).toString(2).replace(/0/g, "").length;
};
