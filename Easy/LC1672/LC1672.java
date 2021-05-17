class Solution {
    public int maximumWealth(int[][] accounts) {
        
        // Brute Force Solution - Faster
        int rows = accounts.length;
        int cols = accounts[0].length;
        int maxWealth = 0;
        int currWealth = 0;
        
        for(int i=0; i<rows; i++) {
            currWealth = 0;
            for(int j=0; j<cols; j++) {
                currWealth += accounts[i][j];
            }
            if(currWealth > maxWealth) {
                maxWealth = currWealth;
            }
        }
        
        return maxWealth;

        // Java Stream solution - Slower
        // return Arrays.stream(accounts)
        //     .mapToInt(row -> Arrays.stream(row).sum())
        //     .max()
        //     .getAsInt();
    }
}