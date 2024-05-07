# Problem: 1. Two Sum

## Description
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`. Each input is guaranteed to have exactly one solution, and you cannot use the same element twice. You can return the answer in any order.

### Examples
1. **Example 1:**  
   **Input:** `nums = [2, 7, 11, 15]`, `target = 9`  
   **Output:** `[0, 1]`  
   **Explanation:** `nums[0]` (2) and `nums[1]` (7) add up to `9`, so the output is `[0, 1]`.

2. **Example 2:**  
   **Input:** `nums = [3, 2, 4]`, `target = 6`  
   **Output:** `[1, 2]`  
   **Explanation:** `nums[1]` (2) and `nums[2]` (4) add up to `6`, so the output is `[1, 2]`.

## Approach
To solve this problem efficiently, we use a **hash map** (dictionary). The approach leverages the map's ability to quickly check for the existence of values and associates each number with its index.

### Steps Taken
1. **Initialize a Hash Map:**  
   Create a map to store each number and its index.

2. **Iterate Over the Array:**  
   Loop through the `nums` array, and for each element:
   - Calculate the difference (`diff`) between the `target` and the current number.
   - Check if `diff` exists in the map. If yes, a valid pair is found, so return the current index and the stored index.
   - Otherwise, store the current number and its index in the map for future comparisons.

3. **Edge Case Handling:**  
   The problem guarantees a solution exists, so we don't need explicit checks for no-solution scenarios.

## Complexity Analysis

### Time Complexity
- **O(n):**  
  We iterate through the array once, making the time complexity linear in relation to the input size `n`.

### Space Complexity
- **O(n):**  
  The hash map stores all elements, so its space complexity is also linear (`O(n)`), where `n` is the number of elements in the input array.

## Conclusion
This hash map-based approach allows us to identify pairs that sum up to the target in linear time, making it both efficient and suitable for this problem's constraints.
