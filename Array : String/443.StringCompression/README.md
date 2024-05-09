# 443. String Compression

## Problem Description
Given an array of characters `chars`, compress it using the following algorithm:

Begin with an empty string `s`. For each group of consecutive repeating characters in `chars`:

- If the group's length is 1, append the character to `s`.
- Otherwise, append the character followed by the group's length.

The compressed string `s` should not be returned separately, but instead, be stored in the input character array `chars`. Note that group lengths that are 10 or longer will be split into multiple characters in `chars`.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

### Example
- Input: `chars = ["a","a","b","b","c","c","c"]`
  Output: Return 6, and the first 6 characters of the input array should be: `["a","2","b","2","c","3"]`
  Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

- Input: `chars = ["a"]`
  Output: Return 1, and the first character of the input array should be: `["a"]`
  Explanation: The only group is "a", which remains uncompressed since it's a single character.

## Approach
- Initialize two pointers `index` and `count` to keep track of the current index and the count of consecutive characters.
- Iterate through the `chars` array.
- If the current character is equal to the next character, increment the `count`.
- If the current character is different from the next character:
  - Write the current character to `chars` at the `index` position.
  - If `count` is greater than 1, convert `count` to a character array and write it to `chars` starting from the next position.
  - Reset `count` to 1.
- Finally, return the value of `index`.

## Time Complexity
Let `n` be the length of the input array `chars`.
- The algorithm iterates through the array once, so the time complexity is O(n).

## Space Complexity
The algorithm uses only a constant amount of extra space, so the space complexity is O(1).
