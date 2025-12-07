package boj2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] paper = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());
        int totalArea = 0;

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 색종이 크기만큼 도화지에 표시
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    // 아직 색칠되지 않은 부분이라면
                    if (!paper[i][j]) {
                        paper[i][j] = true;
                        totalArea++;
                    }
                }
            }
        }

        System.out.println(totalArea);
        br.close();
    }
}