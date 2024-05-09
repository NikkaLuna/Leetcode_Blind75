# 20. Valid Parentheses

## Problem Description
Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

### Example
Input: s = "()"
Output: true

Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false

## Approach
- We use a stack to keep track of the opening parentheses encountered.
- When we encounter an opening parenthesis, we push it onto the stack.
- When we encounter a closing parenthesis:
  - If the stack is empty, return false.
  - If the closing parenthesis matches the top of the stack, pop the stack.
  - Otherwise, return false.
- After processing the entire string, if the stack is empty, return true; otherwise, return false.

## Time Complexity
- The time complexity is O(n), where n is the length of the input string `s`, as we iterate through each character once.

## Space Complexity
- The space complexity is O(n), where n is the length of the input string `s`, as we use a stack to store opening parentheses.
