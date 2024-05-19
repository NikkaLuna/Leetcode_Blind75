### Asteroid Collision

#### Problem Description
We are given an array `asteroids` of integers representing asteroids in a row. For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed. Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

#### Approach
1. **Stack Utilization**: Use a Stack<Integer> to simulate asteroid movements and manage collisions.
2. **Collision Detection and Resolution**: Within a loop iterating through the asteroids array, check for collisions between left-moving (negative) and right-moving (positive) asteroids at the top of the stack.
3. **Result Compilation**: Compile surviving asteroids into an array in reverse order from the stack, ensuring the original sequence is maintained, and return as the final result.

#### Space Complexity
The space complexity is O(n), where n is the number of asteroids in the input array. This is due to the space used by the Stack<Integer> data structure, which can potentially hold all the asteroids in the worst-case scenario where no collisions occur. Additionally, the space required for the output array is also proportional to the number of surviving asteroids.

#### Time Complexity
The time complexity of the provided asteroidCollision method is O(n), where n is the number of asteroids in the input array. This is because the algorithm iterates through each asteroid exactly once.

#### Example
- Input: asteroids = [5,10,-5]
  - Output: [5,10]
  - Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
- Input: asteroids = [8,-8]
  - Output: []
  - Explanation: The 8 and -8 collide exploding each other.