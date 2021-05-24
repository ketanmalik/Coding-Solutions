class Solution {
    // 1ms
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=1; i<sb.length(); i+=2) {
            sb.setCharAt(i, shift(sb.charAt(i-1), (int)(sb.charAt(i) - '0')));
        }
        return sb.toString();
    }

    // 3ms
    // public String replaceDigits(String s) {
    //     if(s.length() == 1) return s;
    //     char[] charArr = s.toCharArray();
    //     for(int i=1; i<charArr.length; i+=2) {
    //         int num = Integer.parseInt(charArr[i]+"");
    //         char newChar = shift(charArr[i-1], num);
    //         charArr[i] = newChar;
    //     }
    //     return new String(charArr);
    // }

    // 3ms
    // public String replaceDigits(String s) {
    //     if(s.length() == 1) return s;
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=1; i<s.length(); i+=2) {
    //         char prevChar = s.charAt(i - 1);
    //         int num = Integer.parseInt(s.charAt(i) + "");
    //         sb.append(prevChar);
    //         sb.append(shift(prevChar, num));
    //     }
    //     if(s.length() % 2 != 0) sb.append(s.charAt(s.length() - 1));
    //     return sb.toString();
    // }

    public char shift(char c, int i) {
        return (char)(c + i);
    }
}