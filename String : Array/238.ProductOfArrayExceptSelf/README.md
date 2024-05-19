# 238. Product of Array Except Self

## Problem Description
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`. You must write an algorithm that runs in O(n) time and without using the division operation.

### Examples
Example:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]


## Approach
1. **Initialize**: Initialize a list of integers named 'answer' to hold the answer. Two passes through the array are made with 'left' and 'right' variables.
2. **Left Pass**: In the first pass, calculate the product of all elements to the left of each element and store it in the 'answer' array.
3. **Right Pass**: In the second pass, calculate the product of all elements to the right of each element, multiplying it with the corresponding left product stored in the right answer array.
4. **Final Result**: Each element in the answer array contains the product of all elements except the element at that index.
5. **Return**: Return 'answer'.

## Time Complexity
- O(n): The method iterates through the array twice, each time with a single pass through the array. Therefore, the overall time complexity is linear with respect to the size of the input array.

## Space Complexity
- O(n): The method creates an additional array 'answer' of the same length as 'nums' to store the product of all elements to the left of each element. The 'answer' array, which is proportional to the size of the input, is used to store the output.
