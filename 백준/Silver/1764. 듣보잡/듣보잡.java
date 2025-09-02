import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                ans.add(name);
            }
        }

        Collections.sort(ans);

        StringBuilder sb = new StringBuilder();
        sb.append(ans.size()).append("\n");
        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append("\n");
        }

        System.out.print(sb);
    }
}
