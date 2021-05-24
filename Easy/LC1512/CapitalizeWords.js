function capitalizeWords (words) {
  // add whatever parameters you deem necessary - good luck!
  let newWords = [];
  if(words.length === 0) return newWords;
  console.log(words);
  newWords.push(words[0].toUpperCase());
  
  return [...newWords, ...capitalizeWords(words.slice(1))];
}

// let words = ['i', 'am', 'learning', 'recursion'];
// capitalizedWords(words); // ['I', 'AM', 'LEARNING', 'RECURSION']