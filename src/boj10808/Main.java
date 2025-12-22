package boj10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] counts = new int[26];

        // 문자열의 각 문자를 확인하며 개수를 센다
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 'a'를 빼주면 0~25 사이의 인덱스로 변환
            counts[c - 'a']++;
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(counts[i]).append(" ");
        }

        System.out.println(sb.toString());
        br.close();
    }
}