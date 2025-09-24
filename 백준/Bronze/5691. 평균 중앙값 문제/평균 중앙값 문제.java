import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            if (A == 0 && B == 0) break;
            System.out.println(2 * A - B);
        }
    }
}
