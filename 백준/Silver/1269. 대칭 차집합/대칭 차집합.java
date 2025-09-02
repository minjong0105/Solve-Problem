import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int ans = 0;
        int ASize = A.size();
        int BSize = B.size();

        for (int i : B) {
            if (A.contains(i))
                ASize--;
        }

        for (int i : A) {
            if (B.contains(i))
                BSize--;
        }

        ans = ASize + BSize;
        System.out.println(ans);
    }
}
