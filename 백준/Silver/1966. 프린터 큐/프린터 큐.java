import java.util.*;
import java.io.*;

public class Main {
    static class Doc {
        int p, idx;
        Doc(int p, int idx){ this.p = p; this.idx = idx; }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            ArrayDeque<Doc> q = new ArrayDeque<>();
            int[] freq = new int[10]; // 우선순위 1~9

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int p = Integer.parseInt(st.nextToken());
                q.offer(new Doc(p, i));
                freq[p]++;
            }

            int curMax = 9;
            while (curMax > 0 && freq[curMax] == 0) curMax--;

            int printed = 0;
            while (true) {
                Doc d = q.poll();
                if (d.p == curMax) {
                    printed++;
                    freq[d.p]--;
                    if (d.idx == M) { // 목표 문서 출력됨
                        sb.append(printed).append('\n');
                        break;
                    }
                    while (curMax > 0 && freq[curMax] == 0) curMax--;
                } else {
                    q.offer(d); // 뒤로 보냄
                }
            }
        }

        System.out.print(sb.toString());
    }
}
