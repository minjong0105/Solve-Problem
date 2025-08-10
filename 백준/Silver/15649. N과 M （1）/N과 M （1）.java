import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] ans;
    static boolean[] use;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ans = new int[M];
        use = new boolean[N + 1];

        dfs(0);
    }

    static void dfs(int depth){
        if(depth == M){
            for(int i = 0; i < M; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <= N; i++){
            if(use[i] == true) continue;
            use[i] = true;
            ans[depth] = i;
            dfs(depth + 1);
            use[i] = false;
        }
    }
}
