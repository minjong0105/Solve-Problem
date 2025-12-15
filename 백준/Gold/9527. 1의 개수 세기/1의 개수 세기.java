import java.io.*;
import java.util.*;

public class Main {
    static long[] dp = new long[60];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        dp[0] = 0;
        for (int i = 1; i < 60; i++) {
            dp[i] = dp[i - 1] * 2 + (1L << (i - 1));
        }

        long ans = fx(B) - fx(A - 1);

        System.out.println(ans);
    }

    static long fx(long N) {
        if (N <= 0) {
            return 0;
        }

        long k = 0;
        while ((1L << (k + 1)) <= N) {
            k++;
        }

        long tk = 1L << k;

        long count = dp[(int) k];

        count += (N - tk + 1);

        count += fx(N - tk);

        return count;
    }
}
