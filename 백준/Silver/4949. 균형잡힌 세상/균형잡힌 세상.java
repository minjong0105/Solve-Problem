import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s == null) break;          // 안전장치
            if (s.equals(".")) break;      // 종료 조건

            ArrayDeque<Character> st = new ArrayDeque<>();
            boolean ok = true;

            for (int i = 0; i < s.length() && ok; i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[') {
                    st.push(c);
                } else if (c == ')') {
                    if (st.isEmpty() || st.peek() != '(') ok = false;
                    else st.pop();
                } else if (c == ']') {
                    if (st.isEmpty() || st.peek() != '[') ok = false;
                    else st.pop();
                }
                // 다른 문자는 무시
            }

            if (ok && st.isEmpty()) out.append("yes\n");
            else out.append("no\n");
        }

        System.out.print(out.toString());
    }
}
