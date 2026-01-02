package boj2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            // 25
            int quarter = C / 25;
            C %= 25;

            // 10
            int dime = C / 10;
            C %= 10;

            // 5
            int nickel = C / 5;
            C %= 5;

            // 1
            int penny = C / 1;
            C %= 1;

            // 답 저장
            sb.append(quarter).append(" ")
                    .append(dime).append(" ")
                    .append(nickel).append(" ")
                    .append(penny).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}