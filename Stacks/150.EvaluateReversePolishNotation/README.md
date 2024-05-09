# 150. Evaluate Reverse Polish Notation

## Problem Description
You are given an array of strings `tokens` that represents an arithmetic expression in Reverse Polish Notation.

Evaluate the expression and return an integer that represents the value of the expression.

Note:
- The valid operators are '+', '-', '*', and '/'.
- Each operand may be an integer or another expression.
- The division between two integers always truncates toward zero.
- There will not be any division by zero.
- The input represents a valid arithmetic expression in reverse polish notation.
- The answer and all the intermediate calculations can be represented in a 32-bit integer.

### Example
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

## Approach
- Use a stack to store operands while traversing the tokens.
- For each token:
  - If it is an operator ('+', '-', '*', '/'), pop two operands from the stack, perform the operation, and push the result back onto the stack.
  - If it is an operand, convert it to an integer and push it onto the stack.
- After processing all tokens, the final result will be at the top of the stack.

## Time Complexity
- The time complexity is O(n), where n is the number of tokens in the input array.

## Space Complexity
- The space complexity is O(n), where n is the number of tokens in the input array, as we use a stack to store operands.
