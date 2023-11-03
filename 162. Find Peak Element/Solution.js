var findPeakElement = function(nums) {
    let high = nums[0];
    let index = 0;
    for(i = 0 ; i<nums.length;i++){
        if(nums[i]>high){
            high = nums[i];
            index = i;
        }
    }
    return index;
};
//END
const array = [1,2,3,1]
const answer = findPeakElement(array);
console.log(answer);