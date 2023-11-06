public class Solution {

    public int mySqrt(int x) {

        if(x==0){
            return 0;
        }
        int i = 1;
        for(;i<=x/i;i++)
            if (x/i==i) {
                return i;
            }
            return i-1;
        
        
    }
    

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(49));
        
    }
}
