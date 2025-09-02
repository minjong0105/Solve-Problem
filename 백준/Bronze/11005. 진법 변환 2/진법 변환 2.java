import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            int num = N % B;
            if (num < 10)
                sb.append(num);
            else
                sb.append((char) (num - 10 + 'A'));
            N /= B;
        }
        System.out.println(sb.reverse().toString());
    }
}
