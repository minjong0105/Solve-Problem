import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        // 정수 나눗셈 트릭을 이용한 올림 계산: (L + 4) / 5
        // (L / 5)의 몫을 구한 뒤, 나머지가 있으면 1을 더하는 효과와 동일
        int minTime = (L + 4) / 5;

        System.out.println(minTime);
    }
}