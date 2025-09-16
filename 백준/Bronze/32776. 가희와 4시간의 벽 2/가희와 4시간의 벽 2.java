import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int S = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int ab = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int plane = a + ab + b;

        if (S <= 240 || S <= plane) {
            System.out.println("high speed rail");
        } else {
            System.out.println("flight");
        }
    }
}