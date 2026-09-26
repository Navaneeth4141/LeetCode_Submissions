class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            int sum = 0;
            for(int i = 0; i < word.length(); i++) {
                sum += weights[word.charAt(i) - 'a'];
            }
            int mappedIndex = sum % 26;
            char mappedChar = (char)('z' - mappedIndex);
            sb.append(mappedChar);
        }
        return sb.toString();
    }
}