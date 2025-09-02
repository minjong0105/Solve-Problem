import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = 0;
        for (int i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, x);
                x++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
