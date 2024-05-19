# Determine if Two Strings Are Close

## Problem Description

Given two strings `word1` and `word2`, return `true` if `word1` and `word2` are considered "close", and `false` otherwise. Two strings are considered "close" if you can attain one from the other using the following operations:

- **Operation 1**: Swap any two existing characters.
  - For example, `abcde` can be transformed into `aecdb` by swapping characters 'b' and 'e'.
- **Operation 2**: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
  - For example, `aacabb` can be transformed into `bbcbaa` by replacing all 'a's with 'b's and all 'b's with 'a's.

You can use the operations on either string as many times as necessary.


**Explanation:**  
You can attain `word2` from `word1` in 2 operations:
1. Apply Operation 1: "abc" -> "acb"
2. Apply Operation 1: "acb" -> "bca"

## Constraints

- Both `word1` and `word2` consist of lowercase English letters.
- The lengths of `word1` and `word2` are in the range [1, 10^5].

## Approach

- Calculate the frequency of each character in both strings.
- Check if the frequencies of characters in both strings are identical.
- Sort the frequency arrays and compare them to determine if both strings can be transformed into each other.
- Return `true` if the strings are "close", otherwise return `false`.

## Implementation

The solution is implemented in Java and can be found in the `Solution.java` file in this repository.

