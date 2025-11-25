import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[] dp = new int[T + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            int K = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            for (int t = T; t > 0; t--) {
                if (t - K < 0)
                    continue;
                dp[t] = Math.max(dp[t], dp[t - K] + S);
            }
        }

        System.out.println(dp[T]);
    }
}
