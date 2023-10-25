public class Solution {

    public int search(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            if (target == nums[i]) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,3,4,0,1};
        int target = 13;
        System.out.println(solution.search(nums, target));
    }
    
}
