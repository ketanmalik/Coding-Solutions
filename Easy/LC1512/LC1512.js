/**
 * @param {number[]} nums
 * @return {number}
 */
const numIdenticalPairs = (nums) => {
    let res = 0;
    if(nums.length === 1) return res;
    let obj = {};
    for(const n of nums) {
        if(obj[n] > 0) {
            res += obj[n];
            ++obj[n];
        } else {
            obj[n] = 1;
        }
    }
    return res;
}