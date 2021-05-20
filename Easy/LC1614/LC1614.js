/**
 * @param {string} s
 * @return {number}
 */
const maxDepth = s => {
    let maxDepth = 0;
    s.split('').reduce((acc, curr) => {
        if(curr === '(') {
            acc++;
            maxDepth = Math.max(maxDepth, acc);
        } else if(curr === ')') acc--;
        return acc;
    }, 0);
    return maxDepth;
};

const maxDepth = s => {
    let maxDepth = 0;
    let currDepth = 0;
    for(let c of s) {
        if(c === '(') {
            currDepth++;
            maxDepth = Math.max(maxDepth, currDepth);
        } else if(c === ')') currDepth--;
    }
    return maxDepth;
};