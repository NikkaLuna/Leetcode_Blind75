# 283. Move Zeroes

## Problem Description
Given an integer array `nums`, move all 0's to the end of it while maintaining the relative order of the non-zero elements. You must do this in-place without making a copy of the array.

### Example
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Input: nums = [0]
Output: [0]

## Approach
- Use two pointers `i` and `j` to traverse the array.
- Initialize `i` to 0.
- Iterate through the array with pointer `j`.
- If `nums[j]` is not equal to 0, swap `nums[i]` and `nums[j]`, then increment `i`.
- This approach maintains the relative order of non-zero elements while moving zeroes to the end of the array.

## Time Complexity
- The time complexity is O(n), where n is the length of the input array `nums`. We traverse the array once.

## Space Complexity
- The space complexity is O(1) since we perform the operations in-place without using extra space.
