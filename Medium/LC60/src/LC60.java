import java.util.ArrayList;
import java.util.List;

class LC60 {

	public static void main(String[] args) {
		System.out.println(getPermutation(4, 23));
	}

	public static String getPermutation(int n, int k) {
		StringBuilder sb = new StringBuilder();

		int[] fact = new int[n];
		fact[0] = 1;
		for (int i = 1; i < n; i++)
			fact[i] = i * fact[i - 1];

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++)
			list.add(i);

		int x = fact[n - 1], index = 0;

		int count = n;
		for (int i = 0; i < count; i++) {
			while (true) {
				if (k - x <= 0)
					break;
				x += fact[n - 1];
				index++;
			}
			sb.append(list.get(index));
			list.remove(index);
			k = k - (x - fact[n - 1]);
			if (k == 0) {
				for (int j = 0; j < list.size(); j++)
					sb.append(list.get(j));
				return sb.toString();
			}
			n--;
			if (n == 0)
				break;
			x = fact[n - 1];
			index = 0;
		}
		return sb.toString();
	}
}