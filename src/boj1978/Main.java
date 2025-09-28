package boj1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        // 2부터 num의 제곱근까지만 확인한다.
        // i <= Math.sqrt(num) 과 같지만, i*i <= num 이 연산이 더 빠름
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

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
