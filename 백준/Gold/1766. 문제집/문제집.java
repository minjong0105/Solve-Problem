import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> g = new ArrayList<>(); // 인접 리스트
        for (int i = 0; i <= N; i++) {
            g.add(new ArrayList<>());
        }

        int[] arr = new int[N + 1]; // 진입 차수 저장용
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            g.get(A).add(B); // A -> B
            arr[B]++; // 진입 차수 증가
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 진입 차수가 0인 노드를 오름차순 저장
        for (int i = 1; i <= N; i++) {
            if (arr[i] == 0)
                pq.add(i);
        }

        // 위상 정렬
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.peek()).append(" ");
            int cur = pq.poll();
            for (int next : g.get(cur)) {
                arr[next]--;
                if (arr[next] == 0)
                    pq.add(next);
            }
        }

        System.out.print(sb);
    }
}
