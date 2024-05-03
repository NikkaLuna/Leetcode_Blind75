

public class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        int i = 0;
        int j = n - 1; 
        int count = 0;
        
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;

            } else if (nums[i] + nums[j] > k) {
                j--;
                
            } else {
                i++;
            }
        }
        
        return count;
    }
}


public class Solution {

    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store the elements of the input array
        Map<Integer, Integer> map = new HashMap<>();

        // Initialize an integer array to store the indices of the two numbers
        int[] answer = new int[2];

        // Iterate over each element of the nums array
        for (int i = 0; i < nums.length; i++) {

            // Check if the map contains a key equal to the difference between the target and the current element
            if (map.containsKey(target - nums[i])) {

                // If such a key exists, assign the index of the complementary element to the first element of the answer array
                answer[0] = map.get(target - nums[i]);

                // Assign the current index to the second element of the answer array
                answer[1] = i;

                // Return the answer array
                return answer;
            } else {
                // If the complementary element is not found, put the current element and its index into the map
                map.put(nums[i], i);
            }
        }
        
        // Return the answer array
        return answer;
    }
}
