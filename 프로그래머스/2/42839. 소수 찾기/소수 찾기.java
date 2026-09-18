import java.util.*;

class Solution {
    Set<Integer> made = new HashSet<>();
    
    public int solution(String numbers) {
        boolean[] used = new boolean[numbers.length()];
        dfs("", numbers, used);
        
        int count = 0;
        
        for (int n : made) {
            if (isPrime(n)) count++;
        }
        
        return count;
    }
    
    private void dfs(String s, String numbers, boolean[] used) {
        if (!s.isEmpty()){
            made.add(Integer.parseInt(s));
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (used[i]) continue;
            
            used[i] = true;
            dfs(s + numbers.charAt(i), numbers, used);
            used[i] = false;
        }
    }
    
    private boolean isPrime(int num) {
        if (num < 2 ) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}