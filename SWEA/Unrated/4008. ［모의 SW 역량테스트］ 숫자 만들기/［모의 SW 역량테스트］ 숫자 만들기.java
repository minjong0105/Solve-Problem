import java.util.*;
import java.io.*;

public class Solution {
    static int N;
    static int[] nums;          // 숫자들
    static int[] ops = new int[4]; // +, -, *, /
    static int maxVal, minVal;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) ops[i] = Integer.parseInt(st.nextToken());

            nums = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) nums[i] = Integer.parseInt(st.nextToken());

            maxVal = Integer.MIN_VALUE;
            minVal = Integer.MAX_VALUE;

            dfs(1, nums[0]);                 // idx=1부터 시작, 현재값은 첫 숫자

            System.out.println("#" + tc + " " + (maxVal - minVal));
        }
    }

    static void dfs(int idx, int cur) {
        if (idx == N) {                       // 모든 연산자 배치 완료
            if (cur > maxVal) maxVal = cur;
            if (cur < minVal) minVal = cur;
            return;
        }

        for (int op = 0; op < 4; op++) {
            if (ops[op] == 0) continue;
            ops[op]--;

            int next = cur, b = nums[idx];
            switch (op) {
                case 0: next = cur + b; break;      // +
                case 1: next = cur - b; break;      // -
                case 2: next = cur * b; break;      // *
                case 3:                              // /
                    // 자바 정수 나눗셈: 0쪽으로 절단(truncate toward zero)
                    next = cur / b; 
                    break;
            }

            dfs(idx + 1, next);
            ops[op]++;                               // 백트래킹
        }
    }
}
