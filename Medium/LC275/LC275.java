/**
 * Leetcode #275 - https://leetcode.com/problems/h-index-ii/
 * 
 * @author ketanmalik June 18 2020
 */

class LC275 {
	public static void main(String[] args) {
		int[] citations = { 1, 1, 1, 1, 3, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10 };
		System.out.println(hIndex(citations));
	}

	public static int hIndex(int[] citations) {
		if (citations.length == 0)
			return 0;
		int n = citations.length;
		int m = n / 2;
		int h = n - m;
		while (citations[m] >= h && m > 0) {
			m--;
			h++;
		}
		while (citations[m] < h && m < n - 1) {
			m++;
			h--;
		}
		if (citations[m] == 0)
			return 0;
		return h;
	}

	// Binary Search - O(logn)
//	public int hIndex(int[] citations) {
//        int len = citations.length;
//        int high = len-1;
//        int low = 0;
//        
//        while(low<=high){
//            int mid = (low+high)/2;
//            
//            if(citations[mid]==len-mid)
//                return len-mid;
//            if(citations[mid]<len-mid)
//                low = mid+1;
//            else
//                high = mid-1;
//        }
//        
//        return len-low;
//    }
}