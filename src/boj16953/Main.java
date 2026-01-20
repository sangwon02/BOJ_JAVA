package boj16953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // b를 a로 바꾸자
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 1;

        while (b != a) {

            // a보다 작아지면 실패
            if (b < a) {
                cnt = -1;
                break;
            }

            // 끝자리가 1인 경우 1을 뗀다
            if (b % 10 == 1) {
                b -= 1;
                b /= 10;
            } else if (b % 2 == 0) { // 짝수면 2로 나눔
                b /= 2;
            } else {
                cnt = -1;
                break;
            }

            cnt++;
        }

        System.out.println(cnt);

    }
}
