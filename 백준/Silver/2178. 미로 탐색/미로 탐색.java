import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int N, M;
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(arr[N - 1][M - 1]);
    }

    public static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { x, y });
        visited[y][x] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curY = cur[0];
            int curX = cur[1];

            for (int i = 0; i < 4; i++) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];

                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < M
                        && !visited[nextY][nextX] && arr[nextY][nextX] == 1) {
                    visited[nextY][nextX] = true;
                    arr[nextY][nextX] = arr[curY][curX] + 1;
                    q.offer(new int[] { nextY, nextX });
                }
            }
        }
    }
}
