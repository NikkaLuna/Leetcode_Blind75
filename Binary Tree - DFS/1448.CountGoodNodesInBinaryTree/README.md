# 1448. Count Good Nodes in Binary Tree

## Problem Description

Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.

### Example

#### Input
root = [3,1,4,3,null,1,5]

#### Output
Output = 4

#### Explanation
- Nodes in blue are good.
- Root Node (3) is always a good node.
- Node 4 -> (3,4) is the maximum value in the path starting from the root.
- Node 5 -> (3,4,5) is the maximum value in the path.
- Node 3 -> (3,1,3) is the maximum value in the path.

## Approach

1. **DFS Traversal**: Use Depth-First Search (DFS) to traverse the binary tree.
2. **Track Maximum Value**: During the traversal, maintain the maximum value encountered so far along the path from the root to the current node.
3. **Count Good Nodes**: For each node, check if its value is greater than or equal to the maximum value tracked. If so, it is a good node.
4. **Update Maximum**: Update the maximum value as needed while traversing.
5. **Recursive Counting**: Recursively count the good nodes in the left and right subtrees.

## Space and Time Complexity

### Time Complexity

- **O(n)**: Each node in the binary tree is visited exactly once during the DFS traversal, where n is the number of nodes in the tree.

### Space Complexity

- **O(h)**: The space complexity is proportional to the height of the tree (h), due to the recursion stack. In the worst case, for a skewed tree, this could be O(n), but for a balanced tree, it is O(log n).
