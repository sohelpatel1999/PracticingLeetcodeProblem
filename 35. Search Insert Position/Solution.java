public class Solution {
    
    public int searchInsert(int[] nums, int target) {
        int a =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                a = i;
                break;
            } else if (nums[i] > target) {
                a=i;
                break;
            }else{
                a =nums.length;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        Solution solution = new Solution();
        int answer = solution.searchInsert(num, 0);
        System.out.println(answer);
        
    }
}
