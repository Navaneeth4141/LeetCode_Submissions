import java.util.Arrays;

class Solution {
    // Helper class to store element details
    private static class Element {
        int val;
        int digitSum;
        int originalIndex;

        Element(int val, int digitSum, int originalIndex) {
            this.val = val;
            this.digitSum = digitSum;
            this.originalIndex = originalIndex;
        }
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Element[] arr = new Element[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Element(nums[i], getDigitSum(nums[i]), i);
        }

        // Sort elements by digit sum, then by value as tiebreaker
        Arrays.sort(arr, (a, b) -> {
            if (a.digitSum != b.digitSum) {
                return Integer.compare(a.digitSum, b.digitSum);
            }
            return Integer.compare(a.val, b.val);
        });

        // Find the minimum swaps using cycle detection
        boolean[] visited = new boolean[n];
        int totalSwaps = 0;

        for (int i = 0; i < n; i++) {
            // If already visited or already in the correct position, skip
            if (visited[i] || arr[i].originalIndex == i) {
                continue;
            }

            int cycleSize = 0;
            int curr = i;

            while (!visited[curr]) {
                visited[curr] = true;
                curr = arr[curr].originalIndex;
                cycleSize++;
            }

            if (cycleSize > 1) {
                totalSwaps += (cycleSize - 1);
            }
        }

        return totalSwaps;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}