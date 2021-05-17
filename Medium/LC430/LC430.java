/**
 * Leetcode #430 - https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 * 
 * @author ketanmalik
 * July 10 2020
 * */

class LC430 {
	class Node {
		public int val;
		public Node prev;
		public Node next;
		public Node child;
	};

	public Node flatten(Node head) {
		Node temp = head;
		Node prev = null;
		if (head == null)
			return null;
		while (head != null) {
			if (head.child != null) {
				Node pNext = head.next;
				Node lChild = getLastChild(head.child);

				head.next = head.child;
				head.child = null;
				lChild.next = pNext;
				if (pNext != null)
					pNext.prev = lChild;
			}
			head.prev = prev;
			prev = head;
			head = head.next;
		}
		return temp;
	}

	public Node getLastChild(Node node) {
		while (node.next != null) {
			if (node.child != null) {
				Node p = node.next;
				Node c = getLastChild(node.child);
				node.next = node.child;
				node.child = null;
				c.next = p;
				p.prev = c;
			}
			node = node.next;
		}
		return node;
	}
}