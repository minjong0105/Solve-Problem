import java.io.*;
import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int m, n;
    public int[] solution(int m, int n, int[][] picture) {
        this.m = m;
        this.n = n;
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 0 || visited[i][j]) continue;
                
                numberOfArea++;
                int area = bfs(i, j, picture, visited);
                maxSizeOfOneArea = Math.max(area, maxSizeOfOneArea);
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    private int bfs(int sx, int sy, int[][] picture, boolean[][] visited) {
        int color = picture[sx][sy];
        int area = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            area++;
            
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if (nx < 0 || nx >= m || ny < 0 || ny >= n || visited[nx][ny] || picture[nx][ny] != color) continue;
                
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
        
        return area;
    }
}