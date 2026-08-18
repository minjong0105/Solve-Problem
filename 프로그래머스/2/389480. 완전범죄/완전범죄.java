class Solution {
    public int solution(int[][] info, int n, int m) {
        boolean[][] dp = new boolean[n][m];
        dp[0][0] = true;
        
        for(int[] x : info) {
            int a = x[0];
            int b = x[1];
            
            boolean[][] next = new boolean[n][m];
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(!dp[i][j]) continue;
                    
                    if(i + a < n) {
                        next[a + i][j] = true;
                    }
                    
                    if (j + b < m) {
                        next[i][b + j] = true;
                    }
                }
            }
            dp = next;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(dp[i][j]) {
                    return i;
                }
            }
        }
            
        return -1;
    }
}