public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 +str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0,gcd(str1.length(),str2.length()));
    }


    public int gcd(int a , int b){

        while (b!=0) {
            int temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.gcdOfStrings("ABCABCABC", "ABCA");
        System.out.println(s);
    }
}
