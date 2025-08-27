import java.util.*;
import java.io.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        parent = new int[N + 1]; // 1부터 시작해서 N까지
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int connected = Integer.parseInt(st.nextToken());
                if (connected == 1) { // 연결되어 있으면
                    union(i, j); // 두 노드 합치기
                }
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] plan = new int[M]; // 여행 계획
        for (int i = 0; i < M; i++) {
            plan[i] = Integer.parseInt(st.nextToken());
        }

        boolean possible = true;
        int root = find(plan[0]); // 여행 계획의 첫 번째 도시 루트 노드
        for (int i = 0; i < M; i++) {
            if (find(plan[i]) != root) { // 루트가 다르면 연결되어 있지 않다는거임
                possible = false;
                break;
            }
        }

        System.out.println(possible ? "YES" : "NO");

    }

    // union-find
    static int find(int x) { // 루트 찾기
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]); // 경로 압축
    }

    static void union(int a, int b) { // 두 노드 합치기

        int pa = find(a); // a의 루트 노드
        int pb = find(b); // b의 루트 노드
        if (pa != pb) // 루트 노드가 다르면 합치기
            parent[pb] = pa;
    }
}