

public class Solution {
    public int largestAltitude(int[] gain) {
        
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int gainValue : gain) {
            currentAltitude += gainValue;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
}

