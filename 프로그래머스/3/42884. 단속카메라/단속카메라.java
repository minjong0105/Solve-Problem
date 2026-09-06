import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        
        int pos = routes[0][1];
        
        for (int[] route : routes) {
            if (route[0] <= pos) continue;
            
            pos = route[1];
            answer++;
        }
        
        return answer;
    }
}