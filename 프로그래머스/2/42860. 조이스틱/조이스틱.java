class Solution {
    public int solution(String name) {
        int n = name.length();
        int ans = 0;
        
        
        // 각 자리마다 상하 이동 수
        for (int i = 0; i < n; i++) {
            char c = name.charAt(i);
            ans += Math.min(c - 'A', 'Z' - c + 1);    
        }
        
        int move = n - 1;
        
        // 좌우 이동
        for (int i = 0; i < n; i++) {
            int next = i + 1;
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            
            move = Math.min(move, i * 2 + n - next);
            move = Math.min(move, (n - next) * 2 + i);
        }
        
        return ans + move;
    }
}