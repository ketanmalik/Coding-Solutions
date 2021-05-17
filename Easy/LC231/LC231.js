/**
 * Leetoce #231 - https://leetcode.com/problems/power-of-two/
 *
 * @author ketanmalik June 8 2020
 */

var isPowerOfTwo = function (n) {
  let i = 1;
  while (i < n) i *= 2;
  return i === n;

  // return n.toString(2).match("^10*$") != null;

  // if(n == 1) return true;
  // if(n <= 0 || (n % 2 !== 0)) return false;
  // while(n > 1){
  //     if(n % 2 !== 0) return false;
  //     n /= 2;
  // }
  // return true;
};

console.log(isPowerOfTwo(512));
