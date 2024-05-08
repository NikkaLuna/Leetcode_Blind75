# 649. Dota2 Senate

## Problem Description

In the world of Dota2, there are two parties: the Radiant and the Dire. The Dota2 senate consists of senators coming from these two parties. The Senate wants to decide on a change in the Dota2 game, and the voting for this change is a round-based procedure. In each round, each senator can exercise one of two rights:

- Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
- Announce the victory: If a senator finds that the senators who still have rights to vote are all from the same party, he can announce the victory and decide on the change in the game.

Given a string `senate` representing each senator's party belonging, the task is to predict which party will finally announce the victory and change the Dota2 game.

## Example

- Input: `senate = "RD"`
  Output: "Radiant"
  Explanation: 
  - The first senator comes from Radiant and he can just ban the next senator's right in round 1. 
  - The second senator can't exercise any rights anymore since his right has been banned. 
  - In round 2, the first senator can just announce the victory since he is the only one who can vote.

## Approach

1. Create two queues: `queueRadiant` and `queueDire`, to keep track of senators from the Radiant and Dire parties, respectively.
2. Go through each senator in the input string `senate`. If a senator belongs to the Radiant party (marked with 'R'), add their index to the `queueRadiant`; otherwise, if they belong to the Dire party (marked with 'D'), add their index to the `queueDire`.
3. Simulate the voting process by repeating the following steps until one of the queues becomes empty:
   - Remove the index of the next senator from the front of both `queueRadiant` and `queueDire`.
   - Compare the indices of the next senators from both parties. The senator with the smaller index bans the other senator from voting, and their index is added to the end of their party's queue.
4. Once the simulation is complete, determine the winning party by comparing the sizes of `queueRadiant` and `queueDire`. If `queueRadiant` is larger than `queueDire`, declare "Radiant" as the winning party; otherwise, declare "Dire" as the winning party.

## Complexity Analysis

- **Time Complexity:** O(n), where n is the length of the input string `senate`. We iterate through the string once to populate the queues and then simulate the voting process, which takes linear time.
- **Space Complexity:** O(n). We use two queues to store the indices of senators, which can potentially hold all senators from the input string. Additionally, we use a constant amount of extra space for variables like length, q1, and q2, which do not grow with the size of the input.


