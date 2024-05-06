# 2352. Equal Row and Column Pairs

## Problem Statement
Given a 0-indexed n x n integer matrix `grid`, return the number of pairs `(ri, cj)` such that row `ri` and column `cj` are equal. A row and column pair is considered equal if they contain the same elements in the same order.

## Examples

- **Example 1:**
  - Input: `grid = [[3,2,1],[1,7,6],[2,7,7]]`
  - Output: `1`
  - Explanation: There is 1 equal row and column pair:
    - (Row 2, Column 1): `[2,7,7]`

- **Example 2:**
  - Input: `grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]`
  - Output: `3`
  - Explanation: There are 3 equal row and column pairs:
    - (Row 0, Column 0): `[3,1,2,2]`
    - (Row 2, Column 2): `[2,4,2,2]`
    - (Row 3, Column 2): `[2,4,2,2]`

## Approach
1. **Iterate through each row and column in the grid:** For each row, compare it with each column.
2. **Check for equality:** Compare the elements of the current row with those of the current column index by index.
3. **Count matching pairs:** If all elements in the row and column match perfectly, increment a counter.
4. **Return the count:** After completing the comparisons for all rows and columns, return the count of matching pairs.

## Complexity Analysis
- **Time Complexity:** O(n^3), where `n` is the size of the grid. This arises because:
  - We iterate over each row (O(n)).
  - For each row, we iterate over each column (O(n)).
  - For each row-column pair, we compare each element (O(n)).
- **Space Complexity:** O(1), assuming no additional significant space is used beyond the input and counters. The space used for the function's operations does not scale with the size of the input beyond a few integer variables for counting and indexing.

This problem presents a straightforward brute-force approach by iterating over all possible row-column pairs and directly comparing their contents.
