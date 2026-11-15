import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int[] dist = new int[words.length];
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(-1);
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            String word = (cur == -1) ? begin : words[cur];
            int d = (cur == -1) ? 0 : dist[cur];
            
            for (int i = 0; i < words.length; i++) {
                if (dist[i] != 0) continue;
                if (!check(word, words[i])) continue;
                
                dist[i] = d + 1;
                if (words[i].equals(target)) return dist[i];
                
                q.offer(i);
            }
        }
        return 0;
    }
    
    boolean check(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            
            if (diff > 1) return false;
        }
        
        return true;
    }
}