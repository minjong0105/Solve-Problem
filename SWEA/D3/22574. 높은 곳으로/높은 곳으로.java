import java.util.*;
import java.io.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long N = Long.parseLong(st.nextToken());
            long P = Long.parseLong(st.nextToken());
            long sum = N * (N + 1) / 2;
            long check = 0;
 
            for (long i = 1; i <= N; i++) {
                check += i;
                if (check == P) {
                    sum--;
                    break;
                }
            }
 
            System.out.println(sum);
        }
    }
}