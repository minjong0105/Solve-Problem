import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String cat = st.nextToken();
                map.put(cat, map.getOrDefault(cat, 0) + 1);
            }

            int result = 1;
            for (int i : map.values()) {
                result *= i + 1;
            }

            sb.append(result - 1).append('\n');
        }

        System.out.print(sb);
    }
}

/*
 * 입력받는 정보를 HashMap<String, Integer> 형식으로 받음
 * 종류 당 몇 가지 옷을 가지는지 저장하고 경우의 수를 계산하면 됨
 * !!같은 이름을 가진 의상은 존재하지 않는다!! << 이거 때문에 하나의 의상 종류에 몇 가지 옷을 가지는지만 저장하면 됨
 * 
 * getOrDefault : 해당 키가 있으면 값을 반환, 없으면 기본값(0)을 반환
 */