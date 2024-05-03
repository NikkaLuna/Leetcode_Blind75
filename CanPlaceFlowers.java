public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            
            // Check if the current plot is empty
            if (flowerbed[i] == 0 

             //If the current plot is the first plot in the flowerbed and previous plot is empty
            && (i == 0 || flowerbed[i - 1] == 0)

            //if the current plot is the last plot in the flowerbed & the next plot after the current plot is empty.
            && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                
                // Plant a flower and increment count
                flowerbed[i] = 1; 
                count++;
            }
        }
        return count >= n;
    }
}
