class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        if(arr.length == 1) return arr[0];
        if(arr.length == 2) return arr[0] + arr[1];
        
        int sum = 0;
        int offset = 3;
        int len = arr.length;
        int temp = 1;
        
        for(int num : arr) {
            sum += num;
        }
        
        while(offset <= len) {
            for(int i = 0; i <= len - offset; i++) {
                sum += arr[i];
                temp = 1;
                while (temp < offset) {
                    sum += arr[i + temp++];
                }
            }
            offset += 2;
        }
        
        return sum;
    }
}

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        if(arr.length == 1) return arr[0];
        if(arr.length == 2) return arr[0] + arr[1];
        
        int sum = 0;
        int num = 1;
        
        while(num <= arr.length) {
            sum += recSubArraySum(arr, num);
            num += 2;
        };
        return sum;
    }
    
    public int recSubArraySum(int[] arr, int num) {
        int sum = 0, i = 0;
        int total = 0;
        while(i < num) {
            sum += arr[i++];
        }
        total = sum;
        
        for(i = num; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - num];
            total += sum;
        }
        return total;
    }
}