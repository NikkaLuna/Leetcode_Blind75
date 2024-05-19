# 334. Increasing Triplet Subsequence

## Problem Description
Given an integer array `nums`, return `true` if there exists a triple of indices (i, j, k) such that i < j < k and `nums[i] < nums[j] < nums[k]`. If no such indices exist, return `false`.

### Examples
Example 1:
Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.

## Approach
1. **Initialize Variables**: Initialize 'min' and 'secondMin' variables to hold the largest and second largest values in the 'nums' array.
2. **Iterate Through Array**: Iterate through the 'nums' array.
3. **Update Minimums**: For each number, update 'min' if the number is smaller than or equal to the current 'min'.
4. **Update Second Minimum**: If the number is not less than or equal to 'min' but is less than or equal to 'secondMin', update 'secondMin'.
5. **Return True**: If the number is greater than both 'min' and 'secondMin', return true.
6. **Return False**: If no increasing triplet is found, return false.

## Time Complexity
- O(n): where 'n' is the size of the 'nums' array because we are iterating through the array once.

## Space Complexity
- O(1): Only uses a constant amount of extra space regardless of the size of the input array. The solution only requires a few integer variables (`min` and `secondMin`) to store the smallest and second smallest elements seen so far. These variables do not grow with the size of the input array, so the space complexity is constant.
