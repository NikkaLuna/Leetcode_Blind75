# 841. Keys and Rooms

## Problem Description

There are `n` rooms labeled from `0` to `n - 1`, and all the rooms are locked except for room `0`. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array `rooms` where `rooms[i]` is the set of keys that you can obtain if you visited room `i`, return `true` if you can visit all the rooms, or `false` otherwise.

### Example

**Input:**
rooms = [[1],[2],[3],[]]

**Output:**
true

**Explanation:**

1. Start by visiting room `0` and collect key `1`.
2. Use key `1` to enter room `1` and collect key `2`.
3. Use key `2` to enter room `2` and collect key `3`.
4. Use key `3` to enter room `3`.
5. Since all rooms have been visited, the function returns `true`.

## Approach

To solve this problem, we can use Breadth-First Search (BFS). The approach involves the following steps:

1. **Initialization**:
   - Create a queue to manage the BFS traversal.
   - Create a boolean array to keep track of visited rooms.
   - Start by adding room `0` to the queue and marking it as visited.

2. **BFS Traversal**:
   - While the queue is not empty, dequeue a room from the queue.
   - For each key found in the dequeued room, check if the corresponding room has been visited:
     - If not, add the room to the queue and mark it as visited.

3. **Check All Rooms**:
   - After the BFS traversal, check if the number of visited rooms is equal to the total number of rooms.
   - If they match, return `true`; otherwise, return `false`.

## Space and Time Complexity

- **Time Complexity**: `O(n + k)`, where `n` is the number of rooms and `k` is the total number of keys across all rooms.
  - The BFS traversal will visit each room exactly once, resulting in `O(n)` operations.
  - For each room, it will process all the keys in that room, summing up to `O(k)` operations.

- **Space Complexity**: `O(n)`, where `n` is the number of rooms.
  - The queue can hold at most `n` rooms in the worst case.
  - The boolean array has a size of `n` to keep track of the visited status of each room.
