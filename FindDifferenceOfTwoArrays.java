

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Create two hash sets to store distinct elements from nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements from nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Initialize two lists to store elements that are in nums1 but not in nums2, and vice versa
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();
        
        // Iterate through nums1
        for (int num : nums1) {
            // If num is not present in set2, add it to answer1
            if (!set2.contains(num)) {
                answer1.add(num);
            }
        }
        
        // Iterate through nums2
        for (int num : nums2) {
            // If num is not present in set1, add it to answer2
            if (!set1.contains(num)) {
                answer2.add(num);
            }
        }
        
        // Remove duplicates from the lists
        answer1 = new ArrayList<>(new HashSet<>(answer1));
        answer2 = new ArrayList<>(new HashSet<>(answer2));
        
        // Return a list containing answer1 and answer2
        return Arrays.asList(answer1, answer2);
    }
}


    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();
        
        for (int num : nums1) {
            if (!set2.contains(num)) {
                answer1.add(num);
            }
        }
        
        for (int num : nums2) {
            if (!set1.contains(num)) {
                answer2.add(num);
            }
        }
        
        answer1 = new ArrayList<>(new HashSet<>(answer1));
        answer2 = new ArrayList<>(new HashSet<>(answer2));
        
        return Arrays.asList(answer1, answer2);
    }
}
