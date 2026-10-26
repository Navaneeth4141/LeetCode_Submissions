class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                leftSum[i] += nums[j];
            }
            for(int j = i + 1; j < nums.length; j++) {
                rightSum[i] += nums[j];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}