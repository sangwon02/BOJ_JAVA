package boj2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 45분을 뺀다
        m -= 45;

        // 만약 분이 0보다 작아졌다면
        if (m < 0) {
            m += 60; // 60분을 더해주고
            h--;     // 시를 1시간 줄인다

            // 만약 시가 0보다 작아졌다면
            if (h < 0) {
                h = 23; // 23시로 설정
            }
        }

        System.out.println(h + " " + m);
        br.close();
    }
}