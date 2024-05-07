
# Problem: 217. Contains Duplicate

## Description
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

### Examples
1. **Input:** `nums = [1, 2, 3, 1]`  
   **Output:** `true`

2. **Input:** `nums = [1, 2, 3, 4]`  
   **Output:** `false`

3. **Input:** `nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]`  
   **Output:** `true`

## Approach
The solution uses a **Set** data structure, which maintains unique elements and is perfect for detecting duplicates.

### Steps Taken
1. **Initialize a Set:**  
   Create an empty set to hold unique integers from the array.

2. **Iterate Over the Array:**  
   Loop through each element in the input array `nums`.

3. **Check for Duplicates:**
   - For each number:
     - If the number already exists in the set, return `true` (indicating a duplicate is found).
     - Otherwise, add the number to the set.

4. **Return Result:**  
   If no duplicates are found after the loop completes, return `false`.

## Complexity Analysis

### Time Complexity
- **O(n):**  
  The algorithm iterates through each element in the array once. Each `contains` and `add` operation in a set generally runs in constant time `O(1)`, due to its hash-based implementation. Thus, the overall complexity is proportional to `n`, the number of elements in the input array.

### Space Complexity
- **O(n):**  
  The set may need to store all unique elements, which means the space required is proportional to the number of elements `n` in the input array.

### Conclusion
This approach efficiently identifies duplicates in linear time using extra space proportional to the input size. The trade-off between time and space is optimal for duplicate detection.
