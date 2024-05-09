# 1071. Greatest Common Divisor of Strings

## Problem Description
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

### Example
- Input: str1 = "ABCABC", str2 = "ABC"
  Output: "ABC"
  Explanation: "ABC" is the largest string that divides both "ABCABC" and "ABC".

- Input: str1 = "ABABAB", str2 = "ABAB"
  Output: "AB"
  Explanation: "AB" is the largest string that divides both "ABABAB" and "ABAB".

- Input: str1 = "LEET", str2 = "CODE"
  Output: ""
  Explanation: There is no string that divides both "LEET" and "CODE".

## Approach
- Check if concatenating str1 and str2 in both orders results in the same string.
  - If not, there is no common divisor, so return an empty string.
- Use the Euclidean algorithm to find the greatest common divisor (GCD) of the lengths of str1 and str2.
- Return the substring of str1 from index 0 to the length of the GCD.

## Time Complexity
Let `m` and `n` be the lengths of str1 and str2, respectively.
- Concatenating str1 and str2 and comparing their lengths takes O(m + n) time.
- Calculating the GCD using the Euclidean algorithm takes O(log(min(m, n))) time.
- Overall, the time complexity is O(m + n).

## Space Complexity
The algorithm uses only a constant amount of extra space, so the space complexity is O(1).
