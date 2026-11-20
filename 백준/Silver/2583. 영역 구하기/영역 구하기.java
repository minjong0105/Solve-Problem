import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1 ,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[][] colored = new boolean[M][N];

        for (int k = 0; k < K; k++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int i = y1; i < y2; i++) {
                for (int j = x1; j < x2; j++) {
                    colored[i][j] = true;
                }
            }
        }

        boolean[][] visited = new boolean[M][N];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!colored[i][j] && !visited[i][j]) {
                    ans.add(bfs(i, j, M, N, colored, visited));
                }
            }
        }

        Collections.sort(ans);
        StringBuilder sb = new StringBuilder();
        sb.append(ans.size()).append('\n');
        for (int i : ans) {
            sb.append(i).append(' ');
        }

        System.out.println(sb.toString());
    }

    static int bfs(int sx, int sy, int M, int N, boolean[][] colored, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        int count = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            count++;

            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N) continue;
                if (colored[nx][ny] || visited[nx][ny]) continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
        return count;
    }
}