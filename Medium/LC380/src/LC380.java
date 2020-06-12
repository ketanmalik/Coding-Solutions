
/**
 * Leetcode #380 Problem Link - https://leetcode.com/problems/insert-delete-getrandom-o1/
 * 
 * @author ketanmalik
 * June 12 2020
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class LC380 {

	/** Initialize your data structure here. */
	List<Integer> list;
	Map<Integer, Integer> map;
	Random r;
	int indexToRemove;
	int keyToUpdate;

	public LC380() {
		list = new ArrayList<>();
		map = new HashMap<>();
		r = new Random();
		indexToRemove = 0;
		keyToUpdate = 0;
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		if (map.containsKey(val))
			return false;
		list.add(val);
		map.put(val, list.size() - 1);
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		if (!map.containsKey(val))
			return false;
		indexToRemove = map.get(val);
		keyToUpdate = list.get(list.size() - 1);
		list.set(indexToRemove, keyToUpdate);
		list.remove(list.size() - 1);
		map.put(keyToUpdate, indexToRemove);
		map.remove(val);
		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		return list.get(r.nextInt(list.size()));
	}
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet(); boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val); int param_3 = obj.getRandom();
 */