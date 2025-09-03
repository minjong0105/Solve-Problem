import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String s = br.readLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                }
                if (count < 0) {
                    break;
                }
            }
            if (count == 0)
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");

        }
        System.out.print(sb);
    }
}
