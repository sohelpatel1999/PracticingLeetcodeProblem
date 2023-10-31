/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function (s) {
  let first = 0;
  let last = s.length - 1;

  while (first < last) {
    let temp = s[first];
    s[first] = s[last];
    s[last] = temp;
    first++;
    last--;
  }
};

arr = ["h", "e", "l", "l", "o"];
console.log(arr);
reverseString(arr);
console.log(arr);
