/*
 * Leetcode #1309 Problem Link - https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 *
 * @author ketanmalik
 * May 27 2020
 *
 * */

var freqAlphabets = function (s) {
  var res = "",
    len = s.length;
  for (var i = 0; i < len; i++) {
    let num = 0;
    if (i < len - 2 && s[i + 2] === "#") {
      num = parseInt(s[i].concat(s[i + 1]));
      i += 2;
    } else {
      num = parseInt(s[i]);
    }
    res = res.concat(String.fromCharCode(96 + num));
  }
  return res;
};

console.log(freqAlphabets("10#12#11#"));
