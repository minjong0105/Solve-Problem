import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> S = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();
            if (log.equals("enter"))
                S.add(name);
            else
                S.remove(name);
        }

        List<String> L = new ArrayList<>(S);
        Collections.sort(L, Collections.reverseOrder());

        for (String s : L) {
            System.out.println(s);
        }
    }
}
