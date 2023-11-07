var toLowerCase = function (s) {
  var ch = s.split("");

  for (let i = 0; i < ch.length; i++) {
    if (ch[i].charCodeAt(0) >= 65 && ch[i].charCodeAt(0) <= 90) {
        console.log(ch[i].charCodeAt(0));
        ch[i] = (String.fromCharCode(ch[i].charCodeAt(0) + 32));
    }
  }
  console.log(ch);
  return ch.join("");
};

const ans = toLowerCase("SohelVASDF");
console.log(ans);
