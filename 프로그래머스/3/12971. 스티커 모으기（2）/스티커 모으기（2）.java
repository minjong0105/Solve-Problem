class Solution {
    public int solution(int sticker[]) {
        int len = sticker.length;
        
        if (len == 1) return sticker[0];
        
        int first = DP(sticker, 0, len - 2);
        
        int second = DP(sticker, 1, len - 1);
        
        return Math.max(first, second);
    }
    
    private int DP(int sticker[], int start, int end) {
        int len = end - start + 1;
        
        if (len == 1) return sticker[start];
        
        int[] dp = new int[len];
        dp[0] = sticker[start];
        dp[1] = Math.max(sticker[start], sticker[start + 1]);
        
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sticker[start + i]);
        }
        
        return dp[len - 1];
    }
}