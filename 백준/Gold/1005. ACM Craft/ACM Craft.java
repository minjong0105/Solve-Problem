import java.io.*;
import java.util.*;

public class Main {
    static int N, K, W;
    static int[] D;
    static int[] dp;
    static int[] need;
    static ArrayList<Integer>[] adj;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            D = new int[N + 1];
            dp = new int[N + 1];
            need = new int[N + 1];
            adj = new ArrayList[N + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                D[i] = Integer.parseInt(st.nextToken());
                adj[i] = new ArrayList<>();
            }

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                adj[X].add(Y);
                need[Y]++;
            }

            W = Integer.parseInt(br.readLine());

            fx();

            sb.append(dp[W]).append('\n');
        }

        System.out.println(sb);
    }

    static void fx() {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            dp[i] = D[i];

            if (need[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == W) {
                return;
            }

            for (int next : adj[cur]) {
                dp[next] = Math.max(dp[next], dp[cur] + D[next]);

                need[next]--;

                if (need[next] == 0) {
                    q.add(next);
                }
            }
        }
    }
}
