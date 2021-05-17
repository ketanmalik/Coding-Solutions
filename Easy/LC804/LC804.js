/*
 * Leetcode #804 Problem Link - https://leetcode.com/problems/unique-morse-code-words/submissions/
 *
 * @author ketanmalik
 * May 27 2020
 * */

var uniqueMorseRepresentations = function (words) {
  let codes = {
    a: ".-",
    b: "-...",
    c: "-.-.",
    d: "-..",
    e: ".",
    f: "..-.",
    g: "--.",
    h: "....",
    i: "..",
    j: ".---",
    k: "-.-",
    l: ".-..",
    m: "--",
    n: "-.",
    o: "---",
    p: ".--.",
    q: "--.-",
    r: ".-.",
    s: "...",
    t: "-",
    u: "..-",
    v: "...-",
    w: ".--",
    x: "-..-",
    y: "-.--",
    z: "--..",
  };

  return new Set(
    words.map((word) =>
      word
        .split("")
        .map((letter) => codes[letter])
        .join("")
    )
  ).size;

  // Brute-Force Approach
  //   let res = {},
  //     str = "";
  //   let codes = {
  //     a: ".-",
  //     b: "-...",
  //     c: "-.-.",
  //     d: "-..",
  //     e: ".",
  //     f: "..-.",
  //     g: "--.",
  //     h: "....",
  //     i: "..",
  //     j: ".---",
  //     k: "-.-",
  //     l: ".-..",
  //     m: "--",
  //     n: "-.",
  //     o: "---",
  //     p: ".--.",
  //     q: "--.-",
  //     r: ".-.",
  //     s: "...",
  //     t: "-",
  //     u: "..-",
  //     v: "...-",
  //     w: ".--",
  //     x: "-..-",
  //     y: "-.--",
  //     z: "--..",
  //   };
  //   for (var i = 0; i < words.length; i++) {
  //     for (var c in words[i]) {
  //       str = str.concat(codes[words[i][c]]);
  //     }
  //     res[str] = 1;
  //     str = "";
  //   }
  //   return Object.keys(res).length;
};

console.log(uniqueMorseRepresentations(["gin", "zen", "gig", "msg"]));
