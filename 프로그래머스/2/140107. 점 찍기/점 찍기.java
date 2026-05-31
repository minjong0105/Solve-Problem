class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        long dist = (long) d * d;
        
        for(long x = 0; x <= d; x += k) {
            long y = (long)Math.sqrt((long) d * d - x * x);
            
            answer += (y/k) + 1;
        }
        return answer;
    }
}