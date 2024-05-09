# 125. Valid Palindrome

## Problem Description
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return true if it is a palindrome, or false otherwise.

### Example
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

## Approach
- Use two pointers `l` and `r` pointing to the start and end of the string.
- Move `l` towards the right and `r` towards the left until they meet.
- Ignore non-alphanumeric characters by skipping them.
- Compare characters at `l` and `r` ignoring case.
- If at any point, the characters are not the same, return false.
- If the loop completes without returning false, return true.

## Time Complexity
- The time complexity is O(n), where n is the length of the input string `s`.

## Space Complexity
- The space complexity is O(1) since we use only a constant amount of extra space.
