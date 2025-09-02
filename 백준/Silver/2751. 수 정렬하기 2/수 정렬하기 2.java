import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] plus = new int[N];

        for (int i = 0; i < N; i++) {
            plus[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(plus);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(plus[i]).append("\n");
        }
        System.out.println(sb);
    }
}
