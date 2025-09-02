import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> IntKey = new HashMap<>();
        HashMap<String, Integer> StringKey = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            IntKey.put(i, name);
            StringKey.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String s = br.readLine();

            if (isNum(s)) {
                int num = Integer.parseInt(s);
                sb.append(IntKey.get(num)).append("\n");
            } else {
                sb.append(StringKey.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isNum(String s) {
        return Character.isDigit(s.charAt(0));
    }
}
