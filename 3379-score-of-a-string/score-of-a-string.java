class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            int diff = Math.abs(c - s.charAt(i+1));
            score += diff;
        }
        return score;
    }
}