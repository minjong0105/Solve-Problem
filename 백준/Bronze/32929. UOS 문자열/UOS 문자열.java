import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        int remainder = (int) (N % 3);

        if (remainder == 1) {
            System.out.println('U');
        } else if (remainder == 2) {
            System.out.println('O');
        } else {
            System.out.println('S');
        }
    }
}