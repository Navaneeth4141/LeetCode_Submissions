import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (num < 10) {
                result.add(num);
            } else {
                List<Integer> digits = new ArrayList<>();
                int temp = num;
                while (temp > 0) {
                    digits.add(temp % 10);
                    temp /= 10;
                }
                for (int i = digits.size() - 1; i >= 0; i--) {
                    result.add(digits.get(i));
                }
            }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}