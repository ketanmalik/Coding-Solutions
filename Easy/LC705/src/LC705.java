public class LC705 {

	public class Hash {
		int[] hash;

		Hash() {
			hash = new int[100];
		}

		public void add(int key) {
			if (key >= hash.length) {
				hash = newHash(hash, key);
			}
			hash[key] = 1;
		}

		public void remove(int key) {
			if (key < hash.length) {
				hash[key] = 0;
			}
		}

		public boolean contains(int key) {
			if (key >= hash.length)
				return false;
			return hash[key] == 1;
		}

		public int[] newHash(int[] temp, int len) {
			int[] arr = new int[len + 1];
			System.arraycopy(temp, 0, arr, 0, temp.length);
			return arr;
		}
	}

	public static void main(String[] args) {
		Hash hashSet = new LC705().new Hash();
		hashSet.add(1);
		hashSet.add(2);
		System.out.println(hashSet.contains(1));
		System.out.println(hashSet.contains(3));
		hashSet.add(2);
		System.out.println(hashSet.contains(2));
		hashSet.remove(2);
		System.out.println(hashSet.contains(2));
	}
}
