import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        StringBuilder sbA = new StringBuilder(A);
        StringBuilder sbB = new StringBuilder(B);
        A = sbA.reverse().toString();
        B = sbB.reverse().toString();
        System.out.println(Math.max(Integer.parseInt(A), Integer.parseInt(B)));
    }
}
