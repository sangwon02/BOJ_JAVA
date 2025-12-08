package boj2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 두 개의 세 자리 수를 입력받음
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        // B의 각 자릿수를 추출
        int b1 = B % 10;
        int b2 = (B / 10) % 10;
        int b3 = B / 100;

        // 3곱셈 과정을 순서대로 출력
        System.out.println(A * b1);
        System.out.println(A * b2);
        System.out.println(A * b3);
        System.out.println(A * B);

        br.close();
    }
}