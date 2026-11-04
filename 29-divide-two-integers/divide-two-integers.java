class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow edge case: Integer.MIN_VALUE / -1 = 2^31, which exceeds Integer.MAX_VALUE (2^31 - 1)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert parameters to long using Math.abs to prevent overflow during operations
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        // Perform bitwise division via exponential shifts
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;

            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            absDividend -= tempDivisor;
            result += multiple;
        }

        return negative ? -result : result;
    }
}