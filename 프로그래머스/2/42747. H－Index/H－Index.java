import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int ans = 0;
        
        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            
            if(citations[i] >= h) {
                ans = h;
                break;
            }
        }
        
        return ans;
    }
}