/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var widthOfBinaryTree = function (root) {
  if (!root) return 0;
  let res = 1;
  let q = [{ node: root, pos: 0 }];

  while (q.length) {
    let temp = [];
    let min, max;
    for (let i = 0; i < q.length; i++) {
      const { node, pos } = q[i];

      if (i === 0) min = pos;
      if (i === q.length - 1) max = pos;

      if (node.left) temp.push({ node: node.left, pos: 2 * pos + 1 });
      if (node.right) temp.push({ node: node.right, pos: 2 * pos + 2 });
    }
    const width = q.length === 1 ? 1 : max - min + 1;
    res = Math.max(res, width);
    q = temp;
  }
  return res;
};
