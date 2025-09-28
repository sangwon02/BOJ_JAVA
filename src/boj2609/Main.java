package boj2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 유클리드 호제법으로 최대공약수(GCD)를 구하는 함수
    public static int gcd(int a, int b) {
        // 나머지가 0이 되면, 나누는 수(b)가 최대공약수
        if (b == 0) {
            return a;
        }
        // GCD(A, B) = GCD(B, A % B)
        return gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());  // a와 b를 입력 받고
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(gcd(a, b));  // 최대공약수 출력
        System.out.println(a*b/gcd(a, b));  // 최대공배수 출력

        br.close();
    }

}
