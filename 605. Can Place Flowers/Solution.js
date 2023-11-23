var canPlaceFlowers = function (flowerbed, n) {
  count = 0;
  for (let i = 0; i < flowerbed.length; i++) {
    if (flowerbed[i] === 0) {
      prev = i === 0 || flowerbed[i - 1] === 0 ? 0 : 1;
      next = i === flowerbed.length - 1 || flowerbed[i + 1] === 0 ? 0 : 1;

      if (next === 0 && prev === 0) {
        count++;
        flowerbed[i] = 1;
      }
    }
    if (count >= n) {
      return true;
    }
  }
  return false;
};

arr = [1, 0, 1, 0, 1];
const answer = canPlaceFlowers(arr, 1);
console.log(answer);
console.log(arr);
