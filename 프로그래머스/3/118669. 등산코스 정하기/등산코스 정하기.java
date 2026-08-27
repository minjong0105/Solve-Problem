import java.util.*;

class Solution {
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] p : paths) {
            graph.get(p[0]).add(new int[]{p[1], p[2]});
            graph.get(p[1]).add(new int[]{p[0], p[2]});
        }
        
        boolean[] isGate = new boolean[n + 1];
        boolean[] isSummit = new boolean[n + 1];
        
        for (int g : gates) {
            isGate[g] = true;
        }
        
        for (int s : summits) {
            isSummit[s] = true;
        }
        
        int[] intensity = new int[n + 1];
        Arrays.fill(intensity, Integer.MAX_VALUE);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        for (int g : gates) {
            intensity[g] = 0;
            pq.offer(new int[]{g, 0});
        }
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];
            
            if (cost > intensity[node]) continue;
            
            if (isSummit[node]) continue;
            
            for (int[] next : graph.get(node)) {
                int nextNode = next[0];
                int weight = next[1];
                
                if (isGate[nextNode]) continue;
                
                int newIntensity = Math.max(cost, weight);
                
                if (newIntensity < intensity[nextNode]) {
                    intensity[nextNode] = newIntensity;
                    pq.offer(new int[]{nextNode, newIntensity});
                }
            }
        }
        
        int[] answer = {-1, Integer.MAX_VALUE};
        Arrays.sort(summits);
        for (int s : summits) {
            if (intensity[s] < answer[1]) {
                answer[0] = s;
                answer[1] = intensity[s];
            }
        }
        
        return answer;
    }
}