class Solution {
    public int maxDepth(String s) {
        if(s.length() <= 1) return 0;
        int currDepth = 0;
        int maxDepth = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                currDepth += 1;
                maxDepth = Math.max(maxDepth, currDepth);
            } else if (s.charAt(i) == ')') {
                currDepth--;
            }
        }
        return maxDepth;
    }
}