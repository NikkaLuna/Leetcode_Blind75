# 49. Group Anagrams

## Problem Description
Given an array of strings `strs`, group the anagrams together. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. You can return the answer in any order.

### Example
- Input: strs = ["eat","tea","tan","ate","nat","bat"]
  Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
- Input: strs = [""]
  Output: [[""]]

## Approach
- Iterate through each word in the array.
- Sort the characters of each word to create a signature representing its anagram.
- Use a HashMap to group words with the same signature together.
- Return the values of the HashMap as a list of lists.

## Time Complexity
Let `n` be the total number of characters in all the words and `k` be the number of words in the array.
- Sorting each word takes O(k * m * log(m)) time, where `m` is the average length of the words.
- Iterating through each word and updating the HashMap takes O(k * m) time.
- Overall, the time complexity is O(n * log(m)).

## Space Complexity
- The space complexity is O(n) because we use a HashMap to store the grouped anagrams, where `n` is the total number of characters in all the words.
