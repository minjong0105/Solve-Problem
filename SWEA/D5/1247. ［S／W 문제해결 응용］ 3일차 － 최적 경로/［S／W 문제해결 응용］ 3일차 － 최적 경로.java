import java.util.*;
import java.io.*;

public class Solution {
    static int N;
    static int companyX, companyY;
    static int homeX, homeY;
    static int[] customersX;
    static int[] customersY;
    static boolean[] visited;
    static int minDistance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            companyX = Integer.parseInt(st.nextToken());
            companyY = Integer.parseInt(st.nextToken());
            homeX = Integer.parseInt(st.nextToken());
            homeY = Integer.parseInt(st.nextToken());

            customersX = new int[N];
            customersY = new int[N];
            for (int i = 0; i < N; i++) {
                customersX[i] = Integer.parseInt(st.nextToken());
                customersY[i] = Integer.parseInt(st.nextToken());
            }

            visited = new boolean[N];
            minDistance = Integer.MAX_VALUE;

            // 백트래킹 시작
            solve(0, companyX, companyY, 0);

            System.out.println("#" + tc + " " + minDistance);
        }
    }

    public static void solve(int count, int currentX, int currentY, int currentDist) {
        // 가지치기: 현재 거리가 이미 최소 거리보다 크거나 같으면 탐색 중단
        if (currentDist >= minDistance) {
            return;
        }

        // 종료 조건: 모든 고객을 방문했을 때
        if (count == N) {
            // 마지막 고객 -> 집까지의 거리 더하기
            currentDist += getDistance(currentX, currentY, homeX, homeY);
            minDistance = Math.min(minDistance, currentDist);
            return;
        }

        // 모든 고객 순회하며 다음 방문할 고객 선택
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int dist = getDistance(currentX, currentY, customersX[i], customersY[i]);
                solve(count + 1, customersX[i], customersY[i], currentDist + dist);
                visited[i] = false; // 백트래킹
            }
        }
    }

    // 두 지점 사이의 맨해튼 거리 계산
    public static int getDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}