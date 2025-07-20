import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            String[][] result = new String[N][3];

            for (int i = 0; i < N; i++) {
                StringBuilder rotate90 = new StringBuilder();
                StringBuilder rotate180 = new StringBuilder();
                StringBuilder rotate270 = new StringBuilder();

                for (int j = 0; j < N; j++) {
                    rotate90.append(matrix[N - 1 - j][i]);
                    rotate180.append(matrix[N - 1 - i][N - 1 - j]);
                    rotate270.append(matrix[j][N - 1 - i]);
                }

                result[i][0] = rotate90.toString();
                result[i][1] = rotate180.toString();
                result[i][2] = rotate270.toString();
            }

            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                System.out.println(result[i][0] + " " + result[i][1] + " " + result[i][2]);
            }
        }
    }
}
