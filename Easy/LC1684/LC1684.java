class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] charArr = new boolean[26];
        for(int i=0; i<allowed.length(); i++) {
            char c = allowed.charAt(i);
            charArr[c - 'a'] = true;
        }
        int res = words.length;
        for(String word: words) {
            for(int j=0; j<word.length(); j++) {
                if(!charArr[word.charAt(j) - 'a']) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }

    // public int countConsistentStrings(String allowed, String[] words) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     for(int i=0; i<allowed.length(); i++) {
    //         map.put(allowed.charAt(i), 1);
    //     }
        
    //     String str;
    //     boolean containsChar;
    //     int res = 0;
    //     for(int i=0; i<words.length; i++) {
    //         str = words[i];
    //         containsChar = true;
    //         for(int j=0; j<str.length(); j++) {
    //             if(!map.containsKey(str.charAt(j))) {
    //                 containsChar = false;
    //                 break;
    //             }
    //         }
    //         if(containsChar) {
    //             res++;
    //         }
    //     }
        
    //     return res;
    // }
}