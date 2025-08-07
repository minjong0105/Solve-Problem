import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] ans;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ans = new int[M];

        fx(0,1);
    }   
    
    static void fx(int depth, int num){
        if(depth == M){
            for(int i = 0; i < M; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = num; i <= N; i++){
            ans[depth] = i;
            fx(depth + 1, i + 1);
        }
    }
}
