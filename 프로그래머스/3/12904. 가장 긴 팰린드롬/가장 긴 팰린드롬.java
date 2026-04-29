import java.util.*;

class Solution
{
    public int solution(String s) {
        int ans = 1;
        for(int i = 0; i < s.length(); i++) {
            int one = palin(s, i, i);
            int two = palin(s, i, i + 1);
            
            ans = Math.max(ans, Math.max(one, two));
        }
        
        return ans;
    }
    
    private int palin(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return (right -1) - (left + 1) + 1;
    }
}