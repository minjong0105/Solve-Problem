import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseNum = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            sb.append("Triangle #").append(caseNum).append("\n");

            // Case 1: a가 미지수일 때
            if (a == -1) {
                // 삼각형 결정 조건 확인 (c > b)
                if (c * c <= b * b) {
                    sb.append("Impossible.\n\n");
                } else {
                    double resultA = Math.sqrt(c * c - b * b);
                    sb.append(String.format("a = %.3f\n\n", resultA));
                }
            } 
            // Case 2: b가 미지수일 때
            else if (b == -1) {
                // 삼각형 결정 조건 확인 (c > a)
                if (c * c <= a * a) {
                    sb.append("Impossible.\n\n");
                } else {
                    double resultB = Math.sqrt(c * c - a * a);
                    sb.append(String.format("b = %.3f\n\n", resultB));
                }
            } 
            // Case 3: c가 미지수일 때
            else { // c == -1
                double resultC = Math.sqrt(a * a + b * b);
                sb.append(String.format("c = %.3f\n\n", resultC));
            }
            caseNum++;
        }
        
        System.out.print(sb);
    }
}