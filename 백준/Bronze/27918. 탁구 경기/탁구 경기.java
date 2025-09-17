import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;
        for (int i = 0; i < N; i++) {
            String win = br.readLine();
            if (win.equals("D")) {
                x++;
            } else {
                y++;
            }
            if (Math.abs(x - y) == 2) {
                break;
            }
        }
        System.out.println(x + ":" + y);
    }
}