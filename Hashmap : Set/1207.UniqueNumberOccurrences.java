

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
