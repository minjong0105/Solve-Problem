import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (true) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0)
                break;

            if (x % n == 0) {
                sb.append(x + " is a multiple of " + n + "." + '\n');
            } else {
                sb.append(x + " is NOT a multiple of " + n + "." + '\n');
            }
        }

        System.out.print(sb);
    }
}