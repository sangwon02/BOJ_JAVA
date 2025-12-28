package boj1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄에 입력된 4개의 숫자를 공백 기준
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // x축 기준 최소 거리 (0 또는 w까지의 거리 중 작은 값)
        int x_min = Math.min(x, w - x);

        // y축 기준 최소 거리 (0 또는 h까지의 거리 중 작은 값)
        int y_min = Math.min(y, h - y);

        // x축과 y축 최소 거리 중 더 작은 값 출력
        System.out.println(Math.min(x_min, y_min));

        br.close();
    }
}