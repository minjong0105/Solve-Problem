class Solution {
    public int solution(int[] money) {
        int len = money.length;
        
        int case1 = DP(money, 0, len - 2);
        int case2 = DP(money, 1, len - 1);
        
        return Math.max(case1, case2);
    }
    
    private int DP (int[] money, int start, int end) {
        int len = end - start + 1;
        
        int dp1 = money[start];
        int dp2 = Math.max(dp1, money[start + 1]);
        
        for (int i = 2; i < len; i++) {
            int cur = Math.max(dp2, dp1 + money[start + i]);
            dp1 = dp2;
            dp2 = cur;
        }
        
        return dp2;
    }
}