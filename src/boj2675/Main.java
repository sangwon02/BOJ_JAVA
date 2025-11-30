package boj2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            // 문자열 S의 각 문자를 확인
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);

                // 각 문자를 R번 반복해서 추가
                for (int k = 0; k < R; k++) {
                    sb.append(c);
                }
            }
            // 한 테스트 케이스가 끝나면 줄바꿈
            sb.append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}