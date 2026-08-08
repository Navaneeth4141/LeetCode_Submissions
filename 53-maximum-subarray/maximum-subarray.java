class Solution{
    public int maxSubArray(int[] nums){
        int maxSoFar = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int x : nums){
            currentSum += x;
            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSoFar;
    }
}