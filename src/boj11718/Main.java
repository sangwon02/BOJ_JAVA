package boj11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        // 문자열을 입력 받고(null값이면 종료)
        while ((str = br.readLine()) != null) {
            System.out.println(str); // 문자열 출력
        }

        br.close();

    }
}
