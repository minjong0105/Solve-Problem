import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] target = new int[N];
        for (int i = 0; i < N; i++) target[i] = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int next = 1;      // 다음에 push할 숫자
        int idx = 0;       // 만들어야 할 타깃 수열의 인덱스

        while (idx < N) {
            int want = target[idx];

            // 필요하면 원하는 값까지 push
            while (next <= want) {
                stack.push(next++);
                out.append("+\n");
            }

            // 스택 top이 원하는 값이면 pop
            if (!stack.isEmpty() && stack.peek() == want) {
                stack.pop();
                out.append("-\n");
                idx++;
            } else {
                // 더 push할 수도 없고 top도 다름 → 불가능
                System.out.println("NO");
                return;
            }
        }

        System.out.print(out.toString());
    }
}
