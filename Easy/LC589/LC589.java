import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode #589 - https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * 
 * @author ketanmalik June 24 2020
 */

class Solution {

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

	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		getOrder(list, root);
		return list;

		// Iterative Solution
//        List<Integer> list = new ArrayList<>();
//        if(root == null) return list;
//        
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        while(!stack.isEmpty()){
//            Node node = stack.pop();
//            list.add(node.val);
//            for(int i=node.children.size()-1; i>=0; i--){
//                if(node.children.get(i) != null) stack.push(node.children.get(i));
//            }
//        }
//        return list;
	}

	public void getOrder(List<Integer> list, Node node) {
		if (node == null)
			return;

		List<Node> children = node.children;
		list.add(node.val);
		for (int i = 0; i < children.size(); i++)
			getOrder(list, children.get(i));
	}
}
