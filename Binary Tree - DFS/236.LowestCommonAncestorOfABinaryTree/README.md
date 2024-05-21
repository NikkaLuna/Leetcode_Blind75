# 236. Lowest Common Ancestor of a Binary Tree

## Problem Statement

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

### Example 1:
**Input:**
root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1

**Output:**
3

## Approach

To solve the problem of finding the Lowest Common Ancestor (LCA) in a binary tree, we use a recursive approach. The idea is to traverse the tree and look for nodes `p` and `q`. During the traversal, we use the following logic:

1. **Base Case:**
   - If the current node (`root`) is `null`, return `null`.
   - If the current node is either `p` or `q`, return the current node.

2. **Recursive Calls:**
   - Recursively find the LCA in the left subtree.
   - Recursively find the LCA in the right subtree.

3. **Determine the LCA:**
   - If both left and right recursive calls return non-null values, it means `p` and `q` are found in different subtrees of the current node. Hence, the current node is their LCA.
   - If only one of the recursive calls returns a non-null value, it means both `p` and `q` are found in one subtree. Thus, return the non-null node.

## Space and Time Complexity

- **Time Complexity:** `O(n)`
  - Each node is visited once, leading to a linear time complexity where `n` is the number of nodes in the tree.

- **Space Complexity:** `O(h)`
  - The space complexity is proportional to the height of the tree `h` due to the recursion stack. In the worst case (unbalanced tree), this could be `O(n)`, but for a balanced tree, it would be `O(log n)`.
