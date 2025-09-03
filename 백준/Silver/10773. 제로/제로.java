import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int ans = 0;
        for (int i : stack) {
            ans += i;
        }
        System.out.println(ans);
    }
}
