import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static int[][] box;
    static Queue<int[]> queue = new LinkedList<>();
    // 상하좌우 이동
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로 (열)
        N = Integer.parseInt(st.nextToken()); // 세로 (행)

        box = new int[N][M];

        // 1. 토마토 정보 입력 및 초기 익은 토마토 큐에 추가
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // 2. BFS 실행
        bfs();

        // 3. 결과 확인
        int maxDay = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 익지 않은 토마토가 있다면
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                // 가장 늦게 익은 날짜 찾기
                maxDay = Math.max(maxDay, box[i][j]);
            }
        }
        
        // 처음 시작을 1로 했으므로 1을 빼줌
        System.out.println(maxDay - 1);
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];

            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];

                // 상자 범위 안에 있고, 아직 익지 않은 토마토라면
                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < M && box[nextY][nextX] == 0) {
                    // 토마토를 익게 하고, 날짜를 하루 증가시켜 저장
                    box[nextY][nextX] = box[y][x] + 1;
                    queue.offer(new int[]{nextY, nextX});
                }
            }
        }
    }
}