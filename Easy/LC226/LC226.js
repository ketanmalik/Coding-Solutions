/**
 * Leetcode #226 Problem Link - https://leetcode.com/problems/invert-binary-tree/
 *
 * @author ketanmalik
 * June 1 2020
 *
 */

var invertTree = function (root) {
  invertTreeRec(root);
  return root;
};

var invertTreeRec = function (root) {
  if (root == null) return;
  invertTreeRec(root.left);
  invertTreeRec(root.right);
  let temp = root.left;
  root.left = root.right;
  root.right = temp;
};
