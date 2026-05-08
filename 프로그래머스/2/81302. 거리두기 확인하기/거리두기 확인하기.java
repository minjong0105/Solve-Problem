import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i = 0; i < 5; i++) {
            if(check(places[i])) answer[i] = 1;
            else answer[i] = 0;
        }
        
        return answer;
    }
    
    private boolean check(String[] place) {
        for(int y = 0; y <= 4; y++) {
            for(int x = 0; x <= 4; x++) {
                if(place[y].charAt(x) == 'P'){
                    if(!bfs(y, x, place))
                        return false;
                }
            }
        }
        return true;
    }
    
    private boolean bfs(int y, int x, String[] place) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{y, x, 0});
        boolean[][] visited = new boolean[5][5];
        visited[y][x] = true;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int cy = cur[0];
            int cx = cur[1];
            
            if(cur[2] >= 2) continue;
            
            for(int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];
                
                if(ny >= 0 && ny < 5 && nx >= 0 && nx < 5 && !visited[ny][nx]){
                    if(place[ny].charAt(nx) == 'X') continue;
                    
                    if(place[ny].charAt(nx) == 'O') {
                        visited[ny][nx] = true;
                        q.offer(new int[]{ny, nx, cur[2] + 1});
                    }
                    
                    if(place[ny].charAt(nx) == 'P') return false;
                }
            }
        }
        return true;
    }
}