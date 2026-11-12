import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] visited = new int[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = 1;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            
            int x = cur[0];
            int y = cur[1];
            
            if (x == n - 1 && y == m - 1) {
                return visited[x][y];
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || nx >= n|| ny < 0 || ny >= m || maps[nx][ny] == 0 || visited[nx][ny] != 0) continue;
                
                visited[nx][ny] = visited[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}