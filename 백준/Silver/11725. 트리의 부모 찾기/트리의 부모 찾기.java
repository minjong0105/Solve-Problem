import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>());
        }

        visited = new boolean[N + 1];
        parent = new int[N + 1];

        StringTokenizer st;
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.get(x).add(y);
            arr.get(y).add(x);
        }

        dfs(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int x) {
        visited[x] = true;

        for (int i : arr.get(x)) {
            if (!visited[i]) {
                parent[i] = x;
                dfs(i);
            }
        }
    }
}
