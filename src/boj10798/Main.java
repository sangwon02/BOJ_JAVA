package boj10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[5][40];
        int maxnum = 0;

        // 배열에 문자열 저장
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            if (line.length() > maxnum) {
                maxnum = line.length();
            }
            for (int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        // 세로로 읽기
        for (int j = 0; j < maxnum; j++) {
            for (int i = 0; i < 5; i++) {
                // board[i][j]가 비어있지 않을때만
                if (board[i][j] != '\0') {
                    sb.append(board[i][j]);
                }
            }
        }

        System.out.println(sb.toString());
        br.close();

    }
}
