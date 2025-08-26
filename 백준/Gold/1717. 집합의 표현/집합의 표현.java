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
            rank[i] = 0;            //rank 초기값은 0
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(num == 0){       //합치기
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

    public static void union(int a, int b) {        //합치기
        int rootA = find(a);
        int rootB = find(b);

        if(rootA != rootB) {                        //A와 B가 서로 다른 집합에 속했을 경우
            if (rank[rootA] > rank[rootB]) {        //A가 B보다 크면
                parent[rootB] = rootA;              //B가 A 아래로
            } else if (rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else {          // rootA == rootB --> 이 경우에는 A, B 누가 루트가 되는지 상관x
                parent[rootB] = rootA;
                rank[rootA]++;
            }
        }
    }

    public static int find(int x) {             //루트 노드 찾는거
        if(x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
}
