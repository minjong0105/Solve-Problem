import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] road = new long[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            road[i] = Long.parseLong(st.nextToken());
        }

        long[] price = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long min = price[0];
        long total = 0;

        for (int i = 0; i < N - 1; i++) {
            min = Math.min(min, price[i]);
            total += min * road[i];
        }

        System.out.println(total);
    }
}