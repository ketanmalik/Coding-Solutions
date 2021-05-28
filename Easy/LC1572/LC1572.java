class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, i = 0, j = mat.length - 1;
        for(; i<mat.length; i++) {
            sum += mat[i][i];
            if(j != i) {
                sum += mat[i][j];
            }
            j--;
        }
        return sum;
    }
}