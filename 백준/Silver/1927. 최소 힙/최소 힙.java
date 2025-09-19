import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                // 힙이 비어있는 경우
                if (minHeap.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    // 힙에서 가장 작은 값을 꺼내서 출력
                    sb.append(minHeap.poll()).append('\n');
                }
            } else {
                // 힙에 x를 추가
                minHeap.add(x);
            }
        }
        System.out.print(sb);
    }
}
