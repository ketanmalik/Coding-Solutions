/**
 * Leetcode #107 - https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *
 * @author ketanmalik
 * July 2 2020
 *
 */

var levelOrderBottom = function (root) {
  if (root == null) return [];
  let res = [];
  let q = [];
  res.push([root.val]);
  q.push(root);
  while (q.length > 0) {
    let i = 0;
    let c = [];
    c = q.reduce((acc, curr) => {
      if (curr.left) {
        q.push(curr.left);
        acc.push(curr.left.val);
      }
      if (curr.right) {
        q.push(curr.right);
        acc.push(curr.right.val);
      }
      i++;
      return acc;
    }, []);
    c.length ? res.unshift(c) : "";
    q.splice(0, i);
  }
  return res;
};
