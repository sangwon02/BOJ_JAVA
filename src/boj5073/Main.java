package boj5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            // 종료 조건: 0 0 0 이면 끝낸다
            if (num1 == 0 && num2 == 0 && num3 == 0) {
                break;
            }

            int[] sides = {num1, num2, num3};

            Arrays.sort(sides);

            int a = sides[0];
            int b = sides[1];
            int c = sides[2];

            // 삼각형이 될 수 있는지 확인
            if (a == 0 && b == 0 && c == 0){
                System.exit(0);
            }
            else if (c >= a + b) {
                System.out.println("Invalid");
            }
            // 세 변이 모두 같은지 확인
            else if (a == b && b == c) {
                System.out.println("Equilateral");
            }
            // 두 변만 같은지 확인
            else if (a == b || b == c) {
                System.out.println("Isosceles");
            }
            // 모두 다름
            else {
                System.out.println("Scalene");
            }
        }

        br.close();
    }
}