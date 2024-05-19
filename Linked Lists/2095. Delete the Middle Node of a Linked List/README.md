# 2095. Delete the Middle Node of a Linked List

**Difficulty:** Medium

## Problem Statement

You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size `n` is the `⌊n / 2⌋`th node from the start using 0-based indexing, where `⌊x⌋` denotes the largest integer less than or equal to `x`.

For `n = 1, 2, 3, 4,` and `5`, the middle nodes are `0, 1, 1, 2,` and `2`, respectively.

## Example 1:

**Input:** head = [1,3,4,7,1,2,6]

**Output:** [1,3,4,1,2,6]

**Explanation:**

The above figure represents the given linked list. The indices of the nodes are written below. Since `n = 7`, node `3` with value `7` is the middle node, which is marked in red. We return the new list after removing this node.

## Approach

1. **Edge Case Handling:** If the head is null or has only one node, return null.
2. **Initialize Pointers:** Use two pointers, `slow` and `fast`. `slow` moves one step at a time, and `fast` moves two steps at a time.
3. **Find Middle:** Move the `slow` and `fast` pointers until `fast` reaches the end of the list. `slow` will then be at the middle node.
4. **Delete Middle Node:** Use a `previous` pointer to keep track of the node before `slow`. Set `previous.next` to `slow.next` to remove the middle node.
5. **Return Modified List:** Return the modified list starting from the head.

## Space and Time Complexity

- **Time Complexity:** `O(n)`, where `n` is the number of nodes in the linked list. This is because we traverse the list once to find the middle node.
- **Space Complexity:** `O(1)`, as we only use a fixed amount of extra space for pointers.
