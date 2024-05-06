public class Solution {

    public int evalRPN(String [] tokens)
    
        Stack<Integer> stack = new Stack<>();

        if(token.equals("+")) {
            stack.add(stack.pop() + stack.pop());
        }

        else if(token.equals("-")) {
            int a = stack.pop();
            int b = stack.pop();
            stack.add(b - a);
        }

        else if(token.equals("*")) {
            stack.add(stack.pop() * stack.pop());
        }

        else if(token.equals("/")) {
            int a = stack.pop();
            int b = stack.pop();
            stack.add(b / a);
        }

        else {
            stack.add(IntegerParse(token));
        }
    return stack.pop();
}
