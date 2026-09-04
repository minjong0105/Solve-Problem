class Solution {
    public long solution(int[] sequence) {
        long plus = sequence[0];
        long minus = -sequence[0];
        long ans = Math.max(plus, minus);
        
        for (int i = 1; i < sequence.length; i++) {
            long nextP = sequence[i] + Math.max(0, minus);
            long nextM = -sequence[i] + Math.max(0, plus);
            
            plus = nextP;
            minus = nextM;
            
            ans = Math.max(ans, Math.max(plus, minus));
        }
        
        return ans;
    }
}