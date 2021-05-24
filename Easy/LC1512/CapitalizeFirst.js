function capitalizeFirst (arr) {
  // add whatever parameters you deem necessary - good luck!
  let res = [];
  if(arr.length === 0) return res;
  
  let str = arr[0];
  
  res.push(str[0]
     .toUpperCase()
     .concat(str.substring(1, str.length)
     ));
  
  return [...res, ...capitalizeFirst(arr.slice(1))];
}

// capitalizeFirst(['car','taco','banana']); // ['Car','Taco','Banana']
