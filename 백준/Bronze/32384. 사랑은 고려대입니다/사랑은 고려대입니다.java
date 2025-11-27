import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 정수 N 입력
        int N = sc.nextInt();

        // N번 반복하여 문자열 출력
        for (int i = 0; i < N; i++) {
            System.out.print("LoveisKoreaUniversity");
            
            // 마지막 단어가 아닐 경우에만 공백 추가 (필수는 아니지만 정석적인 방법)
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
        
        // 리소스 해제
        sc.close();
    }
}