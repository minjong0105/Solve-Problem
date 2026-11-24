import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];

        S = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(min);
    }

    static void dfs(int idx, int depth) {
        if (depth == N / 2) {
            int start = 0;
            int link = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) continue;

                    if (visited[i] && visited[j]) {
                        start += S[i][j];
                    }
                    else if (!visited[i] && !visited[j]) {
                        link += S[i][j];
                    }

                }
            }
            min = Math.min(min, Math.abs(start - link));
            return;
        }

        for (int i = idx; i < N; i++) {
            visited[i] = true;
            dfs(i + 1, depth + 1);
            visited[i] = false;
        }
    }
}