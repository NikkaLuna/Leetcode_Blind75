
# 643. Maximum Average Subarray I

## Problem Description
You are given an integer array `nums` consisting of `n` elements, and an integer `k`. Find a contiguous subarray whose length is equal to `k` that has the maximum average value and return this value. Any answer with a calculation error less than 10^-5 will be accepted.

### Example
- Input: nums = [1,12,-5,-6,50,3], k = 4
  Output: 12.75000
  Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
- Input: nums = [5], k = 1
  Output: 5.00000

## Approach
- Initialize a variable `currentSum` to store the sum of the first `k` elements of the array.
- Iterate through the array from index `k` to the end.
  - Update `currentSum` by adding the current element and subtracting the element `k` positions earlier.
  - Update `maxSum` to store the maximum sum encountered so far.
- Finally, return the maximum sum divided by `k` to get the maximum average.

## Time Complexity
Let `n` be the length of the input array `nums`.
- Calculating the initial sum takes O(k) time.
- The loop to iterate through the array from index `k` to the end takes O(n - k) time.
- Overall, the time complexity is O(n).

## Space Complexity
- The space complexity is O(1) as we only use a constant amount of extra space.
