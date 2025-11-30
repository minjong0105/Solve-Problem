import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 n 입력
        int n = sc.nextInt();
        
        if (n < 0) {
            // 음수는 32비트 정수 체계에서 부호 비트까지 사용하므로 항상 32비트
            System.out.println(32);
        } else if (n == 0) {
            // 0은 1비트만 있으면 됨
            System.out.println(1);
        } else {
            // 양수는 이진수로 변환했을 때의 문자열 길이가 비트 수임
            // Java의 Integer.toBinaryString() 메소드 활용
            System.out.println(Integer.toBinaryString(n).length());
        }
        
        sc.close();
    }
}