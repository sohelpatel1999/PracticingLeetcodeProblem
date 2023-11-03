// Define a class named Solution
public class Solution {
    // Method to find a peak element in the input array
    public int findPeakElement(int[] nums) {
        // Initialize count with the first element of the array
        int count = nums[0];
        // Initialize max to store the index of the peak element, initially set to 0
        int max = 0;

        // Iterate through the input array
        for (int i = 0; i < nums.length; i++) {
            // Compare current element with count
            if (nums[i] > count) {
                // If current element is greater than count, update count and max
                count = nums[i];
                max = i; // Update max to the index of the current element
            }
        }
        // Return the index of the peak element in the array
        return max;
    }

    // Main method for testing the findPeakElement method
    public static void main(String[] args) {
        // Example input array
        int[] array = {1,2,1,3,5,6,4}; 
        // Create an instance of Solution class
        Solution solution = new Solution();
        // Call findPeakElement method with the example array and store the result in answer
        int answer = solution.findPeakElement(array);

        // Print the index of the peak element to the console
        System.out.println(answer);
    }
}
