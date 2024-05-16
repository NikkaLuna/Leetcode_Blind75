
class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int currentDay = 0; currentDay < temperatures.length; currentDay++) {
            int currentTemp = temperatures[currentDay];

            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                int previousDay = stack.pop();
                answer[previousDay] = currentDay - previousDay;
            }
            
            stack.push(currentDay);
        }
        
        return answer;
    }
}
