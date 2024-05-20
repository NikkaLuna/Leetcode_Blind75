# 1372. Longest ZigZag Path in a Binary Tree

**Difficulty:** Medium

## Problem Statement

You are given the root of a binary tree.

A ZigZag path for a binary tree is defined as follows:
1. Choose any node in the binary tree and a direction (right or left).
2. If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
3. Change the direction from right to left or from left to right.
4. Repeat the second and third steps until you can't move in the tree.

Zigzag length is defined as the number of nodes visited minus 1. (A single node has a length of 0).

Return the longest ZigZag path contained in that tree.

### Example 1:

**Input:**
root = [1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1]

**Output:** `3`

**Explanation:**
The longest ZigZag path is in blue nodes (right -> left -> right).

## Approach

To solve this problem efficiently, we use a depth-first search (DFS) approach. The key steps are:

### Recursive DFS Traversal:

- Start the DFS traversal from the root in both left and right directions.
- Track the direction and the current length of the ZigZag path.
- Use a helper function to recursively explore the tree while changing directions and updating the length.

### Track Maximum Length:

- Maintain a global variable to keep track of the maximum ZigZag path length encountered during the traversal.
- Update this variable whenever a longer ZigZag path is found.

## Space and Time Complexity

- **Time Complexity:** `O(n)` — Each node is visited once, leading to a linear time complexity where `n` is the number of nodes in the tree.
- **Space Complexity:** `O(h)` — The recursion stack can go up to the height of the tree, which in the worst case (for a skewed tree) is `O(n)`, but on average is `O(h)` where `h` is the height of the tree.

