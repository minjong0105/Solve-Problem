import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 순서: L(방학), A(국어), B(수학), C(국어 최대), D(수학 최대)
        int L = Integer.parseInt(br.readLine()); // 방학 일수
        int A = Integer.parseInt(br.readLine()); // 국어 총 페이지
        int B = Integer.parseInt(br.readLine()); // 수학 총 페이지
        int C = Integer.parseInt(br.readLine()); // 하루 국어 최대
        int D = Integer.parseInt(br.readLine()); // 하루 수학 최대
        
        // 1. 국어 숙제 소요 일수 계산 (올림)
        // (A + C - 1) / C
        int daysForKorean = (A + C - 1) / C;
        
        // 2. 수학 숙제 소요 일수 계산 (올림)
        // (B + D - 1) / D
        int daysForMath = (B + D - 1) / D;
        
        // 3. 총 숙제 소요 일수 (둘 중 큰 값)
        int totalDaysNeeded = Math.max(daysForKorean, daysForMath);
        
        // 4. 남은 방학 일수
        int remainingDays = L - totalDaysNeeded;
        
        System.out.println(remainingDays);
    }
}