import java.util.*;
import java.io.*;

public class Main {
    static HashMap<String, String> parent; // 사람의 부모 노드 저장
    static HashMap<String, Integer> size; // 사람의 친구 수 저장

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int F = Integer.parseInt(br.readLine());
            parent = new HashMap<>();
            size = new HashMap<>();

            for (int f = 0; f < F; f++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();

                if (!parent.containsKey(a)) {
                    parent.put(a, a);
                    size.put(a, 1);
                }

                if (!parent.containsKey(b)) {
                    parent.put(b, b);
                    size.put(b, 1);
                }

                sb.append(union(a, b)).append('\n');
            }
        }
        System.out.print(sb);
    }

    public static String find(String s) {
        if (s.equals(parent.get(s)))
            return s;

        parent.put(s, find(parent.get(s)));
        return parent.get(s);
    }

    public static int union(String a, String b) {
        String ar = find(a);
        String br = find(b);

        if (ar.equals(br))
            return size.get(ar);

        int as = size.get(ar);
        int bs = size.get(br);

        if (as >= bs) {
            parent.put(br, ar);
            size.put(ar, as + bs);
            return size.get(ar);
        } else {
            parent.put(ar, br);
            size.put(br, as + bs);
            return size.get(br);
        }
    }

}
