package boj10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 팩토리얼을 구하는 재귀함수
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));

        br.close();
    }
}
