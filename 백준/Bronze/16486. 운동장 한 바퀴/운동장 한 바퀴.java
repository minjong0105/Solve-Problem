import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double d1 = Integer.parseInt(br.readLine());
        double d2 = Integer.parseInt(br.readLine());

        double ans = d1 * 2 + 2 * d2 * 3.141592;

        System.out.println(ans);
    }
}