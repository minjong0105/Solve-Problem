import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int n = message.length();
        
        boolean[] isSpoiler = new boolean[n];
        
        for (int[] s : spoiler_ranges) {
            for (int i = s[0]; i <= s[1]; i++) {
                isSpoiler[i] = true;
            }
        }
        
        Set<String> normal = new HashSet<>();
        List<String> spo = new ArrayList<>();
        
        int start = 0;
        
        for (int i = 0; i <= n; i++) {
            if (i == n || message.charAt(i) == ' ') {
                if (start < i) {
                    String word = message.substring(start, i);
                    
                    boolean cover = false;
                    for (int k = start; k < i; k++) {
                        if (isSpoiler[k]) {
                            cover = true;
                            break;
                        }
                    }
                    
                    if (cover) spo.add(word);
                    else normal.add(word);
                }
                
                start = i + 1;
            }
        }
        
        Set<String> revealed = new HashSet<>();
        int answer = 0;
        for (String s : spo) {
            if (!normal.contains(s) && !revealed.contains(s)) {
                answer++;
            }
            
            revealed.add(s);
        }
        
        return answer;
    }
}