import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (a == 0 && b == 0) {
                break;
            }
            
            // 첫 번째 수가 두 번째 수보다 큰지 확인
            if (a > b) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        
        System.out.print(sb);
    }
}