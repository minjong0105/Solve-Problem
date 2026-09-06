class Solution {
    int answer = 0;
    int[][] dungeons;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        
        dfs(k, 0);
        return answer;
    }
    
    private void dfs(int k, int count) {
        answer = Math.max(answer, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || k < dungeons[i][0]) continue;
            
            visited[i] = true;
            dfs(k - dungeons[i][1], count + 1);
            visited[i] = false;
        }
    }
}