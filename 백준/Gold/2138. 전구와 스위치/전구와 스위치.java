import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] want;
    static int[] now1;
    static int[] now2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        now1 = new int[N];
        now2 = new int[N];
        want = new int[N];

        String s = br.readLine();
        for (int i = 0; i < N; i++) {
            now1[i] = s.charAt(i) - '0';
            now2[i] = s.charAt(i) - '0';
        }

        s = br.readLine();
        for (int i = 0; i < N; i++) {
            want[i] = s.charAt(i) - '0';
        }

        // 1번째 전구 딸깍
        now1[0] = 1 - now1[0];
        now1[1] = 1 - now1[1];
        int r1 = start(now1, 1);

        // 1번째 전구 노터치
        int r2 = start(now2, 0);

        int ans = Math.min(r1, r2);

        if (ans == 100001) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }

    public static int start(int[] arr, int count) {
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] != want[i - 1]) {
                count++;
                if (i == N - 1) {
                    arr[i - 1] = 1 - arr[i - 1];
                    arr[i] = 1 - arr[i];
                } else {
                    arr[i - 1] = 1 - arr[i - 1];
                    arr[i] = 1 - arr[i];
                    arr[i + 1] = 1 - arr[i + 1];
                }
            }
        }

        if (arr[N - 1] == want[N - 1]) {
            return count;
        } else {
            return 100001;
        }

    }

    public static void change(int i) {
        if (i > 0) {

        }
    }
}
