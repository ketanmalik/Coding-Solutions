/**
 * Leetcode #237 Problem Link -
 * https://leetcode.com/problems/delete-node-in-a-linked-list
 * 
 * @author ketanmalik June 2 2020
 */

public class LC237 {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LC237 obj = new LC237();
		ListNode n1 = obj.new ListNode(4);
		ListNode n2 = obj.new ListNode(5);
		ListNode n3 = obj.new ListNode(1);
		ListNode n4 = obj.new ListNode(9);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		deleteNode(n3);

		ListNode node = n1;
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static void deleteNode(ListNode node) {

		// Efficient, O(1) approach
		node.val = node.next.val;
		node.next = node.next.next;

		// Brute-force approach, O(n)
//		while (true) {
//			node.val = node.next.val;
//			if (node.next.next == null) {
//				node.next = null;
//				return;
//			}
//			node = node.next;
//		}
	}
}
