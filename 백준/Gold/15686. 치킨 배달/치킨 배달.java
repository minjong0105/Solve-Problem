import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static ArrayList<Point> home;
    static ArrayList<Point> chicken;
    static boolean[] check;
    static int ans = Integer.MAX_VALUE;

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        home = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) {
                    home.add(new Point(i, j));
                } else if (map[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }

        check = new boolean[chicken.size()];

        dfs(0, 0);

        System.out.println(ans);
    }

    static void dfs(int idx, int cnt) {
        if (cnt == M) {
            int sum = 0;

            for (int i = 0; i < home.size(); i++) {
                int min = Integer.MAX_VALUE;

                for (int j = 0; j < chicken.size(); j++) {
                    if (check[j]) {
                        int dist = Math.abs(home.get(i).x - chicken.get(j).x)
                                + Math.abs(home.get(i).y - chicken.get(j).y);
                        min = Math.min(min, dist);
                    }
                }

                sum += min;
            }

            ans = Math.min(ans, sum);
            return;
        }

        for (int i = idx; i < chicken.size(); i++) {
            check[i] = true;
            dfs(i + 1, cnt + 1);
            check[i] = false;
        }
    }
}
