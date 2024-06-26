
public class Solution {
    
    public int compress(char[] chars) {

        int index = 0;
        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;

            } else {
                chars[index++] = chars[i];

                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[index++] = c;
                    }
                    
                }
                count = 1;
            }
        }
        return index;
    }
}

