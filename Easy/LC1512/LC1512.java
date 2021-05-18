class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        if(nums.length == 0) return res;
        
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            if(count.containsKey(n)) {
                int currCount = count.get(n);
                res += currCount;
                count.put(n, ++currCount);
            } else {
                count.put(n, 1);
            }
        }
        
        // Brute Force - O(n)
        // for(int i=0; i<nums.length; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[i] == nums[j]) res++;
        //     }
        // }
        return res;
    }
}