import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            
            System.out.println(dp[n]);
        }
    }
}
