
// Runtime - 0ms
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] record = new int[101];
        int res = 0;
        
        for(int i: nums) {
            record[i]++;
        }
        
        for(int i=1; i<101; i++) {
            if(record[i] == 1) res += i;
        }
        
        return res;
    }
}

// Runtime - 1ms
// class Solution {
//     public int sumOfUnique(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int res = 0;
//         for(int i: nums) {
//             if(map.get(i) != null) {
//                 map.put(i, map.get(i) + 1);
//             } else {
//                 map.put(i, 1);
//             }
//         }
        
//         for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
//             if(entry.getValue() == 1) {
//                 res += entry.getKey();
//             }
//         }
//         return res;
//     }
// }