import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for (String alphabet : croatia) {
            if (s.contains(alphabet)) {
                s = s.replace(alphabet, "#");
            }
        }

        System.out.println(s.length());
    }
}
