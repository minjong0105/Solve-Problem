import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫째 줄에서 두 통장 잔고 A, B를 읽음
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        // 둘째 줄에서 치킨 한 마리 가격 C를 읽음
        long C = Long.parseLong(br.readLine());
        
        // 1. 총액 계산
        long sum = A + B;
        
        // 2. 치킨 두 마리 가격 계산
        long chickenPrice = C * 2;
        
        // 3. 조건 확인 후 결과 출력
        if (sum >= chickenPrice) {
            System.out.println(sum - chickenPrice);
        } else {
            System.out.println(sum);
        }
    }
}