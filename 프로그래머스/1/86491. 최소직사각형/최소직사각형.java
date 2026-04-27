class Solution {
    public int solution(int[][] sizes) {
        int maxR = 0;
        int maxC = 0;
        
        for(int[] size : sizes) {
            int x = Math.max(size[0], size[1]);
            int y = Math.min(size[0], size[1]);
            
            maxR = Math.max(maxR, x);
            maxC = Math.max(maxC, y);
        }
        
        return maxR * maxC;
    }
}