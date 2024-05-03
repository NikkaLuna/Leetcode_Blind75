

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> numberCount = new HashSet<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int count : map.values()) {
            if (!numberCount.add(count)) {
                return false; 
            }
        }
        return true;
    }
}


    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> numberCount = new HashSet<>();
        
        // Count occurrences of each number in the array
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Check if the counts are unique
        for (int count : map.values()) {
            if (!numberCount.add(count)) {
                return false; // If count already exists in the set, it's not unique
            }
        }
        
        return true;
    }
}