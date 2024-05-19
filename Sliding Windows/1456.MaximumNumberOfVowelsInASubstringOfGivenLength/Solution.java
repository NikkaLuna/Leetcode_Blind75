
public class Solution {

    public int maxVowels(String s, int k) {
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        int maxVowelCount = 0;
        int vowelCount = 0;
        
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
        }
        
        for (int i = k; i < s.length(); i++) {
            maxVowelCount = Math.max(maxVowelCount, vowelCount);
            
            if (vowels.contains(s.charAt(i - k))) {
                vowelCount--;
            }
            
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
        }
        
        maxVowelCount = Math.max(maxVowelCount, vowelCount);
        
        return maxVowelCount;
    }
}

