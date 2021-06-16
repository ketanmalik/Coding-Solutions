/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// T.C = O(N), S.C = O(H) where H = height of the tree
class Solution {
    TreeNode res = new TreeNode();
    TreeNode curr = res;
    
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return res.right;
    }
    
    public void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        curr.right = node;
        node.left = null;
        curr = node;
        inorder(node.right);
    }
}


// T.C = O(N), S.C = O(N)
// class Solution {
    
//     List<TreeNode> list = new ArrayList<>();
//     public TreeNode increasingBST(TreeNode root) {
//         inorder(root);
//         int i = 0;
//         TreeNode res = list.get(0);
//         TreeNode curr = res;
//         for(i=0; i<list.size() - 1; i++) {
//             curr.right = list.get(i + 1);
//             curr = curr.right;
//         }
//         return res;
//     }
    
//     public void inorder(TreeNode node) {
//         if(node == null) return;
//         inorder(node.left);
//         list.add(node);
//         node.left = null;
//         inorder(node.right);
//     }
// }