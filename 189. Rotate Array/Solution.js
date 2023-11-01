/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
    k%=nums.length;
  const length = nums.length - 1;
  reversearray(nums, 0, length);
  reversearray(nums, 0, k-1);
  reversearray(nums, k, length);
};

function reversearray(nums, start, end) {
  let s = start;
  let e = end;
  while (s < e) {
    temp = nums[s];
    nums[s] = nums[e];
    nums[e] = temp;
    s++;
    e--;
  }
}

const array = [1, 2, 3, 4, 5, 6, 7];
// Output: [5,6,7,1,2,3,4]
k = 3;
rotate(array,k)
console.log(array);
