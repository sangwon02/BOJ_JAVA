package boj2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        // 곱한 결과를 문자열로 변환
        int result = a * b * c;
        String str = String.valueOf(result);

        // 0~9까지 숫자의 개수를 저장할 배열
        int[] counts = new int[10];

        // 문자열을 한 글자씩 확인하며 개수를 센다.
        for (int i = 0; i < str.length(); i++) {
            // 문자 '0'을 빼서 정수 0~9로 변환
            int digit = str.charAt(i) - '0';
            counts[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }

        br.close();
    }
}