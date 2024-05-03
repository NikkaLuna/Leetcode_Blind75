
public boolean increasingTriplet(int[] nums) {
    
    int minNum = Integer.MAX_VALUE;
    int secondMinNum = Integer.MAX_VALUE;

    for (int num : nums) {
        
        if (num <= minNum) {
            minNum = num;
        }
        
        else if (num <= secondMinNum) {
            secondMinNum = num;
        }
        
        else {
            return true;
        }
    }

    return false;
}
