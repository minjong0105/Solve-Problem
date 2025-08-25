import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        long hash = 0;
        long pow = 1;
        int mod = 1234567891;
        for (int i = 0; i < n; i++) {
            hash = (hash + (s.charAt(i) - 'a' + 1) * pow) % mod;
            pow = (pow * 31) % mod;
        }
        System.out.println(hash);
    }
}
