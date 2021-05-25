/**
 * @param {string} s
 * @return {string}
 */
const sortSentence = (s) => {
    let res = [];
    for(let word of s.split(" ")) {
        let idx = word[word.length - 1] - 1;
        res[idx] = word.substring(0, word.length - 1);
    }
    return res.join(" ");
};