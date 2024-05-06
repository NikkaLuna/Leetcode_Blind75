

public class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {

                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;

                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }

                asteroid = 0;
                break;
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}


