class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idxToCheck;
        if(ruleKey.equals("type")) {
            idxToCheck = 0;
        } else if (ruleKey.equals("color")) {
            idxToCheck = 1;
        } else {
            idxToCheck = 2;
        }
        
        int res = 0;
        for(List<String> item : items) {
            if(item.get(idxToCheck).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }
}