# 1768. Merge Strings Alternately

## Problem Description
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

### Example
- Input: word1 = "abc", word2 = "pqr"
  Output: "apbqcr"
  Explanation: The merged string will be merged as so:
  word1:  a   b   c
  word2:    p   q   r
  merged: a p b q c r

- Input: word1 = "ab", word2 = "pqrs"
  Output: "apbqrs"
  Explanation: Notice that as word2 is longer, "rs" is appended to the end.
  word1:  a   b 
  word2:    p   q   r   s
  merged: a p b q   r   s

## Approach
- Use two pointers to iterate through word1 and word2 simultaneously.
- Append characters from both words alternately until one of the words is exhausted.
- If one word is longer than the other, append the remaining characters of the longer word to the merged string.

## Time Complexity
Let `m` be the length of word1 and `n` be the length of word2.
- Iterating through both words simultaneously takes O(min(m, n)) time.
- Appending characters to the StringBuilder takes O(1) time for each character.
- Overall, the time complexity is O(min(m, n)).

## Space Complexity
- The space complexity is O(m + n) because we use a StringBuilder to store the merged string, which may have a maximum length of m + n.
