package boj11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        // Comparator를 사용해서 정렬 기준을 직접 만든다
        Arrays.sort(points, (p1, p2) -> {
            // 1. y좌표(p1[1], p2[1])를 먼저 비교한다.
            if (p1[1] == p2[1]) {
                // 2. y좌표가 같다면, x좌표(p1[0], p2[0])를 비교한다.
                return p1[0] - p2[0]; // x좌표 오름차순
            } else {
                // y좌표가 다르다면, y좌표 기준으로 비교한다.
                return p1[1] - p2[1]; // y좌표 오름차순
            }
        });

        // 정렬된 결과를 x, y의 값을 반대로 출력
        for (int i = 0; i < n; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }

        br.close();
    }
}
