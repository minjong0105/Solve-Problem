import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int n, m;
    boolean[][] visited;
    public int[] solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        
        visited = new boolean[n][m];
        
        List<Integer> island = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    island.add(dfs(i, j, maps));
                }
            }
        }
        
        if (island.isEmpty()) return new int[]{-1};
        
        Collections.sort(island);
        
        int[] answer = new int[island.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = island.get(i);
        }
        
        return answer;
    }
    
    int dfs(int x, int y, String[] maps) {
        visited[x][y] = true;
        int sum = maps[x].charAt(y) - '0';
        
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if (maps[nx].charAt(ny) == 'X') continue;
            if (visited[nx][ny]) continue;
            
            sum += dfs(nx, ny, maps);
        }
        return sum;
    }
}