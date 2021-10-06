/* You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique */


const removeDuplicatesEfficient = (s) => {
    let res = [];
    for (let i = 0; i < s.length; i++) {
        if (res.length > 0 && res[res.length - 1] === s[i]) {
            res.pop();
        } else {
            res.push(s[i]);
        }
    }
    return res.join('');
}

const removeDuplicates = (s) => {
    while (1) {
        let repeat = false;
        let i = 0;
        for (i; i < s.length - 1; i++) {
            if (s[i] === s[i + 1]) {
                repeat = true;
                break;
            }
        }
        if (!repeat) break;
        else {
            s = s.slice(0, i) + s.slice(i + 2, s.length);
        }
    }
    return s;
}

console.log(removeDuplicatesEfficient('abcdab'));