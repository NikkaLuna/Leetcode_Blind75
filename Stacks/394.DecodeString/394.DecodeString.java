class Solution {
    
    public String decodeString(String s) {

        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');

            } else if (ch == '[') {
                counts.push(count);
                strings.push(currentString);
                currentString = new StringBuilder();
                count = 0;

            } else if (ch == ']') {
                StringBuilder temp = currentString;
                currentString = strings.pop();
                int repeatTimes = counts.pop();

                for (int i = 0; i < repeatTimes; i++) {
                    currentString.append(temp);
                }
                
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}

