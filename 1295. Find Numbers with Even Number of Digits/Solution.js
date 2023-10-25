// /**
//  * @param {number[]} nums
//  * @return {number}
//  */

const findNumbers = function(nums) {
  let count = 0;
  for (let num of nums) {
    if (even(num)) {
      count++;
    }
  }
  console.log(count);
  return count;
};

const sohel = [123,2222,34,50,47]
console.log(findNumbers(sohel));

function even(num) {
  const variable = digit(num);
  return variable % 2 === 0;
}

function digit(num) {
  let count = 0;
  if (num === 0) {
    return 1;
  }
  while (num > 0) {
    count++;
    num = Math.floor(num / 10);
  }
  return count;
}
