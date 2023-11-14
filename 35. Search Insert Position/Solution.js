var searchInsert = function(nums, target) {

    a =0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === target) {
            a =i;
            break;
        } else if (nums[i]>target) {
            a=i;
            break;
        } else {
         a = nums.length;
        }
        
        
        
    }
    return a;

}

const answer = searchInsert([1,2,3,4,5,6,7,7],5);
console.log(answer);