class Solution {
    public String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        int multiplierStore = 0;
        

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                multiplierStore = multiplierStore * 10 + (ch - '0');
            }

            else if (Character.isLetter(ch)) {
                answer.append(ch);
            }

            else if (ch == '[') {
                numberStack.push(multiplierStore);
                multiplierStore = 0;
                stringStack.push(answer);
                answer = new StringBuilder();
            }

            else if (ch == ']') {
                StringBuilder temp = answer;
                answer = stringStack.pop();
                int count = numberStack.pop();

                while (count-- > 0) {
                    answer.append(temp);
                }
            }
        }

        return answer.toString();
    }
}


