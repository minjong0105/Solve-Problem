import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] coin = { 25, 10, 5, 1 };
        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            for (int i = 0; i < 4; i++) {
                sb.append(num / coin[i]).append(" ");
                num %= coin[i];
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
