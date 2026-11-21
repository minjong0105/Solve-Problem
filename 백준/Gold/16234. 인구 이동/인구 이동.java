import java.io.*;
import java.util.*;

public class Main {
    static int N, L, R;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        while (true) {
            boolean move = false;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[i][j]) continue;
                    if (bfs(i, j)) move = true;
                }
            }

            if (!move) break;
            ans++;
        }

        System.out.println(ans);
    }

    static boolean bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();
        List<int[]> list = new LinkedList<>();
        list.add(new int[]{sx, sy});
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        int sum = map[sx][sy];

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if (visited[nx][ny]) continue;

                int diff = Math.abs(map[nx][ny] - map[x][y]);
                if (diff < L || diff > R) continue;

                visited[nx][ny] = true;
                list.add(new int[]{nx, ny});
                q.offer(new int[]{nx, ny});

                sum += map[nx][ny];
            }
        }
        if (list.size() == 1) return false;

        int avg = sum / list.size();
        for (int[] l : list) {
            map[l[0]][l[1]] = avg;
        }

        return true;
    }
}