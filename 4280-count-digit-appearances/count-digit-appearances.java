class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] > 0) {
                int last = nums[i] % 10;
                if(digit == last) count++;
                nums[i] /= 10;
            }
        }
        return count;
    }
}