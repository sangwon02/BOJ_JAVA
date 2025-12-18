package boj11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String num = br.readLine();

        int sum = 0;


        for (int i = 0; i < n; i++) {
            // 문자열에서 한 글자씩 꺼냄
            char c = num.charAt(i);
            // 문자를 정수로 변환
            int number = Integer.parseInt(c + "");

            sum += number;

        }

        System.out.println( sum);
    }
}