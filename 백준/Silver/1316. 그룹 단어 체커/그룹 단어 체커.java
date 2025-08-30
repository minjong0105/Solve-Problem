import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        char prev = 0;

        for (char c : word.toCharArray()) {
            if (prev != c) {
                if (visited[c - 'a']) {
                    return false;
                }
                visited[c - 'a'] = true;
            }
            prev = c;
        }
        return true;
    }
}
