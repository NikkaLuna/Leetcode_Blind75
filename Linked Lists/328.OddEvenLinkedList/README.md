# 328. Odd Even Linked List

## Problem Statement
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

### Example:

#### Input:
head = [1,2,3,4,5]

#### Output:
[1,3,5,2,4]

## Approach
To solve this problem, we can use a simple iterative approach:
1. Initialize pointers `odd`, `even`, and `evenHead`.
2. Traverse the linked list, linking odd-positioned nodes and even-positioned nodes separately.
3. After traversing, connect the end of the odd-positioned list to the beginning of the even-positioned list.
4. Return the modified head of the reordered list.

## Space-Time Complexity
- Time Complexity: O(n), where n is the number of nodes in the linked list. This is because we traverse the linked list once.
- Space Complexity: O(1), as we only use a constant amount of extra space regardless of the size of the input.
