# 394. Decode String

## Problem Description
Given an encoded string, return its decoded string. The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer. You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4]. The test cases are generated so that the length of the output will never exceed 10^5.

## Example
Input: s = "3[a]2[bc]"
Output: "aaabcbc"

## Approach
1. We use two stacks: one for counts (`counts`) and one for strings (`strings`).
2. We iterate through the input string character by character.
3. If we encounter a digit, we update the count.
4. If we encounter an opening bracket, we push the current count and string onto their respective stacks and reset them for the new inner string.
5. If we encounter a closing bracket, we pop the count and the string from the stacks, repeat the string according to the count, and append it to the current string.
6. Otherwise, we simply append characters to the current string.
7. Finally, we return the fully decoded string.

## Time Complexity
- O(n), where n is the length of the input string `s`. This is because we iterate through each character of the input string exactly once.

## Space Complexity
- O(n), where n is the length of the input string `s`. This is because we use two stacks (`counts` and `strings`) to keep track of counts and strings, respectively. The maximum size of these stacks at any point during the execution is proportional to the depth of nested brackets in the input string.
