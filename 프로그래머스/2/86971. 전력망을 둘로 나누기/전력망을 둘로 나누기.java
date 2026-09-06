class Solution {
    int[] parent;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for (int c = 0; c < wires.length; c++) {
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
            
            for (int i = 0; i < wires.length; i++) {
                if (i == c) continue;
                
                union(wires[i][0], wires[i][1]);
            }
            
            int count = 0;
            int p = find(1);
            
            for (int i = 1; i <= n; i++) {
                if (find(i) == p) count++;
            }
            
            answer = Math.min(answer, Math.abs(count - (n - count)));
        }
        return answer;
    }
    
    private int find(int x) {
        if (parent[x] == x) return x;
        
        return parent[x] = find(parent[x]);
    }
    
    private void union(int a, int b) {
        int pA = find(a);
        int pB = find(b);
        if (pB != pA) parent[pB] = pA;
    }
}