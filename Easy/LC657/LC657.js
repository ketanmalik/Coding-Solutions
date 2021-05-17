/**
 * Leetcode #657 Problem Link -
 * https://leetcode.com/problems/robot-return-to-origin/
 *
 * @author ketanmalik June 2 2020
 */

var judgeCircle = function (moves) {
  const checkMoveLength = (char) => {
    return moves.replace(new RegExp(char, "g"), "").length;
  };
  return (
    checkMoveLength("U") === checkMoveLength("D") &&
    checkMoveLength("L") === checkMoveLength("R")
  );
};

console.log(judgeCircle("UDLRDUL"));
