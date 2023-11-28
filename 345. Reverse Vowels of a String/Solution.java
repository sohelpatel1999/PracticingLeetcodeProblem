public class Solution {

    public String reverseVowels(String s) {
        System.out.println(s);
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        String vowel = "aeiouAEIOU";
        while (start < end) {
            while (start < end && vowel.indexOf(ch[start]) == -1) {
                start++;
                System.out.println("Start " + ch[start]);
            }

            while (start < end && vowel.indexOf(ch[end]) == -1) {
                end--;
                System.out.println("End " + ch[end]);

            }

            char temp = ch[start];
            System.out.println("Temp " + temp);

            ch[start] = ch[end];
            System.out.println("Start " + ch[start]);

            ch[end] = temp;
            System.out.println("end " + ch[end]);

            start++;
            end--;

        }

        return new String(ch);
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = "qwrtyp"; // holle
        String answer = solution.reverseVowels(s);
        System.out.println(answer);

    }

}
