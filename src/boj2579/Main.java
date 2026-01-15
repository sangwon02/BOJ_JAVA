package boj2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 계단 점수를 저장할 리스트
        List<Integer> score = new ArrayList<>();
        score.add(0); // index 0 사용 안 함
        for (int i = 1; i <= n; i++) {
            score.add(Integer.parseInt(br.readLine()));
        }

        // i번째 계단까지 올랐을 때 얻을 수 있는 점수의 최댓값
        List<Integer> dp = new ArrayList<>();
        dp.add(0); // index 0 사용 안 함

        // 초기값 설정
        dp.add(score.get(1)); // index 1

        //  1인 경우 예외 처리
        if (n >= 2) {
            dp.add(score.get(1) + score.get(2)); // index 2
        }

        for (int i = 3; i <= n; i++) {
            int val = Math.max(dp.get(i - 2), dp.get(i - 3) + score.get(i - 1)) + score.get(i);
            dp.add(val);
        }

        System.out.println(dp.get(n));
        br.close();
    }
}