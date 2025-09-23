package boj11650;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // n개의 좌표를 저장할 2차원 배열 생성
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken()); // x좌표
            points[i][1] = Integer.parseInt(st.nextToken()); // y좌표
        }

        // Comparator를 사용해서 정렬 기준을 직접 만든다
        Arrays.sort(points, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return p1[1] - p2[1];
            } else {
                return p1[0] - p2[0];
            }
        });

        // 정렬된 결과를 BufferedWriter로 효율적으로 출력
        for (int i = 0; i < n; i++) {
            bw.write(points[i][0] + " " + points[i][1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
