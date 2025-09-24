import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int a = 100 - x;
        int b = 100 - y;
        int c = 100 - (a + b);
        int d = a * b;

        sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ");

        int q = d / 100;
        int r = d % 100;

        if (d >= 100) {
            sb.append(q).append(" ").append(r).append('\n');
            sb.append(c + q).append(" ").append(r);
        } else {
            sb.append(q).append(" ").append(r).append('\n');
            sb.append(c).append(" ").append(d);
        }
        System.out.print(sb);
    }
}
