public class Solution {

    public int subtractProductAndSum(int n) {
        int answer;
        int product = 1;
        int sum = 0;

        while (n>0) {
            int num = n%10;
            product=num*product;
            sum = sum + num;
            n = n/10;  
        }
        answer = product - sum;

        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.subtractProductAndSum(234);
        System.out.println(answer);
    }
    
}