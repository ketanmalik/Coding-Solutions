class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for(String word: words) {
        	int idx = (int) word.charAt(word.length() - 1) - '0';
            // int idx = Integer.parseInt(word.substring(word.length() - 1) + "");
            res[idx - 1] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", res);
    }
}