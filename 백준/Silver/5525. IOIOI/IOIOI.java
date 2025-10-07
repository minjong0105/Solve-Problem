import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();

        int ans = 0;
        int count = 0;

        for (int i = 1; i < M - 1; i++) {
            if (c[i - 1] == 'I' && c[i] == 'O' && c[i + 1] == 'I') {
                count++;

                if (count == N) {
                    ans++;
                    count--;
                }
                i++;
            } else {
                count = 0;
            }
        }

        System.out.println(ans);
    }
}
