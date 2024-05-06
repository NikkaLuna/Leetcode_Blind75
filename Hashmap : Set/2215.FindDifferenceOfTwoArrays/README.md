# 2215. Find the Difference of Two Arrays

## Problem Statement
Given two 0-indexed integer arrays `nums1` and `nums2`, return a list `answer` of size 2 where:
- `answer[0]` is a list of all distinct integers in `nums1` which are not present in `nums2`.
- `answer[1]` is a list of all distinct integers in `nums2` which are not present in `nums1`.

The integers in the lists may be returned in any order.

## Examples

- **Example 1:**
  - Input: `nums1 = [1,2,3], nums2 = [2,4,6]`
  - Output: `[[1,3],[4,6]]`
  - Explanation:
    - For `nums1`, `nums1[1] = 2` is present in `nums2`, whereas `nums1[0] = 1` and `nums1[2] = 3` are not present in `nums2`. Therefore, `answer[0]` = `[1,3]`.
    - For `nums2`, `nums2[0] = 2` is present in `nums1`, whereas `nums2[1] = 4` and `nums2[2] = 6` are not present in `nums1`. Therefore, `answer[1]` = `[4,6]`.

## Approach
1. **Initialize Sets:** Create two sets, `set1` and `set2`, to store distinct integers from `nums1` and `nums2` respectively. This ensures that all numbers are unique.
2. **Populate Sets:** Iterate through `nums1` and `nums2`, adding each integer to its corresponding set.
3. **Initialize Result Lists:** Create two lists, `answer1` and `answer2`, to store integers that are present in one array but not in the other.
4. **Determine Differences:** 
   - For `nums1`, add integers to `answer1` if they are not present in `set2`.
   - For `nums2`, add integers to `answer2` if they are not present in `set1`.
5. **Return Results:** Combine `answer1` and `answer2` into a single list and return it.

## Complexity Analysis
- **Time Complexity:** O(N+M), where `N` is the length of `nums1` and `M` is the length of `nums2`. This complexity arises because each array is iterated through twice—once for adding elements to the sets and once for comparing elements.
- **Space Complexity:** O(N+M), to accommodate the space needed for the two sets and the two result lists. The sets contain unique elements from each array, and the result lists store distinct differences.

This problem uses sets for efficient lookup and uniqueness, and lists to collect and return the final results. The approach ensures that we only consider distinct elements and efficiently find differences between the two arrays.
