package boj25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalSum = 0;
        double creditSum = 0;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] scoreList = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }

            double gradePoint = 0.0;
            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j])) {
                    gradePoint = scoreList[j];
                    break;
                }
            }

            totalSum += (credit * gradePoint);
            creditSum += credit;
        }

        System.out.printf("%.6f\n", totalSum / creditSum);

        br.close();
    }
}