import java.io.*;
import java.util.*;

public class Main {
    static int[] S;
    static int[] check;
    static int k;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if (k == 0) break;

            S = new int[k];
            for (int i = 0; i < k; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }

            check = new int[k];

            dfs(0, 0);
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void dfs(int idx, int depth) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(check[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = idx; i < k; i++) {
            check[depth] = S[i];
            dfs(i + 1, depth + 1);
        }
    }
}
