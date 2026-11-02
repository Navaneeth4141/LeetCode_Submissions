class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        
        int fullWeeksTotal = 28 * weeks + 7 * (weeks * (weeks - 1)) / 2;
        int extraDaysTotal = days * weeks + (days * (days + 1)) / 2;
        
        return fullWeeksTotal + extraDaysTotal;
    }
}