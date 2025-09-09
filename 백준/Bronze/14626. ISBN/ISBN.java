import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < 13; i++) {
            if (s.charAt(i) == '*') {
                idx = i;
            } else if (i % 2 == 0) {
                sum += s.charAt(i) - '0';
            } else {
                sum += (s.charAt(i) - '0') * 3;
            }
        }
        for (int i = 0; i <= 9; i++) {
            int checksum = sum;
            if (idx % 2 == 0) {
                checksum += i;
            } else {
                checksum += 3 * i;
            }

            if (checksum % 10 == 0) {
                System.out.print(i);
                return;
            }
        }
    }
}
