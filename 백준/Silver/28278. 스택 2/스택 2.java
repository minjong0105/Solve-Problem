import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (!stack.empty()) {
                        int n = stack.pop();
                        sb.append(n).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.empty())
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;
                case 5:
                    if (stack.empty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(stack.peek()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
