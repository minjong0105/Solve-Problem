import java.util.*;
import java.io.*;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }

        fx(N, 0, 0);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');

        }
        System.out.println(sb);
    }

    public static void fx(int n, int r, int c) {
        if (n == 3) {
            arr[r][c] = '*';
            arr[r][c + 1] = '*';
            arr[r][c + 2] = '*';
            arr[r + 1][c] = '*';
            arr[r + 1][c + 2] = '*';
            arr[r + 2][c] = '*';
            arr[r + 2][c + 1] = '*';
            arr[r + 2][c + 2] = '*';
            return;
        }
        int len = n / 3;
        fx(len, r, c);
        fx(len, r, c + len);
        fx(len, r, c + len * 2);
        fx(len, r + len, c);
        fx(len, r + len, c + len * 2);
        fx(len, r + len * 2, c);
        fx(len, r + len * 2, c + len);
        fx(len, r + len * 2, c + len * 2);
    }
}
