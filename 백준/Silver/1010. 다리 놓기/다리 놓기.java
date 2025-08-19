import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // nCr = n! / (r! * (n-r)!)
            // M개 중에 N개를 뽑는 조합
            System.out.println(combination(M, N));
        }
    }

    // 조합(nCr) 계산 함수
    public static long combination(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        if (r > n - r) {
            r = n - r; // r이 n-r보다 크면 n-r로 계산하는 것이 더 효율적
        }
        
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }
}