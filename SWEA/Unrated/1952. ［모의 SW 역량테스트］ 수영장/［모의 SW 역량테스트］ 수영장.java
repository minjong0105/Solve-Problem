import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int quarter = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            int[] plan = new int[13];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= 12; i++) {
                plan[i] = Integer.parseInt(st.nextToken());
            }

            int[] dp = new int[13];

            for(int i = 1; i <= 12; i++){
                int cost1 = dp[i - 1] + day * plan[i];
                int cost2 = dp[i - 1] + month;
                int cost3 = Integer.MAX_VALUE;

                if(i >= 3){
                    cost3 = dp[i - 3] + quarter;
                }

                dp[i] = Math.min(cost1, Math.min(cost2, cost3));
            }

            int ans = Math.min(dp[12], year);

            System.out.println("#" + tc + " " + ans);
        }
    }
}
