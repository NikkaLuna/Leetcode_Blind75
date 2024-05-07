# 1004. Max Consecutive Ones III

## Problem Description
Given a binary array `nums` and an integer `k`, return the maximum number of consecutive 1's in the array if you can flip at most `k` 0's.

### Example
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


## Approach
1. **Initialize Variables:** Initialize variables `i` and `j` to track the start and end of the window and initialize `count` to keep track of the number of zeros in the current window. Initialize `answer` to store the length of the longest subarray found so far.
2. **Iterate Through the Array:** Iterate through the array `nums`. At each iteration, update `count` and adjust the window based on the number of zeros encountered.
3. **Update Maximum Length:** Inside the loop, update `answer` with the maximum length of the subarray found so far `(j - i + 1)`, ensuring it captures the longest subarray with at most `k` zeros.
4. **Return Result:** Return `answer` as the result.

## Time Complexity
The time complexity of the provided solution is O(n), where n is the length of the input array `nums`. This is because the algorithm iterates through the array once using the sliding window technique, and the operations inside the loop are constant time.

## Space Complexity
The space complexity is O(1) because it uses only a constant amount of extra space regardless of the size of the input array.



