import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] board) {
        int n = board.length;
        
        int[][][] cost = new int[n][n][4];
        for (int[][] i : cost) {
            for (int[] j : i) {
                Arrays.fill(j, Integer.MAX_VALUE);
            }
        }
        
        Queue<int[]> q = new LinkedList<>();
        
        for (int d = 0; d < 4; d++) {
            cost[0][0][d] = 0;
            q.offer(new int[]{0, 0, d, 0});
        }
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], dir = cur[2], c = cur[3];
            
            for (int nd = 0; nd < 4; nd++) {
                int nx = x + dx[nd];
                int ny = y + dy[nd];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) continue;
                
                int newCost = 0;
                if (x == 0 && y == 0) {
                    newCost = c + 100;
                }
                else if (dir == nd) {
                    newCost = c + 100;
                }
                else {
                    newCost = c + 600;
                }
                
                if (newCost < cost[nx][ny][nd]) {
                    cost[nx][ny][nd] = newCost;
                    q.offer(new int[]{nx, ny, nd,newCost});
                }
            }
        }
        
        int ans = Integer.MAX_VALUE;
        for (int d = 0; d < 4; d++) {
            ans = Math.min(ans, cost[n - 1][n - 1][d]);
        }
        
        return ans;
    }
}