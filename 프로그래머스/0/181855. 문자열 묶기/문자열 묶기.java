import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        
        for (String s : strArr) {
            int len = s.length();
            int count = map.getOrDefault(len, 0) + 1;
            map.put(len, count);
            max = Math.max(max, count);
        }
        
        return max;
    }
}