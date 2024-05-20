# 437. Path Sum III

**Difficulty:** Medium

## Problem Statement

Given the root of a binary tree and an integer `targetSum`, return the number of paths where the sum of the values along the path equals `targetSum`.

The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

### Example 1:

**Input:** `root = [10, 5, -3, 3, 2, null, 11, 3, -2, null, 1], targetSum = 8`

**Output:** `3`

## Approach

To solve this problem efficiently, we use a prefix sum approach combined with a hash map. The key steps are:

### Use a Hash Map:

- Use a hash map to store the cumulative sums and their frequencies as we traverse the tree.

### Track Prefix Sums:

- Keep track of the current cumulative sum as we traverse the tree.
- For each node, calculate the required prefix sum that would form a path with the `targetSum`.

### Count Valid Paths:

- Check the hash map for the required prefix sum and count the valid paths.

### Recursive DFS Traversal:

- Use a recursive depth-first search (DFS) to traverse the tree and update the hash map with the current cumulative sum.

## Space and Time Complexity

- **Time Complexity:** `O(n)` — Each node is visited once, and hash map operations are `O(1)` on average.
- **Space Complexity:** `O(n)` — The hash map can store up to `n` unique prefix sums, and the recursion stack can be up to `O(n)` deep.


