# 151. Reverse Words in a String

## Problem Description
Given an input string `s`, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that `s` may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

### Example
- Input: `s = "the sky is blue"`
  Output: `"blue is sky the"`

- Input: `s = "  hello world  "`
  Output: `"world hello"`
  Explanation: Your reversed string should not contain leading or trailing spaces.

- Input: `s = "a good   example"`
  Output: `"example good a"`
  Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

## Approach
1. Split the input string `s` into words using whitespace as a delimiter.
2. Iterate through the words array in reverse order and append each word to a StringBuilder, separated by a single space.
3. Trim the resulting string to remove any leading or trailing spaces.
4. Return the reversed string.

## Time Complexity
Let n be the length of the input string `s` and m be the total number of characters in the words.
- Splitting the string and iterating through the words takes O(n + m) time.
- Reversing the words and building the result string takes O(m) time.
Therefore, the overall time complexity is O(n + m).
