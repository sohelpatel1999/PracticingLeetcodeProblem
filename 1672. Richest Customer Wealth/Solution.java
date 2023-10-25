public class Solution {

    public static int maximumWealth(int[][] accounts) {
        int answer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];

            }
            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 1, 3, 4 } };
        System.out.println(maximumWealth(accounts));
    }
}