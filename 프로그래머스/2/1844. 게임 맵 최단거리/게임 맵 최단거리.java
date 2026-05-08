import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] visited = new int[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = 1;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];
            
            if(y == n - 1 && x == m - 1) {
                return visited[y][x];
            }
            
            for(int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                
                if(ny >= 0 && ny < n && nx >= 0 && nx < m && maps[ny][nx] == 1 && visited[ny][nx] == 0) {
                    visited[ny][nx] = visited[y][x] + 1;
                    q.offer(new int[]{ny, nx});
                }
            }
        }
        
        return -1;
    }
}