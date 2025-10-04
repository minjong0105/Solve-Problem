import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> g;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(g.get(i));
        }

        visited = new boolean[N + 1];
        dfs(V);
        sb.append('\n');

        visited = new boolean[N + 1];
        bfs(V);

        System.out.println(sb);
    }

    public static void dfs(int node) {
        visited[node] = true;
        sb.append(node).append(' ');

        for (int neighbor : g.get(node)) {
            if (!visited[neighbor])
                dfs(neighbor);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            sb.append(node).append(' ');

            for (int neighbor : g.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
    }
}
