class Solution {
    public int longestOnes(int[] nums, int k) {

       int answer =0 ;
       int i = 0;
       int j = 0;
       int count = 0;
    
       while (j < nums.length) {

        if (nums[j] == 0){
            count++;

            if (count > k ){

                while (nums[i]!= 0) {
                    i++;
                }

                i++;
                count--;
            }
        }
        answer = Math.max(answer,j-i +1 );
        j++;
        
       } 
       return answer;
    }
}

class Solution {
    public int longestOnes(int[] nums, int k) {

       // Initialize variables  
       int answer = 0; // Stores the length of the longest subarray with consecutive 1's
       int i = 0; // Pointer for the start of the current subarray
       int j = 0; // Pointer for the end of the current subarray
       int count = 0; // Counts the number of 0's encountered within the current subarray

       // Iterate through the array nums
       while (j < nums.length) {

            // If the current element is 0, increment the count
            if (nums[j] == 0) {
                count++;

                // If the count exceeds the allowed flips k, adjust the window
                if (count > k) {

                    // Move the start pointer i to the right until it reaches the first 0 in the window
                    while (nums[i] != 0) {
                        i++;
                    }
                    i++; // Move i one position further to exclude the first 0 from the window
                    count--; // Decrement the count as we exclude one 0 from the window
                }
            }
            // Update the answer with the maximum length of consecutive 1's found so far
            answer = Math.max(answer, j - i + 1);

            j++; // Move the end pointer j to the right to consider the next element
       } 
       // Return the maximum length of consecutive 1's found
       return answer;
    }
}
