import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0; i <= N; i++){        //번호가 1부터 N이니까 N+1 크기로 생성
            g.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g.get(a).add(b);
            g.get(b).add(a);            //무방향 그래프 --> 양쪽 모두 추가
        }

        boolean[] visited = new boolean[N + 1]; //방문 여부 저장 배열
        int ans = 0;

        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 1; i <= N; i++){        //1번부터 N번까지 순회
            if(visited[i]) continue;        //들렸으면 넘어감
            ans++;                          //새로운 연결 요소 시작
            visited[i] = true;              //방문 표시
            q.offer(i);                     //큐에 시작 정점 추가

            //BFS
            while(!q.isEmpty()){
                int cur = q.poll();         //큐에서 하나 꺼냄
                for(int next : g.get(cur)){     //현재 정점에 연결된 모든 이웃 확인
                    if(!visited[next]){         //방문 안했다면 큐에 추가
                        visited[next] = true;
                        q.offer(next);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
