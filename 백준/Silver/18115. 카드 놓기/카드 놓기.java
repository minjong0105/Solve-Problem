import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> dq = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            int cmd = arr[N - i];

            switch (cmd) {
                case 1:
                    dq.addFirst(i);
                    break;
                case 2:
                    dq.add(1, i);
                    break;
                case 3:
                    dq.addLast(i);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : dq) {
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }
}
