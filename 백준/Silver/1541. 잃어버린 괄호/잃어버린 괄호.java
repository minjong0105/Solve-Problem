import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        // "-"를 기준으로 문자열을 나눈다.
        String[] parts = expression.split("-");
        
        int result = 0;

        // 첫 번째 덩어리는 무조건 더한다.
        StringTokenizer st = new StringTokenizer(parts[0], "+");
        while (st.hasMoreTokens()) {
            result += Integer.parseInt(st.nextToken());
        }

        // 두 번째 덩어리부터는 모두 빼준다.
        for (int i = 1; i < parts.length; i++) {
            int sumToSubtract = 0;
            // 현재 덩어리를 "+" 기준으로 나눠서 합을 구한다.
            st = new StringTokenizer(parts[i], "+");
            while (st.hasMoreTokens()) {
                sumToSubtract += Integer.parseInt(st.nextToken());
            }
            // 전체 결과에서 빼준다.
            result -= sumToSubtract;
        }

        System.out.println(result);
    }
}