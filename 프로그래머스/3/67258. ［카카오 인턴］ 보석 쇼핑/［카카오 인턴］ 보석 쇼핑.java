import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int total = new HashSet<>(Arrays.asList(gems)).size();
        Map<String, Integer> window = new HashMap<>();
        int left = 0;
        
        int start = 0;
        int end = gems.length - 1;
        
        for (int right = 0; right < gems.length; right++) {
            window.put(gems[right], window.getOrDefault(gems[right], 0) + 1);
            
            while (window.get(gems[left]) > 1) {
                window.put(gems[left], window.get(gems[left]) -1);
                left++;
            }
            
            if (window.size() == total && (right - left) < (end - start)) {
            start = left;
            end = right;
            }
        }
        
        return new int[]{start + 1, end + 1};
    }
}