package boj1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPrime(int num) {
        // 1은 소수가 아니므로 false
        if (num < 2) {
            return false;
        }

        // 2부터 num-1까지의 수로 나누어 본다
        for (int i = 2; i < num; i++) {
            // 만약 나누어떨어지는 수가 있다면, 약수가 더 있다는 뜻이므로 소수가 아니다.
            if (num % i == 0) {
                return false;
            }
        }

        // 반복문이 끝날 때까지 나누어떨어지지 않았다면 소수
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int res = 0; // 답을 담을 변수

        // n개의 정수를 순서대로 탐색
        for (int i = 0; i < n; i++){
            // 만약 소수라면
            if(isPrime(Integer.parseInt(st.nextToken()))) {
                res++;  // res의 값 +1
            }
        }
        System.out.println(res);  // 답 출력

        br.close();
    }
}
