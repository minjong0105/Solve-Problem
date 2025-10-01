import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        sb = new StringBuilder();

        fx(0, 0, N);

        System.out.print(sb);
    }

    public static void fx(int x, int y, int n) {
        if (n == 0) {
            return;
        }
        int sum = 0;
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                sum += arr[i][j];
            }
        }

        if (sum == 0) {
            sb.append(0);
            return;
        } else if (sum == n * n) {
            sb.append(1);
            return;
        }

        sb.append('(');

        n /= 2;
        fx(x, y, n);
        fx(x, y + n, n);
        fx(x + n, y, n);
        fx(x + n, y + n, n);

        sb.append(')');
    }
}
