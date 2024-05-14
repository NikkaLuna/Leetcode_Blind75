# 206. Reverse Linked List

## Problem Statement

Given the head of a singly linked list, the task is to reverse the list and return the head of the reversed linked list.

### Examples

**Example 1:**
- **Input:** `head = [1, 2, 3, 4, 5]`
- **Output:** `[5, 4, 3, 2, 1]`

**Example 2:**
- **Input:** `head = [1, 2]`
- **Output:** `[2, 1]`

## Approach

The solution uses an iterative method to reverse the singly linked list by modifying the pointers of each node. Here's how it works:

1. **Initialization:**
   - A `previous` pointer is initialized to `null`.
   - A `current` pointer starts at the `head` of the list.
   - A `next` temporary pointer is used to hold the next node in the list.

2. **Reversal Process:**
   - As we iterate through the list, we continually adjust the `next` pointer of the `current` node to point to the `previous` node.
   - We then update the `previous` and `current` pointers to move forward in the list.
   - This adjustment is done until the `current` pointer reaches the end of the list (`null`).

3. **Completion:**
   - When the `current` pointer reaches the end, the `previous` pointer will be at the new head of the reversed list. This is returned as the result.

## Complexity Analysis

- **Time Complexity:** O(n), where n is the number of nodes in the linked list. Each node is visited exactly once, thus making the time complexity linear.
- **Space Complexity:** O(1), as the solution uses a constant amount of space regardless of the size of the input list.

## Conclusion

This solution is optimal in terms of both time and space complexity. By adjusting the pointers during a single pass through the linked list, we efficiently reverse the list without needing additional storage. This approach is typically used in technical interviews and is a recommended method for linked list manipulation due to its efficiency and simplicity.
