var capitalizeTitle = function (title) {
  var words = title.split(" ");
  //   console.log(words);

  for (let i = 0; i < words.length; i++) {
    var word = words[i];
    var newword = "";

    for (let j = 0; j < word.length; j++) {
      console.log(word[j]);
      if (j === 0 && word.length > 2) {
        newword += toUpperCase(word[j]);
      } else {
        newword += toLowerCase(word[j]);
      }
    }
    words[i] = newword;
    console.log(words);
  }
  var capitalizedTitle = words.join(" ");
  return capitalizedTitle;
};

function toUpperCase(char) {
  let word = char.charCodeAt(0);
  if (word >= 97 && word <= 122) {
    return String.fromCharCode(word - 32);
  }
  console.log(word);
  return char;
}

function toLowerCase(char) {
  let word = char.charCodeAt(0);
  if (word >= 65 && word <= 90) {
    return String.fromCharCode(word + 32);
  }
  console.log(word);

  return char;
}

console.log(
  capitalizeTitle("thIs Is sohEl FROM RESEARCH ALLIED IN THE FORM OF THE")
);
