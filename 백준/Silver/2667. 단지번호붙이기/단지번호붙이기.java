import java.util.*;
import java.util.concurrent.LinkedTransferQueue;
import java.io.*;

public class Main {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static int[][] arr;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        int cnt = 0;
        List<Integer> ans = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    ans.add(bfs(i, j));
                }
            }
        }

        Collections.sort(ans);
        System.out.println(cnt);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { y, x });
        visited[y][x] = true;
        int cnt = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cy = cur[0];
            int cx = cur[1];

            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];
                if (ny < N && ny >= 0 && nx < N && nx >= 0 && arr[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    q.offer(new int[] { ny, nx });
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
