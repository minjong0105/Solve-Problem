import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int fibcount;
    static int fibonaccicount;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        fibcount = 0;
        fibonaccicount = 0;

        fib(N);
        fibonacci(N);

        System.out.println(fibcount + " " + fibonaccicount);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            fibcount++;
            return 1;
        } else
            return fib(n - 1) + fib(n - 2);
    }

    public static int fibonacci(int n) {
        int x = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < N; i++) {
            fibonaccicount++;
            dp[i] = dp[i - 1] + dp[i - 2];
            x = dp[i];
        }
        return x;
    }
}
