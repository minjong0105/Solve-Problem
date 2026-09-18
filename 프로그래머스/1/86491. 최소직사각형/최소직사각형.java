class Solution {
    public int solution(int[][] sizes) {
        int maxR = 0;
        int maxC = 0;
        
        for (int[] s : sizes) {
            int a = Math.max(s[0], s[1]);
            int b = Math.min(s[0], s[1]);
            
            maxR = Math.max(maxR, a);
            maxC = Math.max(maxC, b);
        }
        
        return maxR * maxC;
    }
}