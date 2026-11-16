import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1 ,1};
    
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        
        int rx = 0;
        int ry = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'R') {
                    rx = i;
                    ry = j;
                }
            }
        }
        
        int[][] dist = new int[n][m];
        for (int[] arr : dist) {
            Arrays.fill(arr, -1);
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{rx, ry});
        dist[rx][ry] = 0;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            if (board[x].charAt(y) == 'G') return dist[x][y];

            for (int d = 0; d < 4; d++) {
                int nx = x, ny = y;

                while (true) {
                    int tx = nx + dx[d], ty = ny + dy[d];
                    if (tx < 0 || tx >= n || ty < 0 || ty >= m) break;
                    if (board[tx].charAt(ty) == 'D') break;
                    nx = tx;
                    ny = ty;
                }

                if (dist[nx][ny] != -1) continue;

                dist[nx][ny] = dist[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}