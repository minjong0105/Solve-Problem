import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 사용자로부터 입력을 받습니다.
        Scanner sc = new Scanner(System.in);
        
        // 정수 N을 입력받습니다.
        int N = sc.nextInt();
        
        // 2024년으로부터 N년까지의 경과 연수를 계산합니다.
        // 경과 연수 = N - 2024
        int result = N - 2024;
        
        // 결과를 출력합니다.
        System.out.println(result);
        
        // Scanner 객체를 닫아줍니다.
        sc.close();
    }
}