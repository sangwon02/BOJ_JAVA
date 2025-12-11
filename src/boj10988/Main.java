package boj10988;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str =  br.readLine();

        int len = str.length();
        int result = 1; // 기본적으로 팰린드롬이라고 가정

        for (int i = 0; i < len / 2; i++) {
            // 앞 글자와 뒤 글자가 다르면
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                result = 0; // 팰린드롬이 아님
                break; // 종료
            }
        }

        System.out.println(result);
        br.close();
    }
}
