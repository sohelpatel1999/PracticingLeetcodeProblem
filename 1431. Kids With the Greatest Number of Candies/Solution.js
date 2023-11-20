var kidsWithCandies = function (candies, extraCandies) {
  high = candies[0];
  result = [];

  for (let i = 0; i < candies.length; i++) {
    if (candies[i] > high) {
      high = candies[i];
    }
  }
  for (let i = 0; i < candies.length; i++) {
    result.push(candies[i] + extraCandies >= high);
  }
  return result;
};

candies = [2, 3, 5, 1, 3];
extraCandies = 3;

const answer = kidsWithCandies(candies, extraCandies);
console.log(answer);
