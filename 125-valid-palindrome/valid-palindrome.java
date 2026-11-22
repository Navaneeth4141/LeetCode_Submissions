class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String converted = toString(s);
        for(int i = converted.length() - 1; i >= 0; i--) {
            char c = converted.charAt(i);
            sb.append(c);
        }
        String reverse = sb.toString();
        if(converted.equals(reverse)) {
            return true;
        }
        return false;
    }

    public String toString (String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().toLowerCase();
    }
}