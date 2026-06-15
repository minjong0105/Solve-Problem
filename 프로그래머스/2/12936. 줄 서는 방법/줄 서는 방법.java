import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        
        List<Integer> l = new ArrayList<>();
        
        long f = 1;
        
        for (int i = 1; i <= n; i++) {
            l.add(i);
            f *= i;
        }
        
        k--;
        
        int idx = 0;
        
        while (idx < n) {
            f = f / (n - idx);
            
            int target = (int) (k / f);
            
            answer[idx] = l.get(target);
            l.remove(target);
            
            k = k % f;
            idx++;
        }
        
        return answer;
    }
}