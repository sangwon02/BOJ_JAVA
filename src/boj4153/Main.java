package boj4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            // 0 0 0이 들어오면 종료
            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            int[] sides = {x, y, z};
            Arrays.sort(sides); // 오름차순 정렬

            int a = sides[0];
            int b = sides[1];
            int c = sides[2];

            // 피타고라스 확인 (a^2 + b^2 == c^2)
            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        br.close();
    }
}