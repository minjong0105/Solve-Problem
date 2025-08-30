import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalcredit = 0;
        double totalgrade = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String trash = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P"))
                continue;
            totalcredit += credit;

            switch (grade) {
                case "A+":
                    totalgrade += credit * 4.5;
                    break;
                case "A0":
                    totalgrade += credit * 4.0;
                    break;
                case "B+":
                    totalgrade += credit * 3.5;
                    break;
                case "B0":
                    totalgrade += credit * 3.0;
                    break;
                case "C+":
                    totalgrade += credit * 2.5;
                    break;
                case "C0":
                    totalgrade += credit * 2.0;
                    break;
                case "D+":
                    totalgrade += credit * 1.5;
                    break;
                case "D0":
                    totalgrade += credit * 1.0;
                    break;
                case "F":
                    totalgrade += credit * 0.0;
                    break;
            }
        }

        System.out.printf("%.6f\n", totalgrade / totalcredit);
    }

}
