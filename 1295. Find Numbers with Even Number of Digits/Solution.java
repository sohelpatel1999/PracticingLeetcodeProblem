public class Solution {
    // Given an array nums of integers,
    // return how many of them contain an even number of digits.
    

    int count = 0;

    public int findNumbers(int[] nums) {

        for (int i : nums) {
            if (isEven(i)) {
                System.out.println(isEven(i));
                count++;
            }
        }

        return count;
    }

    private boolean isEven(int i) {
        int num = digit(i);
        return num % 2 == 0;
    }

    public int digit(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;

        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 12, 345, 23, 0, 7896 }; // Answer should be 2
        int ans = s.findNumbers(nums);
        System.out.println(ans);
    }

}
