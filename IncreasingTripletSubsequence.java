
public boolean increasingTriplet(int[] nums) {
    int minNum = Integer.MAX_VALUE;
    int secondMinNum = Integer.MAX_VALUE;

    for (int num : nums) {
        // Update the minimum number
        if (num <= minNum) {
            minNum = num;
        }
        // Update the second minimum number
        else if (num <= secondMinNum) {
            secondMinNum = num;
        }
        // If we find a number greater than both min and secondMin, we have found a triplet
        else {
            return true;
        }
    }

    return false;
}
