import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> line = new ArrayDeque<>();
        Deque<Integer> wait = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            line.offer(Integer.parseInt(st.nextToken()));
        }

        // 간식 받아갈 사람 번호( +1씩)
        int target = 1;

        while (!line.isEmpty()) {
            if (!wait.isEmpty() && wait.peek() == target) { // 대기열 제일 윗사람이 현재 순서일 경우
                wait.pop(); // 대기 공간에서 학생 간식 받고
                target++; // 다음 번호
            } else if (line.peek() == target) { // 기존 웨이팅 사람이 현재 순서일 경우
                line.poll(); // 기존 줄 학생 간식 받고
                target++; // 다음 번호
            } else { // 둘 다 아니면 기존 웨이팅 사람이 대기열로 이동
                wait.push(line.poll());
            }
        }

        while (!wait.isEmpty()) { // 기존 줄 인원 다 빠지면 대기열 사람들 처리
            if (wait.pop() == target) {
                target++;
            } else { // 순서 안맞으면 컷
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
