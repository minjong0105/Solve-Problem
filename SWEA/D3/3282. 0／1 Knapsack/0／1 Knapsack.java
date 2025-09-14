import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] V = new int[N];
            int[] C = new int[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                V[i] = Integer.parseInt(st.nextToken());
                C[i] = Integer.parseInt(st.nextToken());
            }
            int[] dp = new int[K + 1];

            for (int i = 0; i < N; i++) {
                for (int j = K; j >= V[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - V[i]] + C[i]);
                }
            }

            sb.append("#").append(tc).append(" ").append(dp[K]).append('\n');
        }
        System.out.print(sb);
    }
}
