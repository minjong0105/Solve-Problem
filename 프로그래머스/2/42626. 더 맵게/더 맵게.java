import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : scoville) {
            pq.offer(i);
        }
        
        int ans = 0;
        
        while(pq.peek() < K) {
            if(pq.size() == 1){
                return -1;
            }
            
            int lowest = pq.poll();
            int low = pq.poll();
            
            int mix = lowest + low * 2;
            
            pq.offer(mix);
            
            ans++;
        }
        return ans;
    }
}