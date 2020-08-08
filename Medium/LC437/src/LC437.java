
/**
 * 
 * Leetcode #437 - https://leetcode.com/problems/path-sum-iii/
 * 
 * @author ketanmalik
 * Aug 08 2002
 * */

import java.util.HashMap;
import java.util.Map;

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class LC437 {
	int count = 0;

	public int pathSum(TreeNode root, int sum) {
		if (root == null)
			return 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		getSum(root, 0, sum, map);
		return count;
	}

	public void getSum(TreeNode node, int sum, int target, Map<Integer, Integer> map) {
		if (node == null)
			return;

		sum += node.val;

		if (map.containsKey(sum - target)) {
			count += map.get(sum - target);
		}
		map.put(sum, map.getOrDefault(sum, 0) + 1);
		getSum(node.left, sum, target, map);
		getSum(node.right, sum, target, map);
		map.put(sum, map.get(sum) - 1);
	}
}

//O(n^2) Solution
//
//class Solution {
//    int count = 0;
//    
//    public int pathSum(TreeNode root, int sum) {
//        if(root == null) return 0;
//        
//        getSum(root, sum, 0);
//        pathSum(root.left, sum);
//        pathSum(root.right, sum);
//        
//        return count;
//    }
//    
//    public void getSum(TreeNode node, int target, int currentSum) {
//        if(node == null) return;
//        currentSum += node.val;
//        if(currentSum == target) count++;
//        getSum(node.left, target, currentSum);
//        getSum(node.right, target, currentSum);
//    }
//}