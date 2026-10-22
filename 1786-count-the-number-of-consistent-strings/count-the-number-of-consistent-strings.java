class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        int count = 0;
        for(char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }
        for(String word : words) {
            boolean isConsistent = true;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(!isAllowed[c - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) count++;
        }
        return count;
    }
}