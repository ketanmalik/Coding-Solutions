
/**
 * Leetcode #1286 - https://leetcode.com/problems/iterator-for-combination/
 * 
 * @author ketanmalik
 * Aug 13 2020
 * */

import java.util.LinkedList;
import java.util.Queue;

class LC1286 {

	Queue<String> q;
	int len;
	char[] arr;

	public LC1286(String characters, int combinationLength) {
		q = new LinkedList<>();
		this.len = combinationLength;
		this.arr = characters.toCharArray();
		generateCombinations("", 0);
	}

	public static void main(String[] args) {
		LC1286 obj = new LC1286("abcd", 3);
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
	}

	public void generateCombinations(String str, int idx) {
		if (str.length() == len) {
			q.add(str);
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			generateCombinations(str + String.valueOf(arr[i]), i + 1);
		}
	}

	public String next() {
		return q.poll();
	}

	public boolean hasNext() {
		return !q.isEmpty();
	}
}