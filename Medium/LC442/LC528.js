/**
 * Leetcode #442 Problem Link - https://leetcode.com/problems/find-all-duplicates-in-an-array/
 *
 * @author ketanmalik
 * Oct 6 2021
 */

var findDuplicates = function(nums) {
    let res = [];
    
    for(let i = 0; i < nums.length; i++) {
        let idxToCheck = Math.abs(nums[i]) - 1;
        if(i > 0 && nums[idxToCheck] < 0) {
            res.push(idxToCheck + 1);
        } else {
            nums[idxToCheck] *= -1;
        }
    }
    
    return res;
};
