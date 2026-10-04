class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
           newArray[i] = nums[i];
           newArray[nums.length + i] = nums[nums.length - 1 - i];
        }
        return newArray;
    }
}