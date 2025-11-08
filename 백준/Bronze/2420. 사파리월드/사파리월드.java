import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. int 대신 long으로 입력받음
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        // 2. 두 수의 차이를 계산
        long difference = N - M;
        
        // 3. Math.abs()로 절대값을 구함
        long result = Math.abs(difference);
        
        System.out.println(result);
    }
}