import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int gapLeft = B - A - 1;
            int gapRight = C - B - 1;

            int maxMoves = Math.max(gapLeft, gapRight);

            System.out.println(maxMoves);
        }
        
        sc.close();
    }
}