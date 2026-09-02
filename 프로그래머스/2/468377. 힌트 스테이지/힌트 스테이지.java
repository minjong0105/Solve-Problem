class Solution {
    int ans = Integer.MAX_VALUE;
    int[][] cost, hint;
    int len;
    public int solution(int[][] cost, int[][] hint) {
        this.cost = cost;
        this.hint = hint;
        this.len = cost.length;
        
        dfs(0, 0, new int[len]);
        return ans;
    }
    
    private void dfs(int stage, int total, int[] have) {
        if (total >= ans) return;
        
        if (stage == len) {
            ans = Math.min(ans, total);
            return;
        }
        
        int use = Math.min(have[stage], len - 1);
        int solve = cost[stage][use];
        
        dfs(stage + 1, total + solve, have);
        
        if (stage < len - 1) {
            for (int i = 1; i < hint[stage].length; i++) {
                have[hint[stage][i] - 1]++;
            }
            
            dfs(stage + 1, total + solve + hint[stage][0], have);
            
            for (int i = 1; i < hint[stage].length; i++) {
                have[hint[stage][i] - 1]--;
            }
        }
    }
}