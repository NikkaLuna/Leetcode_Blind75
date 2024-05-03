public class Solution {

    public int longestSubarray(int[] nums) {

        int answer = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int indexLastZero = -1;
        
        while (j < nums.length) {        

            if (nums[j] == 0) {

                if (indexLastZero != -1) {               
                    i = indexLastZero+ 1;
                }            

                indexLastZero = j;                
            }

            answer = Math.max(answer, j - i);
            j++;
            
        }        
        return answer;
    }
}


public class Solution {
    public int longestSubarray(int[] nums) {

        // Initialize the maximum length of subarray with 0's flipped to 1

        int answer = Integer.MIN_VALUE; // Initialize two pointers for the start and end of the current subarray
        int i = 0; // Start pointer
        int j = 0; // End pointer
        int indexLastZero = -1; // Initialize the index of the last encountered zero
        
        // Iterate through the array
        while (j < nums.length) {        

            // If the current element is 0
            if (nums[j] == 0) {

                // If it's not the first zero encountered
                if (indexLastZero != -1) {               

                    // Move the start pointer i to the right of the last encountered zero
                    i = indexLastZero + 1;
                }            
                // Update the index of the last encountered zero
                indexLastZero = j;                
            }
            // Update the maximum length of subarray with 0's flipped to 1
            answer = Math.max(answer, j - i);

            // Move the end pointer to the next element
            j++;            
        }        
        return answer;
    }
}
