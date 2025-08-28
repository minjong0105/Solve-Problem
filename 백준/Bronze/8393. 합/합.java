import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        if (n % 2 == 0) {
            ans = (1 + n) * (n / 2);
        } else {
            ans = n * (n - 1) / 2 + n;
        }
        System.out.println(ans);
    }
}
