// Efficient - Also O(n) but we dont' need a map in this
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0, currLen = 0, count = 0;
        for(int[] rect: rectangles) {
            currLen = Math.min(rect[0], rect[1]);
            if(currLen > maxLen) {
                maxLen = currLen;
                count = 1;
            } else if(currLen == maxLen) {
                count++;
            }
        }
        return count;
    }
}

// Brute force solution - O(n)
// class Solution {
//     public int countGoodRectangles(int[][] rectangles) {
//         int maxLen = 0, currLen = 0;
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i<rectangles.length; i++) {
//             currLen = Math.min(rectangles[i][0], rectangles[i][1]);
//             maxLen = Math.max(maxLen, currLen);
//             if(map.containsKey(currLen)) {
//                 map.put(currLen, map.get(currLen) + 1);
//             } else {
//                 map.put(currLen, 1);
//             }
//         }
//         return map.get(maxLen);
//     }
// }