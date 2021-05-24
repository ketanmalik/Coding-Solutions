class Solution {
    public int numberOfMatches(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        int matches = 0;
        if(n % 2 == 0) {
            n /= 2;
            matches = matches + n + numberOfMatches(n);
        } else {
            n = (n - 1) / 2;
            matches = matches + n + numberOfMatches(n + 1);
        }
        return matches;
    }

    // public int numberOfMatches(int n) {
    //     return recFunc(n, 0);   
    // }
    
    // private int recFunc(int n, int m) {
    //     if(n == 1) return 0;
    //     if(n == 2) return m + 1;
    //     if(n % 2 == 0) {
    //         m += n/2;
    //         return recFunc(n/2, m);
    //     } else {
    //         m += (n - 1) / 2;
    //         return recFunc(((n - 1) / 2) + 1, m);
    //     }
    // }
}