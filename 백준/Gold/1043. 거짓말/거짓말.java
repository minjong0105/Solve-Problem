import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        int[] know = new int[t];
        int root = 0;

        if (t == 0) {
            System.out.println(M);
            return;
        } else if (t != 0) {
            know[0] = Integer.parseInt(st.nextToken());
            root = know[0];

            for (int i = 1; i < t; i++) {
                know[i] = Integer.parseInt(st.nextToken());
                union(know[0], know[i]);
            }

            root = find(root);
        }

        List<List<Integer>> party = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            List<Integer> p = new ArrayList<>();

            if (n > 0) {
                int first = Integer.parseInt(st.nextToken());
                p.add(first);

                for (int j = 1; j < n; j++) {
                    int next = Integer.parseInt(st.nextToken());
                    p.add(next);
                    union(first, next);
                }
            }

            party.add(p);
        }

        int count = 0;

        for (List<Integer> list : party) {
            if (list.isEmpty())
                continue;

            int r = find(list.get(0));

            if (r != find(root)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b) {
        int rA = find(a);
        int rB = find(b);

        if (rA != rB) {
            parent[rB] = rA;
        }
    }
}
