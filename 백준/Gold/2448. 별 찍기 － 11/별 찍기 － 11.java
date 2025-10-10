import java.util.*;
import java.io.*;

public class Main {
    static char[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new char[N][2 * N - 1];

        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], ' ');
        }

        fx(N, 0, N - 1); // 24, 47, 24

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void fx(int n, int r, int c) {
        if (n == 3) {
            arr[r][c] = '*';
            arr[r + 1][c - 1] = '*';
            arr[r + 1][c + 1] = '*';
            arr[r + 2][c - 2] = '*';
            arr[r + 2][c - 1] = '*';
            arr[r + 2][c] = '*';
            arr[r + 2][c + 1] = '*';
            arr[r + 2][c + 2] = '*';
            return;
        }

        int half = n / 2;
        fx(n / 2, r, c);
        fx(n / 2, r + half, c - half);
        fx(n / 2, r + half, c + half);
    }
}
