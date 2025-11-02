import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 문제에서 주어진 반복되는 문자열
        String S = "WelcomeToSMUPC";
        int N = Integer.parseInt(br.readLine());
        
        // 문자열의 길이 (14)
        int length = S.length();
        
        // 1-based N을 0-based 인덱스로 변환: (N - 1) % 14
        int index = (N - 1) % length;
        
        // 해당 인덱스의 문자 출력
        System.out.println(S.charAt(index));
    }
}