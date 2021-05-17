
/**
 * 
 * Leetcode #987 - https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 * 
 * @author ketanmalik
 * Aug 7 2020
 * */

import java.util.*;

class Node {
	int x;
	int y;
	int val;

	Node(int x, int y, int val) {
		this.x = x;
		this.y = y;
		this.val = val;
	}
}

//Definition for a binary tree node.
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

class LC987 {
	public List<List<Integer>> verticalTraversal(TreeNode root) {
		List<Node> lst = new ArrayList<>();
		getNodes(root, lst, 0, 0);

		Collections.sort(lst, (n1, n2) -> n1.x == n2.x ? n1.y == n2.y ? n1.val - n2.val : n2.y - n1.y : n1.x - n2.x);

		Map<Integer, List<Integer>> map = new TreeMap<>();
		for (Node n : lst) {
			List<Integer> line = map.getOrDefault(n.x, new ArrayList<>());
			line.add(n.val);
			map.put(n.x, line);
		}

		List<List<Integer>> res = new ArrayList<>();
		for (Integer e : map.keySet()) {
			res.add(map.get(e));
		}

		return res;
	}

	public void getNodes(TreeNode root, List<Node> list, int x, int y) {
		if (root == null)
			return;
		list.add(new Node(x, y, root.val));
		getNodes(root.left, list, x - 1, y - 1);
		getNodes(root.right, list, x + 1, y - 1);
	}
}