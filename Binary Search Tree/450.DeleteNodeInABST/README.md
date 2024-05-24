# 450. Delete Node in a BST

## Problem Description

Given a root node reference of a Binary Search Tree (BST) and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

The deletion process can be divided into two stages:
1. Search for the node to remove.
2. If the node is found, delete the node.

### Example 1

**Input:**
root = [5, 3, 6, 2, 4, null, 7]
key = 3

**Output:**
[5, 4, 6, 2, null, null, 7]

**Explanation:**
Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is `[5, 4, 6, 2, null, null, 7]`, shown in the above BST.
Another valid answer is `[5, 2, 6, null, 4, null, 7]` and it's also accepted.

## Approach

1. **Search for the Node**:
   - If the key is less than the current node’s value, recursively search in the left subtree.
   - If the key is greater than the current node’s value, recursively search in the right subtree.
   - If the key is equal to the current node’s value, proceed to delete the node.

2. **Delete the Node**:
   - **No Child**: If the node is a leaf (no children), return `null` to remove it.
   - **One Child**: If the node has one child, return that child to replace the node.
   - **Two Children**: If the node has two children:
     - Find the in-order successor (the smallest node in the right subtree).
     - Replace the node's value with the in-order successor's value.
     - Recursively delete the in-order successor.

3. **Finding the Minimum Node**:
   - The `findMin` method finds the smallest node in a subtree, which is always the leftmost node.

## Space and Time Complexity

- **Time Complexity**: `O(h)`, where `h` is the height of the tree. In the worst case, this can be `O(n)` for an unbalanced tree, but it is `O(log n)` for a balanced tree.
- **Space Complexity**: `O(h)` due to the recursion stack. This is `O(n)` in the worst case (unbalanced tree) and `O(log n)` for a balanced tree.
