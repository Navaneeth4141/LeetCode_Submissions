class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magzine = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magzine[c - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            magzine[c - 'a']--;

            if(magzine[c - 'a'] < 0) return false;
        }
        return true;
    }
}