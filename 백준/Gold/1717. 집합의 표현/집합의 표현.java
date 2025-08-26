import java.util.*;
import java.io.*;

public class Main {
    static int[] parent;
    static int[] rank;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        rank = new int[N + 1];

        for(int i = 0; i <= N; i++){
            parent[i] = i;
            rank[i] = 1;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(num == 0){
                union(a, b);
            }else {             //num == 1
                if(find(a) == find(b)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }

    }

    public static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if(rootA > rootB){
            parent[rootB] = rootA;
        }else if(rootA < rootB){
            parent[rootA] = rootB;
        }else{          // rootA == rootB
            parent[rootB] = rootA;
            rank[rootA]++;
        }
    }

    public static int find(int x) {
        if(x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
}
