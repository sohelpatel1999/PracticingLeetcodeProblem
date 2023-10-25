/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {

    for (let i = 0; i < nums.length -1 ; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (target === (nums[i]+nums[j])) {
               return [i,j]
            }
        }
        
    }
return null;

}

nums = [4,5,6,7,0,1,2];
target = 3;
console.log(search(nums,target));