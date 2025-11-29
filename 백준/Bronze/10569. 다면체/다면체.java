import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            // 꼭짓점(V)과 모서리(E) 입력
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            
            // 오일러 공식 변형: F = 2 - V + E
            int F = 2 - V + E;
            
            sb.append(F).append("\n");
        }
        
        // 결과 한 번에 출력
        System.out.print(sb);
    }
}