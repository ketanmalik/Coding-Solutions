const swapStr = (s1, s2) => {
    return [s2, s1];
}

let s1 = 'abc';
let s2 = 'def';
[s1, s2] = swapStr(s1, s2);
console.log(s1, s2);