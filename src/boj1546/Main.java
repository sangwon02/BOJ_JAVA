package boj1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double sum = 0;
        double max = 0;

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());

            // 최댓값 갱신
            if (score > max) {
                max = score;
            }

            // 합계 누적
            sum += score;
        }

        System.out.println(((sum / max) * 100.0) / N);

        br.close();
    }
}