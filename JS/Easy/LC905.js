/*
 * Steps:
 * 	  1. Iterate from the left and stop at the index where first odd number is found
 * 	  2. Iterate from the right and stop at the index where first even number is found
 * 	  3. If left-starting-index is still less than right-starting-index then we swap the two numbers found above
 * 	  4. Continue this till left-starting-index becomes >= right-starting-index
 *
 * Variables:
 * 	  left = Starting index from left - initially 0
 * 	  right = Starting index from right - initially last index of the input array
 * 	  l = first odd number starting from left
 * 	  r = first even number starting from right
 *
 * @author ketanmalik
 * May 29 2020
 * */

var sortArrayByParity = function (A) {
  var left = 0,
    right = A.length - 1,
    l = 0,
    r = 0;
  while (left < right) {
    while (left < A.length) {
      if (A[left] % 2 !== 0) {
        l = A[left];
        break;
      }
      left++;
    }
    while (right >= 0) {
      if (A[right] % 2 === 0) {
        r = A[right];
        break;
      }
      right--;
    }
    if (left >= right) return A;
    A[left] = r;
    A[right] = l;
  }
  return A;
};

console.log(
  sortArrayByParity([1, 3, 4, 3, 1, 3, 4, 5, 67, 8, 32, 54, 3, 4, 5, 67, 2, 2])
);
