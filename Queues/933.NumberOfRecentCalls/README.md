# 933. Number of Recent Calls

## Problem Description
You have a RecentCounter class which counts the number of recent requests within a certain time frame. Implement the RecentCounter class, which initializes the counter with zero recent requests and has a method `int ping(int t)` to add a new request at time `t` (where `t` represents some time in milliseconds) and returns the number of requests that have happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range `[t - 3000, t]`. It is guaranteed that every call to `ping` uses a strictly larger value of `t` than the previous call.

### Example
Input:
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]

Output:
[null, 1, 2, 3, 3]

Explanation:
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1); // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100); // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001); // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002); // requests = [1, 100, 3001, 3002], range is [2,3002], return 3

## Approach
- Use a queue to store incoming requests.
- When a new ping happens, add the time to the queue.
- Remove any requests that fall outside the 3000 milliseconds window.
- Return the size of the queue (which will give the number of recent requests).

## Time Complexity
- The `ping(int t)` method performs the following operations:
  - Adding a timestamp to the queue: O(1) operation.
  - Removing timestamps from the queue until finding the timestamp within the range `[t - 3000, t]`: At most, it iterates through all the timestamps that are older than `t - 3000`. In the worst case, this operation has a time complexity of O(n), where n is the number of timestamps older than `t - 3000`. However, since each timestamp is removed from the queue at most once, and each insertion and removal operation on the queue takes O(1) time, the amortized time complexity for removing timestamps within the range is O(1). Therefore, the overall time complexity of the `ping(int t)` method is O(1).

## Space Complexity
- We use a Queue to store timestamps of recent requests. The space used by the queue grows linearly with the number of recent requests within the past 3000 milliseconds.
- In the worst case, when every request falls within the past 3000 milliseconds, the space complexity is O(n), where n is the number of requests stored in the queue.
- Therefore, the overall space complexity is O(n), where n is the number of recent requests within the past 3000 milliseconds.
