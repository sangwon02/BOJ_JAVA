package boj2744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // 대문자면 소문자로 변환
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            // 소문자라면 대문자로 변환
            else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
            else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}