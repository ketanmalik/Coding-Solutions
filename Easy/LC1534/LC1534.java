class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;
        int n1, n2, n3;
        
        for(int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    n1 = Math.abs(arr[i] - arr[j]);
                    n2 = Math.abs(arr[j] - arr[k]);
                    n3 = Math.abs(arr[i] - arr[k]);
                    if(n1<=a && n2<=b && n3<=c) res++;
                }
            }
        }
        
        return res;
    }
}