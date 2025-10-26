import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        // 1. 현재 시점의 ZonedDateTime 객체를 생성하고 UTC 기준 시간대를 설정
        ZonedDateTime nowUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        
        // 2. 연도, 월, 일을 추출
        int year = nowUTC.getYear();
        int month = nowUTC.getMonthValue();
        int day = nowUTC.getDayOfMonth();
        
        // 3. 문제에서 요구하는 형식으로 출력
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}