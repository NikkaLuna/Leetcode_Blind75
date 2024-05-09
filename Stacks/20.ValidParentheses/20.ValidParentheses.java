
public class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');

        Set<Character> openPar = new HashSet<>();
        openPar.add('(');
        openPar.add('[');
        openPar.add('{');

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (openPar.contains(ch)) {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == bracketMap.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

