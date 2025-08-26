import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int sum = M + C;
        H += sum / 60;
        M = sum % 60;
        if(H >= 24){
            H -= 24;
        }
        System.out.println(H + " " + M);
    }
}
