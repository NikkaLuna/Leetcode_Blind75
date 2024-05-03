
public class Solution {

    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            
            leftSum += nums[i];
        }
        
        return -1;
    }
}

public class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Calculate the total sum of all elements in the array
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;

        // Iterate through each index of the array
        for (int i = 0; i < nums.length; i++) {

            // Check if the sum of elements to the left equals the sum of elements to the right
            //We update leftSum regardless of whether the sum of elements to the left equals the sum of elements to the right
            if (leftSum == totalSum - leftSum - nums[i]) {

                // If so, return the current index as the pivot index
                return i;
            }
            // Update the sum of elements to the left
            leftSum += nums[i];
        }
        
        // If no pivot index is found, return -1
        return -1;
    }
}


