package boj11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        // 첫 번째 글자 가져오기
        char c = s.charAt(0);

        System.out.println((int)c); // 아스키 코드 값을 출력

        br.close();


    }
}
