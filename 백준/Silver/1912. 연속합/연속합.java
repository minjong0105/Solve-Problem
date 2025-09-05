import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        dp[0] = Integer.parseInt(st.nextToken());

        int max = dp[0];

        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            dp[i] = Math.max(num, dp[i - 1] + num);
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}
