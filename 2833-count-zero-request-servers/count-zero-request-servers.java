import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = queries.length;
        int[][] indexedQueries = new int[m][2];
        for (int i = 0; i < m; i++) {
            indexedQueries[i][0] = queries[i];
            indexedQueries[i][1] = i;
        }
        
        Arrays.sort(indexedQueries, Comparator.comparingInt(a -> a[0]));
        
        Arrays.sort(logs, Comparator.comparingInt(a -> a[1]));
        
        int[] ans = new int[m];
        int[] serverFreq = new int[n + 1];
        int activeServers = 0;
        
        int logIndex = 0;
        int numLogs = logs.length;
        int windowLeft = 0; 
        
        for (int i = 0; i < m; i++) {
            int qTime = indexedQueries[i][0];
            int originalIdx = indexedQueries[i][1];
            
            int startTime = qTime - x;
            int endTime = qTime;
            
            while (logIndex < numLogs && logs[logIndex][1] <= endTime) {
                int serverId = logs[logIndex][0];
                if (serverFreq[serverId] == 0) {
                    activeServers++;
                }
                serverFreq[serverId]++;
                logIndex++;
            }
            
            while (windowLeft < numLogs && logs[windowLeft][1] < startTime) {
                int serverId = logs[windowLeft][0];
                serverFreq[serverId]--;
                if (serverFreq[serverId] == 0) {
                    activeServers--;
                }
                windowLeft++;
            }
            
            ans[originalIdx] = n - activeServers;
        }
        
        return ans;
    }
}