import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int B = Integer.parseInt(br.readLine());
        int A = (B / 11) * 10;
        
        System.out.println(A);
    }
}