# 345. Reverse Vowels of a String

## Problem Description
Given a string `s`, reverse only all the vowels in the string and return it. The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

### Example
- Input: s = "hello"
  Output: "holle"
- Input: s = "leetcode"
  Output: "leotcede"

## Approach
- Convert the input string `s` into a character array.
- Initialize two pointers, `l` and `r`, at the beginning and end of the array respectively.
- Iterate through the array using the two pointers:
  - Move `l` forward until it points to a vowel.
  - Move `r` backward until it points to a vowel.
  - Swap the vowels at positions `l` and `r`.
- Continue this process until `l` crosses `r`.
- Return the modified string after converting the character array back to a string.

## Time Complexity
Let `n` be the length of the input string `s`.
- Converting the string to a character array takes O(n) time.
- Reversing the vowels using two pointers takes O(n) time.
- Overall, the time complexity is O(n).

## Space Complexity
- The space complexity is O(n) because we use a character array to store the modified string, where `n` is the length of the input string `s`.
