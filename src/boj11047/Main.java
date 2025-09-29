package boj11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 동전 종류의 개수
        int k = Integer.parseInt(st.nextToken());

        // n개의 동전 값을 저장할 배열 생성
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0; // 필요한 동전의 총 개수

        // 배열의 맨 뒤부터 앞으로 순회
        for (int i = n - 1; i >= 0; i--) {

            // 현재 동전의 가치가 k보다 작거나 같으면 사용할 수 있음
            if (coins[i] <= k) {
                // 현재 동전으로 지불할 수 있는 최대 개수를 구하고
                cnt += (k / coins[i]);

                // 남은 금액을 계산한다
                k = k % coins[i];
            }
        }

        System.out.println(cnt);

        br.close();
    }
}