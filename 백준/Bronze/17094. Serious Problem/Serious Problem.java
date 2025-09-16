import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int count2 = 0;
        int countE = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '2') {
                count2++;
            } else {
                countE++;
            }
        }

        if (count2 > countE) {
            System.out.println(2);
        } else if (count2 < countE) {
            System.out.println("e");
        } else {
            System.out.println("yee");
        }
    }
}