
public class LC520 {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("googlE"));
	}

	public static boolean detectCapitalUse(String word) {
		int caps = 0, x = 0;
		int len = word.length();
		for (int i = 0; i < word.length(); i++) {
			x = word.charAt(i);
			if (x < 97)
				caps++;
		}
		if (caps == 0 || caps == len)
			return true;
		x = word.charAt(0);
		if (caps == 1 && x < 97)
			return true;
		return false;
	}
}
