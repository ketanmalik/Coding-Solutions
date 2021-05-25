class Solution {
    public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        int half1 = 0, half2 = 0;
        for(int i=0; i<half; i++) {
            if(isVowel(s.charAt(i))) half1++;
            if(isVowel(s.charAt(half+i))) half2++;
        }
        return half1 == half2;
    }
    
    private boolean isVowel(char c) {
        switch(c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}