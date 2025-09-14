import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        ArrayList<int[]>[] graph = new ArrayList[V + 1];
        for(int i = 1; i <= V; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new int[]{v, w});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K] = 0;
        pq.offer(new int[]{K, 0});
        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int u = current[0];
            int d = current[1];
            if(dist[u] < d) continue;
            for(int[] next : graph[u]){
                int v = next[0];
                int w = next[1];
                if(dist[v] > d + w){
                    dist[v] = d + w;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= V; i++){
            if(dist[i] == Integer.MAX_VALUE){
                sb.append("INF").append('\n');
            }else{
                sb.append(dist[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
