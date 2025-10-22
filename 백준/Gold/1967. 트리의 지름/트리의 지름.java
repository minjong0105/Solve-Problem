import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static ArrayList<int[]>[] arr;
    static boolean[] visited;
    static int end = 0;
    static int max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        visited = new boolean[n + 1];

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr[p].add(new int[] { c, w });
            arr[c].add(new int[] { p, w });
        }

        dfs(1, 0);

        visited = new boolean[n + 1];
        max = 0;
        dfs(end, 0);

        System.out.println(max);
    }

    public static void dfs(int node, int weight) {
        visited[node] = true;

        if (weight > max) {
            max = weight;
            end = node;
        }

        for (int[] i : arr[node]) {
            if (!visited[i[0]]) {
                dfs(i[0], weight + i[1]);
            }
        }
    }
}
