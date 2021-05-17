import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode #590 - https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * 
 * @author ketanmalik June 24 2020
 */

class LC590 {

	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}

	public List<Integer> postorder(Node root) {
		List<Integer> list = new ArrayList<>();
		getOrder(list, root);
		return list;
	}

	public void getOrder(List<Integer> list, Node node) {
		if (node == null)
			return;
		for (int i = 0; i < node.children.size(); i++)
			getOrder(list, node.children.get(i));
		list.add(node.val);
	}
}