import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        // 높이
        int min = 256;
        int max = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] < min)
                    min = arr[i][j];
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }

        // 소요 시간
        int minT = Integer.MAX_VALUE;
        // 최대 높이
        int maxH = -1;

        for (int h = min; h <= max; h++) {
            int plus = 0;
            int minus = 0;

            // 배열 전체를 돌면서 해당 높이로 맞추려면 몇 개를 빼거나 쌓아야 하는지 계산
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] > h)
                        minus += arr[i][j] - h;
                    else if (arr[i][j] < h)
                        plus += h - arr[i][j];
                }
            }

            // 블록 수 되는지 확인
            if (B + minus >= plus) {
                int time = minus * 2 + plus;

                if (time <= minT) {
                    minT = time;
                    maxH = h;
                }
            }
        }
        System.out.println(minT + " " + maxH);
    }
}
