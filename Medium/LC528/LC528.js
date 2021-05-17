/**
 * Leetcode #528 Problem Link - https://leetcode.com/problems/random-pick-with-weight/
 *
 * @author ketanmalik
 * June 5 2020
 */

var Solution = function (w) {
  this.weights = new Array(w.length);
  this.sum = 0;
  for (let i = 0; i < w.length; i++) {
    this.sum += w[i];
    this.weights[i] = this.sum;
  }
};

Solution.prototype.pickIndex = function () {
  let index = Math.floor(Math.random() * this.sum) + 1;
  let l = 0,
    r = this.weights.length - 1,
    mid = 0;

  while (l < r) {
    mid = parseInt(l + (r - l) / 2);
    if (this.weights[mid] < index) l = mid + 1;
    else r = mid;
  }
  return l;
};
