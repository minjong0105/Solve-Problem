import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int count = 1;
        while (X > count) {
            X -= count;
            count++;
        }
        if (count % 2 == 0) {
            System.out.println(X + "/" + (count - X + 1));
        } else {
            System.out.println((count - X + 1) + "/" + X);
        }
    }
}
