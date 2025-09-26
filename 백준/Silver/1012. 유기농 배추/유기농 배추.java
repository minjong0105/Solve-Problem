import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N, K;
    static int[][] field;
    static boolean[][] visited;
    // 상하좌우 이동을 위한 배열
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로 길이 (열)
            N = Integer.parseInt(st.nextToken()); // 세로 길이 (행)
            K = Integer.parseInt(st.nextToken()); // 배추 개수

            field = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); // 열
                int y = Integer.parseInt(st.nextToken()); // 행
                field[y][x] = 1;
            }

            int wormCount = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 배추가 있고 아직 방문하지 않았다면
                    if (field[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        wormCount++;
                    }
                }
            }
            System.out.println(wormCount);
        }
    }

    public static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y, x});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curY = current[0];
            int curX = current[1];

            for (int i = 0; i < 4; i++) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];

                // 밭 범위 안에 있고, 아직 방문하지 않은 배추라면
                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < M &&
                    !visited[nextY][nextX] && field[nextY][nextX] == 1) {
                    
                    visited[nextY][nextX] = true;
                    queue.offer(new int[]{nextY, nextX});
                }
            }
        }
    }
}