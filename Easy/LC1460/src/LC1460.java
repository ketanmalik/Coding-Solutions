class LC1460 {
	public static void main(String[] args) {
		System.out.println(canBeEqual(new int[] { 718, 745, 231, 697 }, new int[] { 697, 718, 231, 745 }));
	}

	public static boolean canBeEqual(int[] target, int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			j = i;
			while (arr[j] != target[i]) {
				j++;
				if (j == arr.length)
					return false;
			}

			if (j - i > 1)
				reverse(arr, i, j);
			else if (j - i == 1) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		return true;
	}

	public static void reverse(int[] arr, int i, int j) {
		int[] temp = new int[j - i + 1];
		int y = 0;
		for (int x = j; x >= i; x--)
			temp[y++] = arr[x];
		y = 0;
		for (int x = i; x <= j; x++)
			arr[x] = temp[y++];
	}
}