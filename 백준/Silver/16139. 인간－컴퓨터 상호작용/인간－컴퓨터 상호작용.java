import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[][] arr = new int[26][s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            for (int j = 0; j < 26; j++) {
                arr[j][i + 1] = arr[j][i];
            }
            arr[idx][i + 1] = arr[idx][i] + 1;
        }

        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            sb.append(arr[a - 'a'][r + 1] - arr[a - 'a'][l]).append('\n');
        }

        System.out.print(sb);
    }
}
