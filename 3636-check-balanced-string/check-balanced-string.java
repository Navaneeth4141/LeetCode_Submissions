class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < num.length(); i += 2) {
            char c = num.charAt(i);
            evenSum = evenSum + (c - '0');
        }
        for(int i = 1; i < num.length(); i += 2) {
            char c = num.charAt(i);
            oddSum = oddSum + (c - '0');
        }
        if(evenSum == oddSum) {
            return true;
        } else {
            return false;
        }
    }
}