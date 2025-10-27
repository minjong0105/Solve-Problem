import java.util.*;
import java.io.*;

public class Main {
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };
    static int[][] arr;
    static boolean[][] visited;
    static int max = 0;
    static int N, M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, arr[i][j]);
                visited[i][j] = false;

                fxxk(i, j);
            }
        }

        System.out.println(max);
    }

    public static void dfs(int r, int c, int d, int sum) {
        if (d == 4) {
            max = Math.max(sum, max);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nr = r + dy[i];
            int nc = c + dx[i];

            if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc]) {
                visited[nr][nc] = true;
                dfs(nr, nc, d + 1, sum + arr[nr][nc]);
                visited[nr][nc] = false;
            }
        }
    }

    public static void fxxk(int r, int c) {
        for (int i = 0; i < 4; i++) {
            int nr = r + dy[i];
            int nc = c + dx[i];

            int sum = 0;

            if (i == 0 || i == 1) { // ㅗ, ㅜ
                if (nr >= 0 && nr < N && nc - 1 >= 0 && nc + 1 < M) {
                    sum = arr[r][c] + arr[nr][nc] + arr[nr][nc - 1] + arr[nr][nc + 1];
                }
            } else if (i == 2 || i == 3) { // ㅓ, ㅏ
                if (nc >= 0 && nc < M && nr - 1 >= 0 && nr + 1 < N) {
                    sum = arr[r][c] + arr[nr][nc] + arr[nr - 1][nc] + arr[nr + 1][nc];
                }
            }
            max = Math.max(max, sum);
        }
    }
}
