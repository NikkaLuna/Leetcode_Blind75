

class Solution {

    public String removeStars(String s) {

        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }

        return answer.reverse().toString();
    }
}
