# Search in a Binary Search Tree

## Problem Description

You are given the root of a binary search tree (BST) and an integer `val`. 

Find the node in the BST whose value equals `val` and return the subtree rooted at that node. If such a node does not exist, return `null`.

### Example

**Input**:
root = [4,2,7,1,3], val = 2

**Output**:
[2,1,3]

## Approach

Given the properties of a binary search tree (BST), we can efficiently search for the target value by leveraging the BST properties:
- The left subtree of a node contains only nodes with values less than the node's value.
- The right subtree of a node contains only nodes with values greater than the node's value.

### Steps

1. Start at the root node.
2. Use a while loop to traverse the tree:
   - If the current node's value is equal to `val`, return the current node.
   - If `val` is less than the current node's value, move to the left child.
   - If `val` is greater than the current node's value, move to the right child.
3. If the loop exits and the node with value `val` is not found, return `null`.

## Space and Time Complexity

### Time Complexity

- **Average Case**: \(O(\log n)\), where \(n\) is the number of nodes in the BST. This occurs if the tree is balanced.

### Space Complexity

- **Iterative Approach**: \(O(1)\). Only a few variables are used, and no additional space proportional to the size of the input is required.

