class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        for(int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder();
            String word = array[i];
            for(int j = word.length() - 1; j >= 0; j--) {
                sb.append(word.charAt(j));
            }
            array[i] = sb.toString();
        }
        return String.join(" ", array);
    }
}