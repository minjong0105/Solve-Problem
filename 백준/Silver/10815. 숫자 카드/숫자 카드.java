import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 상근이의 카드를 배열에 저장 후 정렬
        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);

        // 2. 확인할 카드를 하나씩 읽으며 이분 탐색
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int numToCheck = Integer.parseInt(st.nextToken());
            // binarySearch 결과가 0 이상이면 카드가 존재한다는 의미
            if (Arrays.binarySearch(cards, numToCheck) >= 0) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}