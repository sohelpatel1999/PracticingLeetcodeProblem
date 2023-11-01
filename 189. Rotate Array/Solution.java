public class Solution {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int length = nums.length - 1;
        reverseSpecificarray(nums, 0, length);
        reverseSpecificarray(nums, 0, k - 1);
        reverseSpecificarray(nums, k, length);
        

    }

    public void reverseSpecificarray(int[] arr, int start, int end) {
        int s = start;
        int e = end;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        // Output: [5,6,7,1,2,3,4]
        int k = 3;
        Solution solution = new Solution();
        solution.rotate(array, k);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
