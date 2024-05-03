public class ReverseWords {
    
    public static String reverseWords(String s) {

        // Split the input string by one or more spaces
        String[] words = s.trim().split("\\s+"); 

        StringBuilder answer = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {

             // Append each word in reverse order
            answer.append(words[i]).append(" ");
        }
        
        // Convert StringBuilder to String and trim trailing spaces
        return answer.toString().trim(); 
    }
}
