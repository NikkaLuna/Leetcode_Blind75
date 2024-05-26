# 547. Number of Provinces

## Problem Description

There are `n` cities. Some of them are connected directly, while others are not. If city `a` is connected directly with city `b`, and city `b` is connected directly with city `c`, then city `a` is connected indirectly with city `c`.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an `n x n` matrix `isConnected` where `isConnected[i][j] = 1` if the `i-th` city and the `j-th` city are directly connected, and `isConnected[i][j] = 0` otherwise.

Return the total number of provinces.

### Example

**Input:**

isConnected = [[1,1,0],
[1,1,0],
[0,0,1]]

**Output:**

2

## Approach

The problem can be solved using Depth-First Search (DFS) to find the connected components (provinces) in the given graph. Here’s a step-by-step breakdown of the approach:

1. **Initialize Variables**:
   - Determine the number of cities (`n`) from the length of the `isConnected` array.
   - Create a boolean array `visited` to keep track of which cities have been visited.
   - Initialize a counter `provinces` to keep track of the number of provinces.

2. **Iterate Through Each City**:
   - For each city, if it has not been visited, perform a DFS starting from that city to visit all cities in the same province.
   - Increment the `provinces` counter after each DFS call.

3. **Depth-First Search (DFS) Helper Method**:
   - Mark the current city as visited.
   - Iterate through all potential neighboring cities.
   - If there is a direct connection (`isConnected[city][neighbor] == 1`) and the neighbor has not been visited, recursively perform DFS on the neighbor.

4. **Return Result**:
   - Return the total number of provinces after all cities have been processed.

## Space and Time Complexity

- **Time Complexity**: `O(n^2)`, where `n` is the number of cities. This is because we potentially visit each city and its connections in the worst case.
- **Space Complexity**: `O(n)`, for the `visited` array to keep track of visited cities and the call stack used by the DFS.


