import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= N; i++){            
            list.add(new ArrayList<>());        //인접 리스트 생성
        }

        for(int i = 0; i < M; i++){             //친구 관계 입력
            StringTokenizer st = new StringTokenizer(br.readLine());       
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 0});

        boolean[] visited = new boolean[N + 1];
        visited[1] = true;

        int ans = 0;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int person = cur[0];
            int depth = cur[1];

            if(depth >= 1 && depth <= 2) ans++;
            if(depth == 2) continue;

            for(int j : list.get(person)) {
                if(!visited[j]){
                    visited[j] = true;
                    queue.offer(new int[]{j, depth + 1});
                }
            }
        }
        
        System.out.println(ans);
    }
}