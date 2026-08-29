import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (a, b) -> a[1] - b[1]);
        
        int count = 0;
        int last = -1;
        
        for (int[] t : targets) {
            int s = t[0];
            int e = t[1];
            
            if (s >= last) {
                count++;
                last = e;
            }
        }
        
        return count;
    }
}