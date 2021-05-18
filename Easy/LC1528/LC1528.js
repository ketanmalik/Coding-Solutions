/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
const restoreString = (s, indices) => {
    const len = s.length;
    if(len <= 1) return s;
    let idx = 0;
    let arr = [];
    for(let c of s) {
        arr[indices[idx++]] = c;
    }
    return arr.join('');
};