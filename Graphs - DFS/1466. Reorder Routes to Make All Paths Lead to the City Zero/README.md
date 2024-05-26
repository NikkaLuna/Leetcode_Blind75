# Reorder Routes to Make All Paths Lead to the City Zero

## Problem Description

There are `n` cities numbered from `0` to `n-1` and `n-1` roads such that there is only one way to travel between two different cities (this network forms a tree). Last year, the ministry of transport decided to orient the roads in one direction because they are too narrow.

Roads are represented by connections where `connections[i] = [ai, bi]` represents a road from city `ai` to city `bi`.

This year, there will be a big event in the capital (city `0`), and many people want to travel to this city.

Your task consists of reorienting some roads such that each city can visit city `0`. Return the minimum number of edges changed.

It is guaranteed that each city can reach city `0` after reordering.

### Example

**Input:**

n = 6
connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]

**Output:**

3

**Explanation:**

Change the direction of edges such that each node can reach city `0`. In this case, the edges to be reversed are (1,3), (2,3), and (4,5), making a total of 3 changes.

## Approach

1. **Graph Construction**:
   - Construct an adjacency list to represent the graph.
   - For each road in the connections list, add it twice: once as a forward direction (with a cost of 1, indicating a potential need for reordering) and once as a backward direction (with a cost of 0, indicating no reordering needed).

2. **Depth-First Search (DFS)**:
   - Perform a DFS starting from city `0`. Use a recursive function to traverse the graph.
   - For each city, traverse its neighbors. If the neighbor is not the parent city (to avoid going back), add the cost of the edge (1 if the edge needs reordering, 0 otherwise) and recursively perform DFS on the neighbor.
   - Accumulate the total number of changes needed to make all paths lead to city `0`.

3. **Return the Result**:
   - The total number of changes is the minimum number of edges that need to be changed to ensure all cities can reach city `0`.

## Space and Time Complexity

- **Time Complexity**: `O(n)`, where `n` is the number of cities. This is because each city and its connections are visited once in the DFS traversal.
- **Space Complexity**: `O(n + m)`, where `m` is the number of roads. This is for storing the graph in an adjacency list and the recursion stack space used by the DFS.
