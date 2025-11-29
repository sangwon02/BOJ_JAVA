package boj2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 요리하는 데 필요한 시간
        int c = Integer.parseInt(br.readLine());

        // 일단 요리 시간을 더한다.
        b += c;

        // 분이 60분을 넘어가면 시로 변환
        if (b >= 60) {
            a += b / 60;
            b %= 60;
        }

        // 시가 24시를 넘어가면 0시부터 다시 시작
        if (a >= 24) {
            a %= 24;
        }

        System.out.println(a + " " + b);
        br.close();
    }
}