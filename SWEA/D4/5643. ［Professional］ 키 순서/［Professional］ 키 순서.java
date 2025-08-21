import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            boolean[][] graph = new boolean[N + 1][N + 1];
            for (int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a][b] = true;
            }

            for (int k = 1; k <= N; k++) {
                for (int i = 1; i <= N; i++) {
                    if(!graph[i][k]) continue;
                    for (int j = 1; j <= N; j++) {
                        if (graph[k][j]) {
                            graph[i][j] = true;
                        }
                    }
                }
            }

            int ans = 0;
            for (int i = 1; i <= N; i++) {
                int count = 0;
                for (int j = 1; j <= N; j++) {
                    if (i == j)
                        continue;
                    if (graph[i][j] || graph[j][i]) {
                        count++;
                    }
                }
                if (count == N - 1) {
                    ans++;
                }
            }

            System.out.println("#" + tc + " " + ans);
        }
    }
}
