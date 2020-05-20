/*
Leetcode #938

Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
The binary search tree is guaranteed to have unique values.

Example 1:
Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23

@author ketanmalik
May 19 2020
*/

function rangeSumBST(root, l, r) {
  let sum = 0;
  dfs(root);
  return sum;

  function dfs(node) {
    if (!node) {
      return;
    }

    if (node.val < l) {
      dfs(node.right);
      return;
    }

    if (node.val > r) {
      dfs(node.left);
      return;
    }

    sum += node.val;
    dfs(node.left);
    dfs(node.right);
  }
}
