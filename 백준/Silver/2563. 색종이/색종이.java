import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] arr = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 10 && x + j < 100; j++) {
                for (int k = 0; k < 10 && y + k < 100; k++) {
                    if (arr[x + j][y + k])
                        continue;
                    else {
                        arr[x + j][y + k] = true;
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
