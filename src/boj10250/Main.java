package boj10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor;
            int room;

            // 1층수 계산 (나머지)
            if (N % H == 0) {
                floor = H;         // 나머지가 0이면 꼭대기 층
                room = N / H;
            } else {
                floor = N % H;  // 나머지가 층수
                room = N / H + 1;
            }

            // 방 번호 조합
            sb.append(floor * 100 + room).append('\n');
        }

        System.out.print(sb.toString());
        br.close();
    }
}