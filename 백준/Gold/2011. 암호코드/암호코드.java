import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (s.charAt(0) == '0') {
            System.out.println(0);
            return;
        }

        int len = s.length();
        int[] dp = new int[len + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= len; i++) {
            int one = s.charAt(i - 1) - '0';
            int two = (s.charAt(i - 2) - '0') * 10 + one;

            if (one >= 1 && one <= 9) {
                dp[i] = (dp[i] + dp[i - 1]) % 1000000;
            }

            if (two >= 10 && two <= 26) {
                dp[i] = (dp[i] + dp[i - 2]) % 1000000;
            }
        }

        System.out.println(dp[len]);
    }

}
