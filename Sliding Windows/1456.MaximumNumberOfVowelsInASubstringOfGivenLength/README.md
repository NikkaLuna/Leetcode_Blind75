# 1456. Maximum Number of Vowels in a Substring of Given Length

## Problem Description
Given a string `s` and an integer `k`, return the maximum number of vowel letters in any substring of `s` with length `k`.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

### Example
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.


## Approach
1. **Initialize Window:** Initialize a window of length `k` at the beginning of the string.
2. **Count Vowels:** Count the number of vowel letters within this window.
3. **Update Maximum Count:** Update the maximum count of vowels if the current window has more vowels than the previous maximum.
4. **Slide Window:** Slide the window one character to the right and repeat until we reach the end of the string.

## Time Complexity
The time complexity of the provided solution is O(n), where n is the length of the string `s`. This is because the solution iterates through the string only once to count the vowels within each sliding window of length `k`.

## Space Complexity
The space complexity is O(1) because it uses only a constant amount of extra space regardless of the size of the input string.
