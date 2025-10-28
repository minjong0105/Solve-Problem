import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static List<int[]> list = new ArrayList<>();
    static boolean find = false;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String s = br.readLine();
            for (int j = 0; j < 9; j++) {
                arr[i][j] = s.charAt(j) - '0';
                if (arr[i][j] == 0) {
                    list.add(new int[] { i, j });
                }
            }
        }

        sudoku(0);

        System.out.println(sb);
    }

    public static void sudoku(int idx) {
        if (find)
            return;

        if (idx == list.size()) {
            find = true;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]);
                }
                sb.append('\n');
            }
            return;
        }

        int r = list.get(idx)[0];
        int c = list.get(idx)[1];

        for (int n = 1; n <= 9; n++) {
            if (can(r, c, n)) {
                arr[r][c] = n;
                sudoku(idx + 1);
                arr[r][c] = 0;
            }
        }
    }

    public static boolean can(int r, int c, int n) {
        // 해당 박스 체크
        int rr = (r / 3) * 3;
        int rc = (c / 3) * 3;
        for (int i = rr; i < rr + 3; i++) {
            for (int j = rc; j < rc + 3; j++) {
                if (arr[i][j] == n) {
                    return false;
                }
            }
        }

        // 가로, 세로 체크
        for (int i = 0; i < 9; i++) {
            if (arr[r][i] == n || arr[i][c] == n)
                return false;
        }

        return true;
    }
}
