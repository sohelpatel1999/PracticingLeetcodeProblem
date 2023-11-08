public class Solution {

    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (j == 0 && chars.length > 2) {
                    chars[j] = Character.toUpperCase(chars[j]);
                } else {
                    chars[j] = Character.toLowerCase(chars[j]);
                }
            }
            words[i] = new String(chars);
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String sohel = solution.capitalizeTitle("this is the sohel FROM BHARATNXT");

        System.out.println(sohel);
    }
}
