# 199. Binary Tree Right Side View

## Problem Statement

Given the root of a binary tree, imagine yourself standing on the right side of it. Return the values of the nodes you can see ordered from top to bottom.

### Example 1:

**Input:**
root = [1,2,3,null,5,null,4]

**Output:**
[1,3,4]


**Right Side View:**
- When you stand on the right side of the tree, the nodes you can see are those that are the rightmost at each level of the tree.

1. **Level 1 (Root Level):**
   - The only node at this level is `1`. 
   - From the right side, you can see `1`.

2. **Level 2:**
   - The nodes at this level are `2` and `3`.
   - From the right side, the rightmost node is `3`.

3. **Level 3:**
   - The nodes at this level are `5` and `4`.
   - From the right side, the rightmost node is `4`.

Therefore, the right side view of the tree, from top to bottom, is `[1, 3, 4]`.

**Summary:**
- The right side view includes nodes `1`, `3`, and `4` because these are the nodes visible when looking at the tree from the right side, level by level.



## Approach

To solve the problem of finding the right side view of a binary tree, we can use a level-order traversal (Breadth-First Search) approach. Here’s a concise explanation of the solution:

1. **Initialization:**
   - Create an empty list `rightSide` to store the values of the rightmost nodes.
   - If the root is `null`, return the empty list.

2. **BFS Traversal:**
   - Use a queue for level-order traversal, starting with the root node.
   - Process nodes level by level while the queue is not empty.

3. **Processing Each Level:**
   - Determine the number of nodes at the current level (`levelSize`).
   - For each node, dequeue it from the queue.
   - Add the value of the last node at each level to the `rightSide` list.
   - Enqueue the left and right children of each node (if they exist) for the next level’s processing.

4. **Return Result:**
   - After processing all levels, return the `rightSide` list containing the values of the nodes visible from the right side of the tree.

## Space and Time Complexity

- **Time Complexity:** `O(n)`
  - Each node in the tree is visited exactly once during the level-order traversal, where `n` is the number of nodes in the tree.

- **Space Complexity:** `O(n)`
  - The space complexity is determined by the maximum size of the queue. In the worst case, the queue could hold up to `n/2` nodes (for a complete binary tree), which is proportional to `O(n)`. Additionally, the list `rightSide` will store up to `h` nodes, where `h` is the height of the tree. In the worst case of a skewed tree, the height `h` can be equal to `n`, but typically, it’s much smaller.


