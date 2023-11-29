public class Solution {

    public boolean judgeCircle(String moves) {
        int l = 0;
        int u = 0;
        char[] ch = moves.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'L') {
                l++;

            } else if (ch[i] == 'R') {
                l--;

            } else if (ch[i] == 'U') {

                u++;
            } else {
                u--;
            }
        }
        return l == 0 && u == 0;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean answer = solution.judgeCircle("UUDRD");
        System.out.println(answer);
    }
}
