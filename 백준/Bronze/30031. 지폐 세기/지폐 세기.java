import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            switch (x) {
                case 136:
                    ans += 1000;
                    break;
                case 142:
                    ans += 5000;
                    break;
                case 148:
                    ans += 10000;
                    break;
                case 154:
                    ans += 50000;
                    break;
            }
        }

        System.out.print(ans);
    }
}
