# 104. Maximum Depth of Binary Tree

## Problem Statement

Given the root of a binary tree, compute and return its maximum depth. The maximum depth is defined as the number of nodes along the longest path from the root node down to the farthest leaf node.

### Examples

**Example 1:**
- **Input:** `root = [3,9,20,null,null,15,7]`
- **Output:** `3`
- **Explanation:** The deepest path is from root 3 -> 20 -> 15 or 3 -> 20 -> 7.

**Example 2:**
- **Input:** `root = [1,null,2]`
- **Output:** `2`
- **Explanation:** The deepest path is from root 1 -> 2.

## Approach

The solution uses a recursive depth-first search (DFS) approach to navigate through the tree and compute the depth. Here’s how the method works:

- **Base Case:** If the current node (`root`) is `null`, return a depth of 0. This case handles leaf nodes' children and ensures recursion termination.
- **Recursive Depth Calculation:** Recursively calculate the depth of the left and right subtrees:
  - `leftDepth = maxDepth(root.left)`: Calculates the maximum depth on the left side.
  - `rightDepth = maxDepth(root.right)`: Calculates the maximum depth on the right side.
- **Combine and Return:** Return the maximum of the left and right depths plus one (to account for the current node):
  - `return Math.max(leftDepth, rightDepth) + 1`.

This approach ensures that each node’s maximum depth is calculated by considering the maximum depths of its children, thus effectively and efficiently finding the maximum depth of the tree.

## Complexity Analysis

- **Time Complexity:** O(n), where n is the number of nodes in the binary tree. This complexity arises because the algorithm must visit each node exactly once to compute its depth.
- **Space Complexity:** O(h), where h is the height of the tree. This complexity accounts for the stack space used by the recursive calls. The worst-case space usage (stack depth) occurs when the tree is skewed (i.e., each node has only one child), making the tree's height equal to n (the number of nodes). For a balanced tree, the height h would be log(n), resulting in a logarithmic stack height.
