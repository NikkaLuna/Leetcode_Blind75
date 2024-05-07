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
