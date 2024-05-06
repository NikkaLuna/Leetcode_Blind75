


    public class Solution {

        public String reverseVowels(String s) {
    
            char[] chars = s.toCharArray();
    
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    
            int l = 0;
            int r = chars.length - 1;
    
            while (l < r) {
    
                while (l < r && !vowels.contains(chars[l])) {
                    l++;
    
                }
                while (l < r && !vowels.contains(chars[r])) {
                    r--;
    
                }
                if (l < r) {
                    char temp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = temp;
                    l++;
                    r--;
                }
                
            }
            return new String(chars);
        }
    }
    