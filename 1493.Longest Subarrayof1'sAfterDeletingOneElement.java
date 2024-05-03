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

