import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N >= 620 && N <= 780) {
            System.out.print("Red");
        } else if (N >= 590 && N < 620) {
            System.out.print("Orange");
        } else if (N >= 570 && N < 590) {
            System.out.print("Yellow");
        } else if (N >= 495 && N < 570) {
            System.out.print("Green");
        } else if (N >= 450 && N < 495) {
            System.out.print("Blue");
        } else if (N >= 425 && N < 450) {
            System.out.print("Indigo");
        } else if (N >= 380 && N < 425) {
            System.out.print("Violet");
        }
    }
}