import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int totalTime = 0;
        
        for (int i = 0; i < N; i++) {
            totalTime += Integer.parseInt(st.nextToken());
        }
        
        if (N > 1) {
            totalTime += (N - 1) * 8;
        }
        
        int days = totalTime / 24;
        int hours = totalTime % 24;
        
        System.out.println(days + " " + hours);
    }
}