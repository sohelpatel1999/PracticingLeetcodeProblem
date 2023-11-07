public class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        String ans = s.valueOf(ch);
        return ans;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.toLowerCase("sohElASDF");
        System.out.println(answer);
    }
}
