import java.util.*;
import java.io.*;

public class Main {
    static int R, C;
    static int[][] arr;
    static int ans = 0;
    static boolean[] check = new boolean[26];
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new int[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = s.charAt(j) - 'A';
            }
        }

        check[arr[0][0]] = true;
        dfs(0, 0, 1);

        System.out.println(ans);
    }

    public static void dfs(int r, int c, int count) {
        ans = Math.max(ans, count);

        for (int i = 0; i < 4; i++) {
            int nR = r + dy[i];
            int nC = c + dx[i];

            if (nR < R && nR >= 0 && nC < C && nC >= 0 && !check[arr[nR][nC]]) {
                check[arr[nR][nC]] = true;
                dfs(nR, nC, count + 1);
                check[arr[nR][nC]] = false;
            }
        }
    }
}
