class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 10) {
                continue;
            } else if (nums[i] == 10) {
                nums[i] = 1;
            } else {
                nums[i] = toSingle(nums[i]);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
        }
        return min;
    }
    public int toSingle(int num) {
        int sum = 0;
        while(num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}