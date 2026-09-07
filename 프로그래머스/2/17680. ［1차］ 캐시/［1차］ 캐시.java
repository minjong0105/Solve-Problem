import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        
        List<String> cache = new ArrayList<>();
        int answer = 0;
        
        for (String city : cities) {
            String key = city.toLowerCase();
            
            if (cache.contains(key)) {
                cache.remove(key);
                cache.add(key);
                answer += 1;
            } else {
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                
                cache.add(key);
                answer += 5;
            }
        }
        
        return answer;
    }
}