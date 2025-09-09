import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // StringTokenizer 대신 split 사용
        String[] inputs = br.readLine().split(" ");
        
        // 개념적으로 LIS를 추적하는 리스트이므로 lis로 명명
        ArrayList<Integer> lis = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(inputs[i]);

            if (lis.isEmpty() || num > lis.get(lis.size() - 1)) {
                lis.add(num);
            } else {
                int index = Collections.binarySearch(lis, num);
                if (index < 0) {
                    index = -(index + 1);
                }
                lis.set(index, num);
            }
        }

        System.out.print(lis.size());
    }
}