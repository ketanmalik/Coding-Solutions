/**
 * Leetcode #342 - https://leetcode.com/problems/power-of-four/
 * 
 * @author ketanmalik
 * Aug 4 2020
 * */


public class LC342 {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(5));

	}
	
    public static boolean isPowerOfFour(int num) {
        if(num <= 0) return false;
        int power = (int) (Math.log(num) / Math.log(4));
        return (num == Math.pow(4, power));
    }

    
//    public boolean isPowerOfFour(int num) {
//        if(num <= 0) return false;
//        if(num == 1) return true;
//        
//        while(num > 1){
//            if(num % 4 != 0) return false;
//            num /= 4;
//        }
//        return true;
//    }
}
