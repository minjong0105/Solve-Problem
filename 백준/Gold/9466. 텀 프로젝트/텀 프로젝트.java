import java.io.*;
import java.util.*;

public class Main {
    static int n, team;
    static int[] arr;
    static boolean[] check;
    static boolean[] finish;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = new int[n + 1];
            check = new boolean[n + 1];
            finish = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            team = 0;
            for (int i = 1; i <= n; i++) {
                if (!check[i])
                    dfs(i);
            }

            sb.append(n - team).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int idx) {
        check[idx] = true;
        int next = arr[idx];

        if (!check[next]) {
            dfs(next);
        } else {
            if (!finish[next]) {
                team++;
                for (int i = next; i != idx; i = arr[i]) {
                    team++;
                }
            }
        }
        finish[idx] = true;
    }
}
