import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int n, m;
    
    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        
        int[] start = new int[]{0, 0};
        int[] lever = new int[]{0, 0};
        int[] end = new int[]{0, 0};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                
                if (c == 'S') {
                    start = new int[]{i, j};
                } else if (c == 'L') {
                    lever = new int[]{i, j};
                } else if (c == 'E') {
                    end = new int[]{i, j};
                }
            }
        }
        
        int first = bfs(start, lever, maps);
        if (first == -1) return -1;
        
        int second = bfs(lever, end, maps);
        if (second == -1) return -1;
        
        return first + second;
    }
    
    int bfs(int[] start, int[] end, String[] maps) {
        int[][] d = new int[n][m];
        
        for (int[] row : d) {
            Arrays.fill(row, -1);
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        d[start[0]][start[1]] = 0;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            if (x == end[0] && y == end[1]) return d[x][y];
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (maps[nx].charAt(ny) == 'X') continue;
                if (d[nx][ny] != -1) continue;
                
                d[nx][ny] = d[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        
        return -1;
    }
}