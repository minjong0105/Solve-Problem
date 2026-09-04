import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int p = picks[0] + picks[1] + picks[2];
        int m = (minerals.length + 4) / 5;
        int k = Math.min(p, m);
        
        int[][] bundle = new int[k][3];
        
        for (int i = 0; i < k * 5 && i < minerals.length; i++) {
            int c = i / 5;
            switch (minerals[i]) {
                case "diamond" : bundle[c][0]++; break;
                case "iron" : bundle[c][1]++; break;
                case "stone" : bundle[c][2]++; break;
            }
        }
        
        Arrays.sort(bundle, (a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            if (a[1] != b[1]) return b[1] - a[1];
            return b[2] - a[2];
        });
        
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (picks[0] > 0) {
                ans += bundle[i][0] + bundle[i][1] + bundle[i][2];
                picks[0]--;
            } else if (picks[1] > 0) {
                ans += bundle[i][0] * 5 + bundle[i][1] + bundle[i][2];
                picks[1]--;
            } else if (picks[2] > 0) {
                ans += bundle[i][0] * 25 + bundle[i][1] * 5 + bundle[i][2];
                picks[2]--;
            }
        }
        
        return ans;
    }
}