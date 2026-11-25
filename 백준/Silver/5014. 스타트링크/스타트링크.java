import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] dist = new int[F + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        dist[S] = 0;

        int[] move = new int[]{U, -D};

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == G) break;

            for (int m : move) {
                int next = cur + m;
                if (next < 1 || next > F) continue;
                if (dist[next] != -1) continue;

                dist[next] = dist[cur] + 1;
                q.offer(next);
            }
        }

        if (dist[G] == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(dist[G]);
        }
    }
}
