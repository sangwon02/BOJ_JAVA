package boj1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 변수 선언
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 약수들을 하나씩 읽으면서 최댓값과 최솟값 갱신
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // N = 최솟값 * 최댓값
        System.out.println(max * min);

        br.close();
    }
}