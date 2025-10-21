import java.util.*;
import java.io.*;

public class Main {
    static char[] left;
    static char[] right;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        left = new char[N];
        Arrays.fill(left, '.');
        right = new char[N];
        Arrays.fill(right, '.');

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = st.nextToken().charAt(0) - 'A';
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);
            left[parent] = l;
            right[parent] = r;
        }

        preorder('A');
        sb.append('\n');
        inorder('A');
        sb.append('\n');
        postorder('A');
        sb.append('\n');

        System.out.println(sb);
    }

    public static void preorder(char node) {
        if (node == '.')
            return;

        int idx = node - 'A';
        sb.append(node);
        preorder(left[idx]);
        preorder(right[idx]);
    }

    public static void inorder(char node) {
        if (node == '.')
            return;

        int idx = node - 'A';
        inorder(left[idx]);
        sb.append(node);
        inorder(right[idx]);
    }

    public static void postorder(char node) {
        if (node == '.')
            return;

        int idx = node - 'A';
        postorder(left[idx]);
        postorder(right[idx]);
        sb.append(node);
    }
}
