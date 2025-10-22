import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n];

            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    int num = Integer.parseInt(st.nextToken());
                    arr[i][j] = num;
                }
            }
            if (n == 1) {
                System.out.println(Math.max(arr[0][0], arr[1][0]));
                continue;
            }

            int[][] dp = new int[2][n];

            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];
            dp[0][1] = arr[1][0] + arr[0][1];
            dp[1][1] = arr[0][0] + arr[1][1];

            for (int i = 2; i < n; i++) {
                dp[0][i] = arr[0][i] + Math.max(Math.max(dp[0][i - 2], dp[1][i - 2]), dp[1][i - 1]);
                dp[1][i] = arr[1][i] + Math.max(Math.max(dp[0][i - 2], dp[1][i - 2]), dp[0][i - 1]);
            }

            int ans = Math.max(dp[0][n - 1], dp[1][n - 1]);
            System.out.println(ans);
        }
    }
}
