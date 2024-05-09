# 392. Is Subsequence

## Problem Description
Given two strings `s` and `t`, return true if `s` is a subsequence of `t`, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

### Example
- Input: `s = "abc", t = "ahbgdc"`
  Output: `true`

- Input: `s = "axc", t = "ahbgdc"`
  Output: `false`

## Approach
- Initialize two pointers `i` and `j` to iterate through the strings `s` and `t`, respectively.
- While `i` and `j` are within the bounds of their respective strings:
  - If the characters at positions `i` and `j` are equal, increment `i`.
  - Always increment `j`.
- If `i` reaches the end of `s`, return true; otherwise, return false.

## Time Complexity
Let `n` be the length of string `s` and `m` be the length of string `t`.
- The algorithm iterates through both strings once, so the time complexity is O(n + m).
  
## Space Complexity
The algorithm uses only a constant amount of extra space, so the space complexity is O(1).
