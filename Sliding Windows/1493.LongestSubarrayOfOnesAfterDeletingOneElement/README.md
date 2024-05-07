# Longest Subarray of 1's After Deleting One Element

## Problem Description
Given a binary array `nums`, you should delete one element from it. Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

### Example

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.


## Approach
1. **Initialize Variables:** Initialize variables `answer` (to store the maximum length of the subarray with 0's flipped), `i` and `j` (pointers for the start and end of the current subarray), and `indexLastZero` (to track the index of the last encountered zero).
2. **Iterate through the Array:** Iterate through the array `nums` using pointers `i` and `j`, moving `j` forward.
3. **Encounter Zero:** When encountering a zero at index `j`, adjust the start pointer `i` to the right of the last zero's index (`indexLastZero`) to create a new subarray.
4. **Update Maximum Length:** At each step, update `answer` with the maximum length of the subarray with 0's flipped to 1, which is `j - i`.

## Time Complexity
The time complexity of the provided solution is O(n), where n is the length of the input array `nums`. This is because the algorithm iterates through the array once using two pointers `i` and `j`.

## Space Complexity
The space complexity is O(1) because the algorithm uses only a constant amount of extra space, regardless of the size of the input array. The space used is primarily for storing variables such as `answer`, `i`, `j`, and `indexLastZero`, which do not scale with the size of the input.


