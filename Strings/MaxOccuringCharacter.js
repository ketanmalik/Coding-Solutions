/* Program for returning maximum 'n' occurring character in the input string (consider only alphanumberic characters & ignore case) */


const getMaxOccuringChar = (str, n) => {
    if (!n || n < 0) return 'Invalid';
    let obj = {};
    str = str.replace(/[^a-z0-9]/gi, '');
    for (let i = 0; i < str.length; i++) {
        if (!obj[str[i]]) obj[str[i]] = 0;
        obj[str[i]]++;
    }
    let maxCharArray = Object.entries(obj).sort((a, b) => b[1] - a[1]).slice(0, n);
    maxCharArray = maxCharArray.map(arr => arr[0]);
    return maxCharArray;
}

console.log(getMaxOccuringChar("This is a new string", 1));


