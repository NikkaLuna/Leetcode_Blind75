# 1732. Find the Highest Altitude

## Problem Statement
There is a biker going on a road trip consisting of `n + 1` points at different altitudes. The biker starts his trip at point 0 with an altitude of 0. You are provided with an integer array `gain` of length `n`, where `gain[i]` represents the net gain (or loss) in altitude between points `i` and `i + 1` for all `(0 <= i < n)`. The task is to return the highest altitude reached during the trip.

## Examples

- **Example 1:**
  - Input: `gain = [-5,1,5,0,-7]`
  - Output: `1`
  - Explanation: Starting at altitude 0, the subsequent altitudes are `[0, -5, -4, 1, 1, -6]`. The highest altitude reached is `1`.

- **Example 2:**
  - Input: `gain = [-4,-3,-2,-1,4,3,2]`
  - Output: `0`
  - Explanation: Starting at altitude 0, the subsequent altitudes are `[0, -4, -7, -9, -10, -6, -3, -1]`. The highest altitude reached is `0`.

## Approach
1. **Initialize Variables:** Start with two variables, `maxAltitude` and `currentAltitude`, both set to 0 to represent the starting point.
2. **Iterate Through Gains:** For each value in the `gain` array, update the `currentAltitude` by adding the gain value to it.
3. **Update Maximum Altitude:** After updating the `currentAltitude`, compare it with `maxAltitude`. If `currentAltitude` is greater, update `maxAltitude`.
4. **Return Result:** Once all gains have been processed, return `maxAltitude` as the highest altitude reached during the trip.

## Complexity Analysis
- **Time Complexity:** O(n), where `n` is the length of the `gain` array. The algorithm requires a single pass through the `gain` array to calculate the altitudes and determine the maximum altitude.
- **Space Complexity:** O(1), as the algorithm uses a constant amount of extra space. The space used is for the variables `maxAltitude` and `currentAltitude`, and it does not scale with the size of the input array.

This solution efficiently calculates the highest altitude using straightforward variable updates within a single iteration over the input array, ensuring minimal computational overhead and optimal space usage.
