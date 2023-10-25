const number = [
  [1, 2, 3],
  [2, 3, 4],
];


console.log(maximumWealth(number));
function maximumWealth(num){
  let count = 0;
  for (let index = 0; index < num.length; index++) {
    sum = 0;
    for (let j = 0; j < num[index].length; j++) {
      sum = sum + num[index][j];
    }
    if (count < sum) {
      count = sum;
    }
  }
  return count;
};
