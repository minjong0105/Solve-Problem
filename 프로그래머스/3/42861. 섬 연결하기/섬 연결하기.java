import java.util.*;

class Solution {
    int[] parent;
    
    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);
        
        parent = new int[n];
        
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        int ans = 0;
        int count = 0;
        
        for (int[] c : costs) {
            int a = c[0], b = c[1], cost = c[2];
            
            if (find(a) == find(b)) continue;
            
            union(a, b);
            
            ans += cost;
            count++;
            
            if (count == n - 1) break;
        }
        
        return ans;
    }
    
    private int find(int x) {
        if (parent[x] == x) return x;
        
        return parent[x] = find(parent[x]);
    }
    
    private void union(int a, int b) {
        int pA = find(a);
        int pB = find(b);
        
        if (pA != pB) parent[pB] = pA;
    }
}