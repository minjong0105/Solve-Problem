import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 통화 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        int totalFee = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String timeStr = st.nextToken(); // "HH:MM"
            int duration = Integer.parseInt(st.nextToken()); // 통화 시간(분)

            // 시(HH)와 분(MM) 분리
            StringTokenizer timeSt = new StringTokenizer(timeStr, ":");
            int hour = Integer.parseInt(timeSt.nextToken());
            int minute = Integer.parseInt(timeSt.nextToken());

            // 통화 시간(분)만큼 반복하며 요금 계산
            for (int j = 0; j < duration; j++) {
                // 현재 시간이 07시 ~ 18시 사이라면 주간 요금 (10원)
                // 18:59분도 18시 대에 포함되므로 주간 요금 적용됨
                if (hour >= 7 && hour < 19) {
                    totalFee += 10;
                } else {
                    // 그 외 시간은 야간 요금 (5원)
                    totalFee += 5;
                }

                // 1분 흐름 처리
                minute++;
                
                // 60분이 되면 시간을 1시간 올리고 분을 0으로 초기화
                if (minute == 60) {
                    minute = 0;
                    hour++;
                    
                    // 24시가 되면 0시로 초기화
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }
        }
        
        System.out.println(totalFee);
    }
}