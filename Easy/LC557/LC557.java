class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int firstIndex, lastIndex;
        char temp;
        
        for(int i=0; i<len; i++) {
            firstIndex = i;
            while(++i < len && arr[i] != ' ');
            lastIndex = i - 1;
            
            while(firstIndex < lastIndex) {
                temp = arr[firstIndex];
                arr[firstIndex++] = arr[lastIndex];
                arr[lastIndex--] = temp;
            }
        }
        
        return new String(arr);
    }
}

class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] arr = s.split(" ");
        int len = arr.length;
        
        for(int i=0; i<len; i++) {
            for(int j=arr[i].length() - 1; j>=0; j--) {
                res.append(arr[i].charAt(j));
            }
            if(i != len - 1) {
              res.append(" ");  
            } 
        }
        
        return res.toString();
    }
}