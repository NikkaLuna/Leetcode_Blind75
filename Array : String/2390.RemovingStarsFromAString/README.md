# Removing Stars From a String

## Problem Description
Given a string `s`, which contains stars `*`, you are required to remove stars according to the following rule:

- Choose a star in `s`.
- Remove the closest non-star character to its left, as well as remove the star itself.
Return the resulting string after all stars have been removed.

## Approach
1. Start at the beginning of the input string `s` and move character by character from left to right.
2. Whenever a star `*` is encountered, look for the closest non-star character to its left.
3. If a non-star character is found to the left of the star, delete both the non-star character and the star itself.
4. As you traverse the input string, collect non-star characters and stars (after adjacent characters are removed) into a StringBuilder named `answer`.
5. Once all stars and their adjacent characters are removed, convert the `StringBuilder` `answer` into a regular string using the `toString()` method and return it as the final output.

## Time Complexity
The time complexity of the provided solution is O(n^2), where n is the length of the input string `s`. This is because for each star encountered in the string, we potentially iterate through the entire string to find the closest non-star character to its left.

## Space Complexity
The space complexity is O(n), where n is the length of the input string `s`. This is because we use a `StringBuilder` (`answer`) to store the modified string, which could potentially grow to the size of the input string. However, `StringBuilder` has amortized constant time complexity for appending characters, so it does not significantly contribute to the overall space complexity.
