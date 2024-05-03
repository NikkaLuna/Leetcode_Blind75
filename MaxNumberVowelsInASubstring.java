
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




public class Solution {
    public int maxVowels(String s, int k) {
        // Define the set of vowel letters
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        int maxVowelCount = 0; // Maximum count of vowels in any substring of length k
        int vowelCount = 0; // Count of vowels in the current window
        
        // Initialize the window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
        }
        
        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            // Update maxVowelCount if the current window has more vowels
            maxVowelCount = Math.max(maxVowelCount, vowelCount);
            
            // Remove the leftmost character from the window
            if (vowels.contains(s.charAt(i - k))) {
                vowelCount--;
            }
            
            // Add the rightmost character to the window
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
        }
        
        // Update maxVowelCount one last time (for the last window)
        maxVowelCount = Math.max(maxVowelCount, vowelCount);
        
        return maxVowelCount;
    }
}
