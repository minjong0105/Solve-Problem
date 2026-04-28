class Solution {
    int mod = 1000000007;
    
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n + 1][m + 1];
        dp[1][1] = 1;
        
        for(int[] pos : puddles) {
            dp[pos[1]][pos[0]] = -1;
        }
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i == 1 && j == 1) continue;
                
                if(dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                
                int up = dp[i - 1][j];
                int left = dp[i][j - 1];
                
                dp[i][j] = (up + left) % mod; 
            }
        }
        
        return dp[n][m];
    }
}