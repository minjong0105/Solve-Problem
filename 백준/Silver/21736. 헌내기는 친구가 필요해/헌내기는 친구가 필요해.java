import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        visited = new boolean[N][M];
        int startX = -1, startY = -1;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'I') {
                    startX = j;
                    startY = i;
                }
            }
        }

        int ans = bfs(startY, startX);

        if (ans == 0)
            System.out.println("TT");
        else
            System.out.println(ans);
    }

    public static int bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { y, x });
        visited[y][x] = true;

        int cnt = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curY = cur[0];
            int curX = cur[1];

            if (arr[curY][curX] == 'P')
                cnt++;

            for (int i = 0; i < 4; i++) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];

                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < M && !visited[nextY][nextX]
                        && arr[nextY][nextX] != 'X') {
                    visited[nextY][nextX] = true;
                    q.offer(new int[] { nextY, nextX });
                }
            }
        }
        return cnt;
    }
}
