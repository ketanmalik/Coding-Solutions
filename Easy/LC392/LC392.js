/**
 * Leetcode #392 - https://leetcode.com/problems/is-subsequence/
 *
 * @author ketanmalik June 9 2020
 */

var isSubsequence = function (s, t) {
  let i = 0;
  return (
    s ===
    t
      .split("")
      .filter((elem) => s[i] === elem && ++i)
      .join("")
  );
};

console.log(isSubsequence("abab", "ajhiuerbiuruirereaiueruieubeiui"));
