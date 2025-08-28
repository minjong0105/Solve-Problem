import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[30];
        Arrays.fill(arr, false);
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n - 1] = true;
        }
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < 30; i++) {
            if (!arr[i]) {
                if (ans1 == 0) {
                    ans1 = i + 1;
                } else
                    ans2 = i + 1;
            }
        }
        System.out.println(Math.min(ans1, ans2));
        System.out.println(Math.max(ans1, ans2));
    }
}