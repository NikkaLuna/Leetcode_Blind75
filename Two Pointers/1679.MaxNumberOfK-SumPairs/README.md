# 1679. Max Number of K-Sum Pairs

## Problem Description
You are given an integer array `nums` and an integer `k`. In one operation, you can pick two numbers from the array whose sum equals `k` and remove them from the array. Return the maximum number of operations you can perform on the array.

### Example
Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:

Remove numbers 1 and 4, then nums = [2,3]
Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.

## Approach
- Sort the array `nums`.
- Use two pointers `i` and `j`, initialized to the start and end of the array respectively.
- Iterate through the array:
  - If `nums[i] + nums[j] == k`, increment the count of operations and move both pointers towards the center.
  - If `nums[i] + nums[j] > k`, decrement `j`.
  - If `nums[i] + nums[j] < k`, increment `i`.
- Continue this process until `i` is less than `j`.
- Return the count of operations.

## Time Complexity
- The time complexity is O(n log n) due to sorting, where n is the length of the input array `nums`. The sorting dominates the complexity.

## Space Complexity
- The space complexity is O(1) since we perform the operations in-place without using extra space.
