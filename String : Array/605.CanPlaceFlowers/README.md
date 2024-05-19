# 605. Can Place Flowers

## Problem Description
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array `flowerbed` containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer `n`, return true if `n` new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

### Example
- Input: `flowerbed = [1,0,0,0,1], n = 1`
  Output: true
  Explanation: You can plant one new flower at position 2.
  
- Input: `flowerbed = [1,0,0,0,1], n = 2`
  Output: false
  Explanation: There are not enough empty spaces to plant two new flowers.

## Approach
- Initialize a variable `count` to keep track of the number of new flowers planted.
- Iterate through the `flowerbed` array.
- For each empty plot (`flowerbed[i] == 0`):
  - Check if the previous and next plots are also empty or out of bounds.
  - If so, plant a flower in the current plot and increment the `count`.
- Return true if the number of newly planted flowers is greater than or equal to `n`, otherwise return false.

## Time Complexity
Let `m` be the length of the `flowerbed` array.
- The algorithm iterates through the array once, so the time complexity is O(m).

## Space Complexity
The algorithm uses only a constant amount of extra space, so the space complexity is O(1).
