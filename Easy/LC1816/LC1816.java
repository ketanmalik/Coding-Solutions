class Solution {
    // 0ms
    public String truncateSentence(String s, int k) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') count++;
            if(count == k) {
                return s.substring(0, i);
            }
        }
        return s;
    }

    // 1ms
    // public String truncateSentence(String s, int k) {
    //     String[] words = s.split(" ");
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0; i<k; i++) {
    //         sb.append(words[i]);
    //         sb.append(" ");
    //     }
    //     return sb.toString().substring(0, sb.length() - 1);
    // }
}