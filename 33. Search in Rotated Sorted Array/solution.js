
nums = [4,5,6,7,0,1,2];
target = 6;

var search = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        if (target === nums[i]) {
            return i;
        }
        
    }
    return -1;
}

console.log(search(nums,target));