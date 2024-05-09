# 155. Min Stack

## Problem Description
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

- MinStack() initializes the stack object.
- void push(int val) pushes the element val onto the stack.
- void pop() removes the element on the top of the stack.
- int top() gets the top element of the stack.
- int getMin() retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.

### Example
Input:
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output:
[null,null,null,null,-3,null,0,-2]

Explanation:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top(); // return 0
minStack.getMin(); // return -2

## Approach
- We use a stack of pairs to store both the current element and the minimum element seen so far.
- When pushing a new element onto the stack, we compare it with the current minimum element and store the smaller one.
- When popping an element, we simply remove the top element from the stack.
- For getting the minimum element, we retrieve the minimum value stored in the pair at the top of the stack.

## Time Complexity
- The time complexity for all operations (push, pop, top, and getMin) is O(1) because we perform constant-time operations for each function.

## Space Complexity
- The space complexity is O(n), where n is the number of elements stored in the stack.
