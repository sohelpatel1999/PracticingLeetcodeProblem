public class Solution {
    public void reverseString(String[] s) {
        int first = 0;
        int last = s.length - 1;
        while (first < last) {
            String temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s = { "h", "e", "l", "l", "o" };
        solution.reverseString(s);

        for (String string : s) {
            System.out.print(string + " ");
        }
    }
}
