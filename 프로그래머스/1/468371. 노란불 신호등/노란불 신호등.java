class Solution {
    public int solution(int[][] signals) {
        long lcm = 1;
        for (int[] s : signals) {
            lcm = lcm(lcm, s[0] + s[1] + s[2]);
        }
        
        for (int t = 1; t <= lcm; t++) {
            if (check(t, signals)) return t;
        }
        
        return -1;
    }
    
    private boolean check(int t, int[][] signals) {
        for (int[] s : signals) {
            if (!isYellow(t, s)) return false;
        }
        
        return true;
    }
    
    private boolean isYellow(int t, int[] s) {
        int g = s[0], y = s[1];
        int cycle = s[0] + s[1] + s[2];
        
        int pos = ((t - 1) % cycle) + 1;
        
        return pos > g && pos <= g + y;
    }
    
    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
    
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}