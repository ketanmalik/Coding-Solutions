/**
 * LC #344 Problem Link - https://leetcode.com/problems/reverse-string/
 *
 * @author ketanmalik
 * June 4 2020
 * */

// Array.reverse() is short but takes more time & space. Below 2-pointer approach is better

var reverseString = function (s) {
  let temp,
    first = 0,
    last = s.length - 1;
  while (first < last) {
    temp = s[first];
    s[first] = s[last];
    s[last] = temp;
    first++;
    last--;
  }
};

console.log(reverseString(["h", "e", "l", "l", "o"]));
