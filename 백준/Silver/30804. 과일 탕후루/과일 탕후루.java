import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        int[] cnt = new int[10];
        int max = 0;
        int kind = 0;
        for (int r = 0; r < N; r++) {

            if (cnt[arr[r]] == 0) {
                kind++;
            }

            cnt[arr[r]]++;

            while (kind > 2) {
                cnt[arr[l]]--;
                if (cnt[arr[l]] == 0) {
                    kind--;
                }
                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        System.out.println(max);

    }
}
