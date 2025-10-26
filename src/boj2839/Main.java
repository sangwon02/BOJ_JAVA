package boj2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (n >=0 ){ // 남은 설탕의 무게가 0보다 크면 반복

            if (n % 5 == 0) { // 5로 나누어 떨어지면
                cnt += n / 5;  // 5키로 봉지 개수를 더하고
                System.out.println(cnt); // 출력
                return; // 종료

            } else { // 5로 나누어 떨어지지 않으면
                n -= 3;  // 3키로 빼고
                cnt += 1; // 3킬로 봉지 개수 +1
            }
        }

        System.out.print(-1);  // 딱 떨어지게 출력이 불가한 경우

        br.close();

    }
}
