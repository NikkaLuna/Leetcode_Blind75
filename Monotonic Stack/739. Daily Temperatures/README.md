# 739. Daily Temperatures

## Problem Description

Given an array of integers `temperatures` representing the daily temperatures, return an array `answer` such that `answer[i]` is the number of days you have to wait after the `i-th` day to get a warmer temperature. If there is no future day for which this is possible, keep `answer[i]` == 0 instead.

### Example 1:

Input: temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
Output: [1, 1, 4, 2, 1, 1, 0, 0]

### Example 2:

Input: temperatures = [30, 40, 50, 60]
Output: [1, 1, 1, 0]


## Approach

To solve this problem efficiently, we use a stack-based approach. The idea is to keep track of the indices of the days in a stack. For each day, we compare its temperature with the temperature of the days indexed in the stack. If the current day's temperature is higher than the temperature at the index stored at the top of the stack, it means we have found a warmer day for the day at the index on the top of the stack. We then calculate the difference in days and store it in the `answer` array. We continue this process until the stack is empty or the current temperature is not warmer than the temperature at the index on the top of the stack. Finally, we push the index of the current day onto the stack.

## Space and Time Complexity

- **Time Complexity**: O(n)
  - Each element is pushed and popped from the stack at most once, making the time complexity linear.

- **Space Complexity**: O(n)
  - The space complexity is linear due to the stack, which can store up to `n` indices in the worst case. The `answer` array also requires O(n) space, but since it is part of the output, it does not count towards extra space complexity.
