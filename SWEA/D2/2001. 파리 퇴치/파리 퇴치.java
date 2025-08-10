import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] board = new int[N][N];

            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < N; j++){
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int ans = 0;
            for(int x = 0; x <= N - M; x++){
                for(int y = 0; y <= N - M; y++){
                    int sum = 0;
                    for(int i = 0; i < M; i++){
                        for(int j = 0; j < M; j++){
                            sum += board[x + i][y + j];
                        }
                    }
                ans = Math.max(ans, sum);
                }
            }
            System.out.println("#" + test_case + " " + ans);
        }
    }
}
