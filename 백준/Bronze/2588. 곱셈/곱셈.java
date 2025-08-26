import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int B1 = B % 10;
        int B2 = (B / 10) % 10;
        int B3 = B / 100;

        System.out.println(A * B1);
        System.out.println(A * B2);
        System.out.println(A * B3);
        System.out.println(A * B);
    }
}
