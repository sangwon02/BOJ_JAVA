package boj8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String quizResult = br.readLine();
            int totalScore = 0;
            int currentStreak = 0; // 현재 연속 'O' 횟수

            // 문자열을 한 글자씩 확인
            for (int j = 0; j < quizResult.length(); j++) {
                if (quizResult.charAt(j) == 'O') {
                    currentStreak++; // O면 연속 횟수 증가
                    totalScore += currentStreak; // 점수에 더하기
                } else {
                    currentStreak = 0; // X면 0으로 초기화
                }
            }
            sb.append(totalScore).append('\n');
        }

        // 정답 출력
        System.out.print(sb.toString());
        br.close();
    }
}