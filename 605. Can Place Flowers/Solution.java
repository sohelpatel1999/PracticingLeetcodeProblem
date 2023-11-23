public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;

                if (prev == 0 && next == 0) {

                    count++;
                    flowerbed[i] = 1;
                    System.out.println(i + " " + count);
                }
            }
            if (count >= n) {
                return true;
            }
        }
        return false;

    }
//
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = { 1, 0, 0, 0, 1 };
        int n = 1;
        boolean answer = solution.canPlaceFlowers(arr, n);
        System.out.println(answer);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
