class Solution {
    int[][] cost, hint;
    int ans = Integer.MAX_VALUE;
    
    public int solution(int[][] cost, int[][] hint) {
        this.cost = cost;
        this.hint = hint;
        dfs(0, 0, new int[cost.length + 1]);
        return ans;
    }
    
    private void dfs(int idx, int spend, int[] have) {
        
        if (idx == hint.length) {
            int total = spend;
            for (int i = 1; i <= cost.length; i ++) {
                total += cost[i - 1][Math.min(have[i], cost.length - 1)];
            }
            ans = Math.min(ans, total);
            return;
        }
        
        // 안 사는거
        dfs(idx + 1, spend, have);
        
        // 사는거
        for (int i = 1; i < hint[idx].length; i++) {
            have[hint[idx][i]]++;
        }
        
        dfs(idx + 1, spend + hint[idx][0], have);
        
        for (int i = 1; i < hint[idx].length; i++) {
            have[hint[idx][i]]--;
        }
    }
}