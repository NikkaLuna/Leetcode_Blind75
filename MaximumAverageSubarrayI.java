
public double findMaxAverage(int[] nums, int k) {

    int currentSum = 0;

    for (int i = 0; i < k; i++) {  
        currentSum += nums[i];
    }


    int maxSum = currentSum;

    for (int i = k; i < nums.length; i++) {
        currentSum += nums[i] - nums[i - k];
        maxSum = Math.max(maxSum, currentSum);
    }

    return (double) maxSum / k;
}




public double findMaxAverage(int[] nums, int k) {

    int currentSum = 0;

    for (int i = 0; i < k; i++) {  //Initializes the first window and adds its elements up to 'k', this loop is executed only one time before proceeding
        currentSum += nums[i];
    }


    int maxSum = currentSum;

    for (int i = k; i < nums.length; i++) {  // Loops through the array starting from the k-th element
        currentSum += nums[i] - nums[i - k]; // Updates currentSum by subtracting the element k positions behind the current one and adding the current element
        maxSum = Math.max(maxSum, currentSum); // Initializes maxSum with the value of currentSum
    }

    return (double) maxSum / k;
}