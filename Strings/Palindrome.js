/* Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases */

isPalindrome = (str) => {
    let regex = /[^a-z0-9]/ig;
    str = str.toLowerCase().replace(regex, '');
    let left = 0, right = str.length - 1;
    while(left < right) {
        if(str[left++] !== str[right--]) return false;
    }
    
    return true;
}

console.log(isPalindrome("A man, a plan, a canal: Panama"));

