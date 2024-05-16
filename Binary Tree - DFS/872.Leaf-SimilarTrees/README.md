# 872. Leaf-Similar Trees

## Problem Statement

Consider all the leaves of a binary tree. From left to right order, the values of those leaves form a leaf value sequence.

## Approach

To solve this problem, we use a depth-first search (DFS) to collect the leaf values from both trees and then compare the sequences:

1. **Traverse Each Tree to Collect Leaf Values**:
   - Perform a depth-first search (DFS) on both trees (`root1` and `root2`) to collect the values of all leaf nodes.
   - During the traversal, check if a node is a leaf (i.e., it has no children). If it is a leaf, add its value to a list.

2. **Compare the Leaf Sequences**:
   - Once you have collected the leaf values from both trees, compare the two lists.
   - If the lists of leaf values are identical, the trees are leaf-similar.

3. **Return the Result**:
   - Return `true` if the two lists are the same, otherwise return `false`.

## Space and Time Complexity

- **Time Complexity**: O(n1 + n2)
  - `n1` is the number of nodes in the first tree and `n2` is the number of nodes in the second tree.
  - Each node is visited once during the DFS traversal.

- **Space Complexity**: O(h1 + h2)
  - `h1` is the height of the first tree and `h2` is the height of the second tree.
  - This is the space required for the call stack during the recursive DFS traversal.
  - Additionally, the space for storing leaf values in lists is O(l1 + l2), where `l1` and `l2` are the number of leaf nodes in the first and second trees, respectively.
