# 739. Daily Temperatures

## Problem Description
Given an array of integers `temperatures` representing the daily temperatures, return an array `answer` such that `answer[i]` is the number of days you have to wait after the `i`th day to get a warmer temperature. If there is no future day for which this is possible, keep `answer[i]` equal to 0 instead.

### Example
- Input: temperatures = [73,74,75,71,69,72,76,73]
  Output: [1,1,4,2,1,1,0,0]
- Input: temperatures = [30,40,50,60]
  Output: [1,1,1,0]
- Input: temperatures = [30,60,90]
  Output: [1,1,0]

## Approach
- We use a stack to keep track of the indices of temperatures.
- Iterate through the array of temperatures:
  - If the stack is not empty and the current temperature is greater than the temperature at the index at the top of the stack:
    - Pop the index from the stack and update `answer` for that index with the difference between the current index and the popped index.
  - Push the current index onto the stack.
- Return the `answer` array.

## Time Complexity
Let `n` be the length of the input array `temperatures`.
- Each element is pushed and popped from the stack at most once, so both operations take O(1) time.
- Therefore, the time complexity is O(n).

## Space Complexity
- The space complexity is O(n) because we use a stack to store indices.
