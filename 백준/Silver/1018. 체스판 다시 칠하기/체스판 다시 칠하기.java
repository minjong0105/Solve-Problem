import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                board[i][j] = s.charAt(j);
            }
        }

        int ans = 64;
        for(int iStart = 0; iStart <= N - 8; iStart++){
            for(int jStart = 0; jStart <= M - 8; jStart++){
                int W = 0;
                int B = 0;
                for(int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        char now = board[iStart + i][jStart + j];
                        boolean check = ((i + j) & 1) == 0;

                        if(check) {
                            if(now != 'W') W++;
                            if(now != 'B') B++;
                        } else{
                            if(now != 'B') W++;
                            if(now != 'W') B++;
                        }
                    }
                }
                ans = Math.min(ans, Math.min(W, B));
            }
        }
        System.out.println(ans);  
    }
}
