import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		boolean[] plusArr = new boolean[1000001];
		boolean[] minusArr = new boolean[1000001];
		
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input > 0) {
				plusArr[input] = true;
			} else {
				input *= -1;
				minusArr[input] = true;
			}
		}
				
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1000000; i >= 0; i--) {
			if (minusArr[i]) {
				sb.append((i * -1)).append("\n");
			}
		}
		for (int i = 0; i < 1000001; i++) {
			if (plusArr[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}

