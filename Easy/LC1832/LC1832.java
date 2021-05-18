class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<letters.length(); i++) {
            if(sentence.indexOf(letters.charAt(i)) == -1) return false;
        }
        return true;

        //Brute Force Solution
        // Map<Character, Integer> map = new HashMap<>();
        //  for(int i=0; i<sentence.length(); i++) {
        //      if(!map.containsKey(sentence.charAt(i))) {
        //          map.put(sentence.charAt(i), 1);
        //      }
        //  }
        //  return map.size() == 26;
    }
}