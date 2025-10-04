import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static char[][] g;
    static boolean[][] visited;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        g = new char[N][N];
        for (int i = 0; i < N; i++) {
            g[i] = br.readLine().toCharArray();
        }

        // 일반인일 때
        int ans1 = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, false);
                    ans1++;
                }
            }
        }

        // 색맹일 때
        int ans2 = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, true);
                    ans2++;
                }
            }
        }

        System.out.println(ans1 + " " + ans2);
    }

    public static void bfs(int y, int x, boolean color) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { y, x });
        visited[y][x] = true;
        char start = g[y][x];

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curY = cur[0];
            int curX = cur[1];

            for (int i = 0; i < 4; i++) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];

                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= N || visited[nextY][nextX]) {
                    continue;
                }

                char nextColor = g[nextY][nextX];
                boolean area = false;

                // 색맹
                if (color) {
                    // R, G를 같은색
                    if (start == 'R' || start == 'G') {
                        if (nextColor == 'R' || nextColor == 'G')
                            area = true;
                    } else { // 시작 색이 B일 때
                        if (nextColor == 'B')
                            area = true;
                    }
                } else { // 일반인
                    if (start == nextColor)
                        area = true;
                }

                if (area) {
                    visited[nextY][nextX] = true;
                    q.offer(new int[] { nextY, nextX });
                }
            }
        }
    }
}
