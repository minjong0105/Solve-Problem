import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][1] % MOD;

            dp[i][9] = dp[i - 1][8] % MOD;

            for (int j = 1; j <= 8; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + dp[N][i]) % MOD;
        }

        System.out.println(sum);
    }
}
