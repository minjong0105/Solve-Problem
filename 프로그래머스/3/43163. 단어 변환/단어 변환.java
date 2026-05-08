import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int idx = -1;
        
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(target)) {
                idx = i;
                break;
            }
        }
        
        if(idx == -1) return 0;
        
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[words.length];
        
        for(int i = 0; i < words.length; i++) {
            if(canChange(begin, words[i])){
                q.offer(i);
                dist[i] = 1;
            }
        }
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            String word = words[cur];
            
            if(cur == idx) {
                return dist[idx];
            }
            
            for(int i = 0; i < words.length; i++) {
                if(dist[i] == 0 && canChange(word, words[i])) {
                    dist[i] = dist[cur] + 1;
                    q.offer(i);
                }
            }
        }
        
        
        
        return 0;
    }
    
    private boolean canChange(String w1, String w2) {
        int diff = 0;
        for(int i = 0; i < w1.length(); i++) {
            if(w1.charAt(i) != w2.charAt(i)) diff++;
            if(diff > 1) return false;
        }
        return true;
    }
}