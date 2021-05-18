class Solution {
    public String restoreString(String s, int[] indices) {
        int len = s.length();
        if (len == 1) return s;
        char[] arr = new char[len];
        for(int i=0; i<len; i++) {
            char c = s.charAt(i);
            arr[indices[i]] = c;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
}