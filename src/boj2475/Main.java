package boj2475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sumOfSquares = 0; // 제곱의 합을 저장할 변수

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 각 숫자를 제곱해서 sumOfSquares에 더한다.
            sumOfSquares += (num * num);
        }

        // 최종 합계를 10으로 나눈 나머지를 계산한다.
        int verificationNum = sumOfSquares % 10;

        // 검증수를 출력
        System.out.println(verificationNum);

        br.close();
    }
}