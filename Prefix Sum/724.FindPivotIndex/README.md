# 724. Find Pivot Index

## Problem Statement
Given an array of integers `nums`, the task is to calculate the pivot index of this array. The pivot index is defined as the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the right of the index. If the index is on the left edge of the array, the left sum is `0` because there are no elements to the left. This also applies to the right edge of the array. The function should return the leftmost pivot index. If no such index exists, return `-1`.

## Examples

- **Example 1:**
  - Input: `nums = [1,7,3,6,5,6]`
  - Output: `3`
  - Explanation: The pivot index is 3. Left sum = `nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11`. Right sum = `nums[4] + nums[5] = 5 + 6 = 11`.

- **Example 2:**
  - Input: `nums = [1,2,3]`
  - Output: `-1`
  - Explanation: There is no index that satisfies the conditions in the problem statement.

## Approach
1. **Calculate Total Sum:** Start by calculating the total sum of all elements in the array. This allows us to easily compute the right sum as we iterate through the array.
2. **Initialize Left Sum:** Begin with a left sum of `0`.
3. **Iterate Through the Array:** For each index in the array, calculate the right sum as the total sum minus the left sum minus the current element.
4. **Check for Pivot Index:** At each step, check if the left sum equals the right sum. If so, return the current index as the pivot index.
5. **Update Left Sum:** If the pivot condition is not met, update the left sum by adding the current element to it before moving to the next index.
6. **Return -1 if No Pivot Found:** If no pivot index is found by the end of the array, return `-1`.

## Complexity Analysis
- **Time Complexity:** O(n), where `n` is the number of elements in the input array `nums`. This complexity is due to a single pass to calculate the total sum and another pass to find the pivot index.
- **Space Complexity:** O(1), because the algorithm uses a constant amount of space regardless of the size of the input array. The space is used for storing the total sum, left sum, and a few counters.

This approach efficiently identifies the pivot index using a straightforward two-pass solution, ensuring minimal space usage while maintaining clarity and ease of understanding.
