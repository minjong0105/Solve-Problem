import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 약칭 입력 받기
        String school = br.readLine();

        // 약칭에 따른 정식 명칭 출력 (SJA 수정됨)
        if (school.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        } else if (school.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        } else if (school.equals("KIS")) {
            System.out.println("Korea International School");
        } else if (school.equals("SJA")) {
            // [수정] Jeju를 뺀 명칭이 정답입니다.
            System.out.println("St. Johnsbury Academy");
        }
    }
}