import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {                 // 의견이 없으면 0
            System.out.println(0);
            return;
        }

        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(br.readLine());

        Arrays.sort(a);

        int cut = (int) Math.round(N * 0.15);   // 위/아래 절사 개수(반올림)
        int from = cut;
        int to = N - cut;                        // exclusive

        long sum = 0;
        for (int i = from; i < to; i++) sum += a[i];

        int cnt = to - from;                     // 남은 개수 (N - 2*cut)
        int ans = (int) Math.round(sum / (double) cnt);  // 평균 반올림

        System.out.println(ans);
    }
}
