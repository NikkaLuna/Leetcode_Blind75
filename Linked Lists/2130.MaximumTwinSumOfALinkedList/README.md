# 2130. Maximum Twin Sum of a Linked List

## Problem Statement
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4. The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list.

### Examples

#### Example 1:

Input: head = [5, 4, 2, 1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6.


## Approach
To solve this problem, we use the following steps:

1. **Find the Middle of the Linked List**:
   - Use the slow and fast pointer technique to find the midpoint of the linked list. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.

2. **Reverse the Second Half of the Linked List**:
   - Starting from the middle node, reverse the second half of the linked list. This allows easy pairing of nodes from the start and end of the list.

3. **Calculate the Twin Sums**:
   - Traverse both the first half and the reversed second half of the list simultaneously, calculating the twin sums and tracking the maximum twin sum encountered.

4. **Return the Maximum Twin Sum**:
   - The result is the highest twin sum calculated.

## Space-Time Complexity

- **Time Complexity**: O(n)
  - Finding the middle of the linked list takes O(n) time.
  - Reversing the second half of the list takes O(n) time.
  - Calculating the twin sums takes O(n) time.
  - Thus, the total time complexity is O(n).

- **Space Complexity**: O(1)
  - The solution uses a constant amount of extra space for pointers, making the space complexity O(1).
