
# README: Unique Number of Occurrences Problem

## Problem Statement
Given an array of integers `arr`, the goal is to determine if the number of occurrences of each value in the array is unique. The function should return `true` if no two values have the same number of occurrences, and `false` otherwise.

## Examples
- **Example 1:**
  - Input: `arr = [1,2,2,1,1,3]`
  - Output: `true`
  - Explanation: The values 1, 2, and 3 appear 3, 2, and 1 times respectively. Since all counts are unique, the output is `true`.

- **Example 2:**
  - Input: `arr = [1,2]`
  - Output: `false`
  - Explanation: The values 1 and 2 appear 1 time each. Since the counts are not unique, the output is `false`.

- **Example 3:**
  - Input: `arr = [-3,0,1,-3,1,1,1,-3,10,0]`
  - Output: `true`
  - Explanation: The values have unique occurrences, so the output is `true`.

## Approach
1. **Count Frequencies:** Utilize a HashMap to count the occurrences of each integer in the array. This step involves iterating through the array and updating the count for each integer.
2. **Check Uniqueness of Counts:** Use a HashSet to track the unique counts of occurrences. As you iterate through the frequency counts:
   - If a count is already present in the HashSet, return `false` indicating that a duplicate count exists.
   - Otherwise, add the count to the HashSet.
3. **Completion:** If the iteration completes without finding any duplicate counts, return `true`.

## Complexity Analysis
- **Time Complexity:** O(n), where `n` is the number of elements in the input array `arr`. This includes one full iteration over the array to build the frequency map, and another potential full iteration over the map to check the uniqueness of counts.
- **Space Complexity:** O(n) in the worst case scenario. This accounts for:
  - A HashMap storing counts for each unique value in the array, which in the worst case, where all values are unique, could be up to `n`.
  - A HashSet holding the unique counts, which also, in the worst case scenario, could involve up to `n` different counts if each value appears a different number of times.
