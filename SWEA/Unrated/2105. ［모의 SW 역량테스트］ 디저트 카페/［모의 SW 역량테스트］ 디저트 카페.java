import java.util.*;
import java.io.*;

public class Solution {
    static int N;
    static int[][] map;
    static boolean[] visited;
    static int maxDesserts;
    
    static int[] dx = {1, 1, -1, -1};
    static int[] dy = {1, -1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            maxDesserts = -1;


            for (int i = 0; i < N; i++) {  
                for (int j = 0; j < N; j++) {
                    visited = new boolean[101];
                    
                    visited[map[i][j]] = true;
                    
                    dfs(i, j, i, j, 0, 1);  
                }
            }

            System.out.println("#" + tc + " " + maxDesserts);
        }
    }
    
    // DFS
    public static void dfs(int x, int y, int startX, int startY, int dir, int count) {
        int nx = x + dx[dir];
        int ny = y + dy[dir];

        if (dir == 3 && nx == startX && ny == startY) {     
            maxDesserts = Math.max(maxDesserts, count);
            return;
        }

        if (nx < 0 || nx >= N || ny < 0 || ny >= N) {   
            return;
        }
        if (visited[map[nx][ny]]) {            
            return;
        }

        visited[map[nx][ny]] = true;
        
        dfs(nx, ny, startX, startY, dir, count + 1);    

        if (dir < 3) {                            
            dfs(nx, ny, startX, startY, dir + 1, count + 1);
        }
        
        visited[map[nx][ny]] = false;
    }
}