package boj10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 생성
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 0번 인덱스에는 1번 공을 저장
        }

        // 공 교환
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1; // 인덱스는 0부터 시작하므로 -1
            int j = Integer.parseInt(st.nextToken()) - 1;

            // 두 바구니의 공 교환
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int ball : baskets) {
            sb.append(ball).append(" ");
        }

        System.out.println(sb.toString().trim());
        br.close();
    }
}