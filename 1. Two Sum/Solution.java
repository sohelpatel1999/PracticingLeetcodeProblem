public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // int[] arraydemo = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int answer = nums[i] + nums[j];
                if (target == answer) {

                    // arraydemo[0] = i;
                    // arraydemo[1] = j;

                    return new int[]{i,j};
                }
            }

        }

        return null;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 13;
        int[] indices = solution.twoSum(nums, target);
    
    if (indices != null) {
        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
    } else {
        System.out.println("No solution found.");
    }      
    }
}
