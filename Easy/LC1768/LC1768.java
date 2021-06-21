class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int len = word1.length();
        if(word2.length() < len) len = word2.length();
        
        for(int i=0; i<len; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        
        if(word1.length() != word2.length()) {
            if(word1.length() > word2.length()) {
                
                for(int i=len; i<word1.length(); i++) {
                    res.append(word1.charAt(i));
                }
            } else {
                for(int i=len; i<word2.length(); i++) {
                    res.append(word2.charAt(i));
                }
            }   
        }
        
        return res.toString();
    }
}