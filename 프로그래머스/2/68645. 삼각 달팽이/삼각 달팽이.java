class Solution {
    public int[] solution(int n) {
        int[][] board = new int[n][n];
        int total = n * (n + 1) / 2;
        
        int x = -1, y = 0;
        int num = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else {
                    x--;
                    y--;
                }
                
                board[x][y] = num++;
            }
        }
        
        int[] ans = new int[total];
        int idx = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                ans[idx++] = board[i][j];
            }
        }
        
        return ans;
    }
}