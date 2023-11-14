public class Solution {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int num = Math.max(word1.length(), word2.length());
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abdfdfdfc";
        String word2 = "pqrsgf";
        Solution solution = new Solution();
        String answer = solution.mergeAlternately(word1, word2);
        System.out.println(answer);
    }

}