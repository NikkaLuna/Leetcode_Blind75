# 11. Container With Most Water

## Problem Description
You are given an integer array `height` of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

### Example
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Input: height = [1,1]
Output: 1

## Approach
- Use two pointers `l` and `r` pointing to the start and end of the array.
- Calculate the area between the lines represented by `height[l]` and `height[r]`.
- Move the pointer pointing to the shorter line towards the center.
- Update the maximum area if the current area is greater.
- Repeat until `l` and `r` meet.

## Time Complexity
- The time complexity is O(n), where n is the length of the input array `height`.

## Space Complexity
- The space complexity is O(1) since we use only a constant amount of extra space.
