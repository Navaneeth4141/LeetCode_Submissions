class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Since IDs are between 1 and n
        boolean[] isFriend = new boolean[order.length + 1];
        for (int id : friends) {
            isFriend[id] = true;
        }
        int[] result = new int[friends.length];
        int idx = 0;
        for (int id : order) {
            if (isFriend[id]) {
                result[idx++] = id;
            }
        }
        return result;
    }
}