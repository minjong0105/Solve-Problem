import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> graph;
    static int[] group;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        while (K-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            graph = new ArrayList<>();

            for (int i = 0; i <= V; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            group = new int[V + 1];
            boolean check = true;

            for (int i = 1; i <= V; i++) {
                if (group[i] == 0 && !bfs(i)) {
                    check = false;
                    break;
                }
            }
            sb.append(check ? "YES" : "NO").append('\n');
        }
        System.out.println(sb);
    }

    static boolean bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        group[start] = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : graph.get(cur)) {
                if (group[next] == 0) {
                    group[next] = -group[cur];
                    q.offer(next);
                } else if (group[next] == group[cur]) return false;
            }
        }
        return true;
    }
}