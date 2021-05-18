class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        res[1] = first ^ encoded[0];
        for(int i=1; i<encoded.length; i++) {
            res[i+1] = res[i] ^ encoded[i];
        }
        return res;
    }
}