public class Solution {
    //
    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;

        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = { 10, 9, 8, 4, 5 };
        Solution solution = new Solution();
        boolean answer = solution.increasingTriplet(nums);
        System.out.println(answer);
    }
}
