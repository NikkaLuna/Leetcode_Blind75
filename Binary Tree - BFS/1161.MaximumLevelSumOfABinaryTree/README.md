# 1161. Maximum Level Sum of a Binary Tree

## Problem Statement

Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on. Return the smallest level `x` such that the sum of all the values of nodes at level `x` is maximal.

### Example 1:

**Input:**
root = [1,7,0,7,-8,null,null]

**Output:**
2

**Explanation:**
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.

## Approach

1. **Level-Order Traversal (BFS):**
   - Use a queue to perform a level-order traversal (BFS) of the binary tree, starting from the root. This ensures that nodes are processed level by level.
   
2. **Calculate Level Sums:**
   - For each level, compute the sum of the node values. Initialize a sum variable at the start of each level, and as you dequeue nodes, add their values to this sum.
   
3. **Track Maximum Sum:**
   - Keep track of the maximum sum encountered so far and the corresponding level. Compare the sum of the current level with the maximum sum recorded. If the current level's sum is greater, update the maximum sum and the corresponding level.

4. **Return the Result:**
   - After traversing all levels, return the level with the highest sum. If multiple levels have the same sum, return the smallest level number.

## Space and Time Complexity

- **Time Complexity:** `O(n)`
  - Each node in the tree is visited exactly once during the level-order traversal, where `n` is the number of nodes in the tree.

- **Space Complexity:** `O(m)`
  - The space complexity is determined by the maximum number of nodes at any level (`m`), which is the width of the tree. This is due to the space needed for the queue during the level-order traversal. In the worst case, this could be `O(n)` where `n` is the number of nodes in the tree, but typically it is less.
