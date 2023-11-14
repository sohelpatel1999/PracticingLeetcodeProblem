var mergeAlternately = function (word1, word2) {
  let result = "";
  num = Math.max(word1.length, word2.length);
  for (let i = 0; i < num; i++) {
    if (i < word1.length) {
      result += word1[i];
    }
    if (i < word2.length) {
      result += word2[i];
    }
  }
  return result;
};
word1 = "abhbnc";
word2 = "pgqr";
const answer = mergeAlternately(word1,word2);
console.log(answer);
