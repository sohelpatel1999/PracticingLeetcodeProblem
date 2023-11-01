public class Solution {
    public int findPeakElement(int[] nums) {
        int count = nums[0];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > count) {
                count = nums[i];
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,2,1,3,5,6,4}; //5
        Solution solution = new Solution();
        int answer = solution.findPeakElement(array);

        System.out.println(answer);
    }
}
