import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] P = new int[N];
        int[] S = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr = new int[N];
        int[] origin = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
            origin[i] = i;
        }

        int ans = 0;
        while (true) {
            if (check(arr, P)) {
                System.out.println(ans);
                return;
            }

            int[] next = new int[N];
            for (int i = 0; i < N; i++) {
                next[S[i]] = arr[i];
                }
                
            arr = next;
            ans++;

            if (Arrays.equals(arr, origin)) {
                System.out.println(-1);
                return;
            }
        }
    }

    static boolean check(int[] arr, int[] P) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 != P[arr[i]]) {
                return false;
            }
        }

        return true;
    }
}