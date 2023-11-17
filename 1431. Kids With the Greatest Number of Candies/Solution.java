import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int high = candies[0];
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] > high) {
                high = candies[i];

            }

        }
        for (int i = 0; i < candies.length; i++) {

            result.add(candies[i] + extraCandies >= high);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 3 }; // Output: [true,true,true,false,true] 
        int extraCandies = 3;

        Solution solution = new Solution();
        List<Boolean> result = solution.kidsWithCandies(arr, extraCandies);
        System.out.println(result);

    }

}
