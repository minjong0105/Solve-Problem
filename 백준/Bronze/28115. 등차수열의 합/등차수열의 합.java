import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        // 1. N이 2 이하이면 항상 YES
        if (N <= 2) {
            System.out.println("YES");
            // B는 0으로 이루어진 수열, C는 A 수열을 출력
            for (int i = 0; i < N; i++) {
                System.out.print("0 ");
            }
            System.out.println();
            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
            return;
        }

        // 2. N > 2일 때, A가 등차수열인지 판별
        long diff = A[1] - A[0];
        boolean isArithmetic = true;
        for (int i = 2; i < N; i++) {
            if (A[i] - A[i - 1] != diff) {
                isArithmetic = false;
                break;
            }
        }

        // 3. 결과 출력
        if (isArithmetic) {
            System.out.println("YES");
            for (int i = 0; i < N; i++) {
                System.out.print("0 ");
            }
            System.out.println();
            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }

}