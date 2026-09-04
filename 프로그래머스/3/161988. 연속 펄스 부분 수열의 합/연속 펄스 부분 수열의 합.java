import java.util.*;

class Solution {
    public long solution(int[] sequence) {
        long maxX = Long.MIN_VALUE, x = 0;
        long maxY = Long.MIN_VALUE, y = 0;
        
        for (int i = 0; i < sequence.length; i++) {
            long curX;
            if (i % 2 == 0) {
                curX = sequence[i];
            } else {
                curX = - sequence[i];
            }
            long curY = (-1) * curX;
            
            x = Math.max(x + curX, curX);
            y = Math.max(y + curY, curY);
            
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        
        return Math.max(maxX, maxY);
    }
}