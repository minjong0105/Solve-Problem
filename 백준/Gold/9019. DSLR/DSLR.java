import java.util.*;
import java.io.*;

public class Main {
    static class state {
        int num;
        String cmd;

        state(int num, String cmd) {
            this.num = num;
            this.cmd = cmd;
        }
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(bfs(A, B)).append('\n');
        }

        System.out.println(sb);
    }

    public static String bfs(int start, int end) {
        Queue<state> q = new LinkedList<>();
        boolean[] visited = new boolean[10000];

        q.offer(new state(start, ""));
        visited[start] = true;

        while (!q.isEmpty()) {
            state cur = q.poll();
            int n = cur.num;
            String s = cur.cmd;

            if (n == end) {
                return s;
            }

            int nextN = (n * 2) % 10000;
            if (!visited[nextN]) {
                visited[nextN] = true;
                q.offer(new state(nextN, s + "D"));
            }

            if (n == 0)
                nextN = 9999;
            else
                nextN = n - 1;
            if (!visited[nextN]) {
                visited[nextN] = true;
                q.offer(new state(nextN, s + "S"));
            }

            nextN = (n * 10) % 10000 + n / 1000;
            if (!visited[nextN]) {
                visited[nextN] = true;
                q.offer(new state(nextN, s + "L"));
            }

            nextN = (n % 10) * 1000 + n / 10;
            if (!visited[nextN]) {
                visited[nextN] = true;
                q.offer(new state(nextN, s + "R"));
            }
        }

        return "";
    }
}
