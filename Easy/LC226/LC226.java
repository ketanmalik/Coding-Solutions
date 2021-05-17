/**
 * Leetcode #226 Problem Link -
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 * @author ketanmalik June 1 2020
 * 
 */

public class LC226 {
	class Solution {
		public TreeNode invertTree(TreeNode root) {
			invertTreeRec(root);
			return root;
		}

		public  void invertTreeRec(TreeNode root) {
			if (root == null)
				return;
			invertTreeRec(root.left);
			invertTreeRec(root.right);
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
	}
}
