import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = { 1, 1, 2, 2, 2, 8 };
        for (int i = 0; i < 6; i++) {
            int n = Integer.parseInt(st.nextToken());
            System.out.print(arr[i] - n + " ");
        }
    }
}
